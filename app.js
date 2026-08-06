// 1. Target the interactive elements on the page
const rollButton = document.getElementById('rollBtn');
const diceCountInput = document.getElementById('diceCount');
const diceTypeSelect = document.getElementById('diceType');
const modifierInput = document.getElementById('modifier');
const logWindow = document.getElementById('logWindow');

// 2. The core dice rolling math engine
function rollDice(count, sides, modifier) {
    let total = 0;
    let individualRolls = [];

    for (let i = 0; i < count; i++) {
        // Generates a random number from 1 up to the number of sides (e.g., 1 to 20)
        let roll = Math.floor(Math.random() * sides) + 1;
        total += roll;
        individualRolls.push(roll);
    }

    // Apply the static modifier (+5, -2, etc.) to the grand total
    let finalTotal = total + modifier;

    return {
        individualRolls: individualRolls,
        diceTotal: total,
        finalTotal: finalTotal
    };
}

// 3. Listen for clicks on the EXECUTE button
rollButton.addEventListener('click', () => {
    // Read the inputs and convert string text into active numbers
    const count = parseInt(diceCountInput.value) || 1;
    const sides = parseInt(diceTypeSelect.value);
    const modifier = parseInt(modifierInput.value) || 0;

    // Run the rolling engine logic
    const results = rollDice(count, sides, modifier);

    // Format the modifier text cleanly for the log display (e.g., "+ 5" or "- 2")
    let modText = "";
    if (modifier > 0) modText = ` + ${modifier}`;
    if (modifier < 0) modText = ` - ${Math.abs(modifier)}`;

    // 4. Construct the log entry and print it to the window screen
    const logEntry = document.createElement('div');
    logEntry.className = 'roll-entry';
    logEntry.innerHTML = `
        <strong>Rolled:</strong> ${count}d${sides}${modText}<br>
        <strong>Dice:</strong> [ ${results.individualRolls.join(', ')} ] (Sum: ${results.diceTotal})<br>
        <strong>TOTAL:</strong> <span style="color: #ff4500; font-size: 16px;">${results.finalTotal}</span>
    `;

    // Append to the window and auto-scroll downwards
    logWindow.appendChild(logEntry);
    logWindow.scrollTop = logWindow.scrollHeight;
});
