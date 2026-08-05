// 1. Tell the computer to listen to the HTML button and input box
const rollButton = document.getElementById('rollBtn');
const diceInput = document.getElementById('diceCount');
const logWindow = document.getElementById('logWindow');

// 2. Put your D&D calculation logic inside a function
function rollMassDice(count) {
    let total = 0;
    let individualRolls = [];

    for (let i = 0; i < count; i++) {
        // Roll a random number between 1 and 6
        let roll = Math.floor(Math.random() * 6) + 1; 
        total += roll;
        individualRolls.push(roll);
    }

    return { total, individualRolls };
}

// 3. Trigger this code when the player clicks the button
rollButton.addEventListener('click', () => {
    // Get the number the user typed in
    const numberOfDice = parseInt(diceInput.value); 
    
    // Run our calculator logic
    const result = rollMassDice(numberOfDice); 
    
    // 4. Update the "Window" on the screen so the player sees it
    logWindow.innerHTML += `<p> Rolled ${numberOfDice}d6! Results: [${result.individualRolls.join(', ')}] <strong>Total: ${result.total}</strong></p>`;
    
    // Auto-scroll the log window to the bottom
    logWindow.scrollTop = logWindow.scrollHeight; 
});
