package combatstuff;

public enum CombatTypes {
    NONE("None", 1.0, 1.0, 0),
    ATTACK("Attack", 1.0, 1.0, 25),
    FEINT("Feint", 1.2, 1.8, 27),
    BLOCK("Block", 0.5, 1.0, 30),
    GRAPPLE("Grapple", 1.25, 1.0, 25),
    COUNTER("Counter", 2.0, 1.25, 30),
    PARRY("Parry", 1.5, 1.5, 25),
    DISARM("Disarm",2.5, 1.0, 25),;

    public final String name;
    public final double staminaMultiplier;
    public final double damageMultiplier;
    public final int minimumStamina;

    CombatTypes(String name, double staminaMultiplier, double damageMultiplier, int minimumStamina) {
        this.name = name;
        this.staminaMultiplier = staminaMultiplier;
        this.damageMultiplier = damageMultiplier;
        this.minimumStamina = minimumStamina;
    }
}
