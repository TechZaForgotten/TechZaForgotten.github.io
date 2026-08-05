package combatstuff;

public enum CombatPower {
    NONE("None", 1.0, 1.0, 1.0, 0, 0),
    LIGHT("Light", 0.8, 1.2, 0.8, 0, 5),
    MEDIUM("Medium", 1.0 , 1.0 , 1.0, 0, 7),
    HEAVY("Heavy", 1.2 , 0.8 , 1.2, 0, 9),
    CHAKRA_LIGHT("Chakra(light)", 0.8 , 1.2, 1.0, 25, 6),
    CHAKRA_MEDIUM("Chakra(medium)", 1.0 , 1.0, 1.2, 50, 8),
    CHAKRA_HEAVY("Chakra(heavy)", 1.2 , 0.8, 1.4, 75, 10);

    public final String name;
    public final double staminaMultiplier;
    public final double speedMultiplier;
    public final double damageMultiplier;
    public final int minChakra;
    public final int minDamage;

    CombatPower(String name, double staminaMultiplier, double speedMultiplier, double damageMultiplier, int minChakra, int minDamage) {
        this.name = name;
        this.staminaMultiplier = staminaMultiplier;
        this.speedMultiplier = speedMultiplier;
        this.damageMultiplier = damageMultiplier;
        this.minChakra = minChakra;
        this.minDamage = minDamage;
    }
}
