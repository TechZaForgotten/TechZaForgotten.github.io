const rollButton = document.getElementById('rollBtn');
const logWindow = document.getElementById('logWindow');

function rollSingleDieType(count, sides) {
    let subTotal = 0;
    let rolls = [];
    for (let i = 0; i < count; i++) {
        let roll = Math.floor(Math.random() * sides) + 1;
        subTotal += roll;
        rolls.push(roll);
    }
    return { subTotal, rolls };
}

rollButton.addEventListener('click', () => {
    const d4 = parseInt(document.getElementById('d4Count').value) || 0;
    const d6 = parseInt(document.getElementById('d6Count').value) || 0;
    const d8 = parseInt(document.getElementById('d8Count').value) || 0;
    const d10 = parseInt(document.getElementById('d10Count').value) || 0;
    const d12 = parseInt(document.getElementById('d12Count').value) || 0;
    const d20 = parseInt(document.getElementById('d20Count').value) || 0;
    const d100 = parseInt(document.getElementById('d100Count').value) || 0;
    const modifier = parseInt(document.getElementById('globalMod').value) || 0;

    if (d4 === 0 && d6 === 0 && d8 === 0 && d10 === 0 && d12 === 0 && d20 === 0 && d100 === 0 && modifier === 0) {
        alert("Please enter at least one die or a modifier to roll!");
        return;
    }

    let grandTotal = 0;
    let breakdownHTML = "";
    let formulaParts = [];

    const dicePool = [
        { count: d4, sides: 4 },
        { count: d6, sides: 6 },
        { count: d8, sides: 8 },
        { count: d10, sides: 10 },
        { count: d12, sides: 12 },
        { count: d20, sides: 20 },
        { count: d100, sides: 100 }
    ];


    dicePool.forEach(die => {
        if (die.count > 0) {
            formulaParts.push(`${die.count}d${die.sides}`);
            const result = rollSingleDieType(die.count, die.sides);
            
            grandTotal += result.subTotal;
            breakdownHTML += `<strong>d${die.sides}:</strong> [ ${result.rolls.join(', ')} ] (total: ${result.subTotal})<br>`;
        }
    });

    grandTotal += modifier;
    if (modifier > 0) formulaParts.push(`+${modifier}`);
    if (modifier < 0) formulaParts.push(`${modifier}`);

    const fullFormula = formulaParts.join(' + ');

    const logEntry = document.createElement('div');
    logEntry.className = 'roll-entry';
    logEntry.innerHTML = `
        <strong>Dices ya rolled:</strong> <span style="color: #4caf50;">${fullFormula}</span><br>
        ${breakdownHTML}
        <strong>Modifier:</strong> ${modifier}<br>
        <strong>THE TOTAL:</strong> <span style="color: #ff4500; font-size: 18px; font-weight: bold;">${grandTotal}</span>
    `;

    logWindow.appendChild(logEntry);
    logWindow.scrollTop = logWindow.scrollHeight;
});
