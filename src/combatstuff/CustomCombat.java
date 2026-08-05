package combatstuff;

public class CustomCombat {
    private final String name;
    public final String creator;
    private final String style;
    private final String mastery;
    private final String type;
    private final String power;
    private final String rank;

    private final int hoursRequired;
    private final int effectAmount;
    private final int attackAmount;

    private final double finalChakraCost;
    private final double finalStaminaCost;
    private final double finalSpeed;
    private final double finalBaseDamage;

    private final int[] diceAmount;

    public CustomCombat(String name, String creator, String style, String mastery, String type, String power, String rank, int hoursRequired, int effectAmount, int attackAmount, double finalChakraCost, double finalStaminaCost, double finalSpeed, double finalBaseDamage, int[] diceAmount) {
        this.name = name;
        this.creator = creator;
        this.style = style;
        this.mastery = mastery;
        this.type = type;
        this.power = power;
        this.rank = rank;
        this.hoursRequired = hoursRequired;
        this.effectAmount = effectAmount;
        this.attackAmount = attackAmount;
        this.finalChakraCost = finalChakraCost;
        this.finalStaminaCost = finalStaminaCost;
        this.finalSpeed = finalSpeed;
        this.finalBaseDamage = finalBaseDamage;
        this.diceAmount = diceAmount;
    }

    public void displayInfo() {
        String[] diceLabels = {"d4", "d6", "d8", "d10", "d12", "d20", "d48", "d100"};
        StringBuilder diceString = new StringBuilder();

        StringBuilder effectString = new StringBuilder();

        StringBuilder attackAmountString = new StringBuilder();

        StringBuilder finalChakraCostString = new StringBuilder();

        if (effectAmount > 0) {
            effectString.append(effectAmount);
        }

        String finalEffectString = effectAmount > 0 ? effectString.toString().trim() : "None";

        if (attackAmount > 1) {
            attackAmountString.append("Number of Attacks: ").append(attackAmount).append("%n").append("========================================%n");
        }

        String finalAttackAmountString = attackAmount > 1 ? attackAmountString.toString().trim() : "========================================%n";

        if (finalChakraCost == 0) {
            finalChakraCostString.append("");
        }

        String finalFinalChakraCostString = finalChakraCost == 0 ? finalChakraCostString.toString().trim() : finalChakraCostString.append("Chakra:    ").append(finalChakraCost).append(" | ").toString();

        for (int i = 0; i < diceAmount.length; i++) {
            if (diceAmount[i] > 0) {
                diceString.append(diceAmount[i]).append("x").append(diceLabels[i]).append(" ");
            }
        }
        String finalDiceString = diceString.length() > 0 ? diceString.toString().trim() : "None";

        System.out.printf("========================================%n" +
                "Skill:     %s%n" +
                "Style:     %s%n" +
                "Rank:      %s | Hours Required: %d%n" +
                "Creator:   %s%n" +
                "========================================%n" +
                "Mastery:   %s | Power: %s | Type: %s%n" +
                finalFinalChakraCostString + "Stamina: %.0f%n" +
                finalAttackAmountString +
                "Speed:     %.0f | Effects: %s%n" +
                "Base DMG:  %s%n" +
                "Dice DMG:  %s%n" +
                "========================================%n",
                name, style, rank, hoursRequired, creator, mastery, power, type, finalStaminaCost,
                finalSpeed, finalEffectString, finalBaseDamage, finalDiceString
                );
    }

}
