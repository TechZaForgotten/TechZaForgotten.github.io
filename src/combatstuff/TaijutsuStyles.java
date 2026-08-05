package combatstuff;

public enum TaijutsuStyles {
    UNTRAINED("Untrained", CombatPower.NONE, CombatTypes.NONE, CombatTypes.NONE, 1.0, 1.0, 1.0, 1.0, 5),
    TRAINED("Trained", CombatPower.MEDIUM, CombatTypes.ATTACK, CombatTypes.BLOCK, 1.2, 1.2, 1.2, 1.2, 5),
    BOXING("Boxing", CombatPower.LIGHT, CombatTypes.ATTACK, CombatTypes.FEINT , 1.0, 1.2, 1.3, 1.5, 5),
    MARTIAL_ARTS("Martial Arts",CombatPower.MEDIUM ,CombatTypes.ATTACK, CombatTypes.DISARM, 1.2, 1.1, 1.5, 1.3, 5),
    MUAY_THAI("Muay Thai", CombatPower.HEAVY, CombatTypes.ATTACK, CombatTypes.GRAPPLE, 1.5, 1.3, 1.4, 1.4, 10),
    PIERCING_FIST("Piercing Fist", CombatPower.LIGHT, CombatTypes.ATTACK, CombatTypes.COUNTER, 1.5, 1.3, 1.5, 1.6, 10),
    GENTLE_FIST("Gentle Fist", CombatPower.CHAKRA_LIGHT, CombatTypes.ATTACK, CombatTypes.PARRY, 1.3, 1.1, 1.6, 1.4, 5),
    ROTATIONS("Rotations", CombatPower.CHAKRA_HEAVY, CombatTypes.ATTACK, CombatTypes.COUNTER, 1.5, 1.3, 1.3, 1.6, 10),
    FISTS_OF_A_FLOWER("Fists Of A Flower", CombatPower.CHAKRA_MEDIUM, CombatTypes.ATTACK, CombatTypes.FEINT, 1.3, 1.3, 1.5, 1.3, 10),
    BREAKER("Breaker", CombatPower.HEAVY, CombatTypes.ATTACK, CombatTypes.ATTACK, 1.6, 1.5, 1.2, 1.6, 5),
    PRECISION("Precision", CombatPower.LIGHT, CombatTypes.DISARM, CombatTypes.COUNTER, 1.5, 1.3, 1.7, 1.6, 5),
    PACIFIST("Pacifist", CombatPower.HEAVY, CombatTypes.GRAPPLE, CombatTypes.BLOCK, 1.5, 1.6, 1.2, 1.4, 5),
    EGOIST("Egoist", CombatPower.HEAVY, CombatTypes.ATTACK, CombatTypes.DISARM, 1.6, 1.6, 1.3, 1.6, 5),
    BEAST_HUMAN("Beast Human", CombatPower.CHAKRA_LIGHT, CombatTypes.ATTACK, CombatTypes.PARRY, 1.5, 1.2, 1.6, 1.4, 5)
    ;

    public final String name;
    public final CombatPower preferredPower;
    public final CombatTypes preferredType1;
    public final CombatTypes preferredType2;
    public final double staminaCostMultiplier;
    public final double chakraCostMultiplier;
    public final double speedMultiplier;
    public final double damageMultiplier;
    public final int maxDistance;

    TaijutsuStyles(String name, CombatPower preferredPower, CombatTypes preferredType1, CombatTypes preferredType2, double staminaCostMultiplier, double chakraCostMultiplier, double speedMultiplier, double damageMultiplier, int maxDistance) {
        this.name = name;
        this.preferredPower = preferredPower;
        this.preferredType1 = preferredType1;
        this.preferredType2 = preferredType2;
        this.staminaCostMultiplier = staminaCostMultiplier;
        this.chakraCostMultiplier = chakraCostMultiplier;
        this.speedMultiplier = speedMultiplier;
        this.damageMultiplier = damageMultiplier;
        this.maxDistance = maxDistance;
    }
}
