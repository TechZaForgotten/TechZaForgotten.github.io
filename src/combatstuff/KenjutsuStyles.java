package combatstuff;

public enum KenjutsuStyles {
    UNTRAINED("Untrained", CombatPower.NONE, CombatTypes.NONE, CombatTypes.NONE, 1.0, 1.0, 1.0, 1.0),
    TRAINED("Trained", CombatPower.MEDIUM, CombatTypes.ATTACK, CombatTypes.BLOCK, 1.2, 1.2, 1.2, 1.2),
    ONE_SWORD_STYLE("One Sword Style", CombatPower.MEDIUM, CombatTypes.ATTACK, CombatTypes.BLOCK, 1.3, 1.3, 1.3, 1.5),
    TWO_SWORD_STYLE("Two Sword Style", CombatPower.MEDIUM, CombatTypes.ATTACK, CombatTypes.COUNTER, 1.5, 1.5, 1.5, 1.5),
    DUAL_SAGE_STYLE("Caution's Two Sword Style", CombatPower.CHAKRA_LIGHT, CombatTypes.ATTACK, CombatTypes.COUNTER, 1.5, 1.2, 1.6, 1.7),
    GREATSWORD_STYLE("Greatsword Style", CombatPower.HEAVY, CombatTypes.ATTACK, CombatTypes.BLOCK, 2.0, 1.5, 0.8, 2.0),
    CHAIN_WHIP_STYLE("Chain Whip Style", CombatPower.CHAKRA_LIGHT, CombatTypes.ATTACK, CombatTypes.GRAPPLE, 0.9, 1.5, 2.0, 1.5),
    BO_STAFF_STYLE("Bo Staff Style", CombatPower.MEDIUM, CombatTypes.ATTACK, CombatTypes.PARRY, 1.3, 1.3, 1.5, 1.3),
    ENMA_STYLE("Enma Style", CombatPower.CHAKRA_MEDIUM, CombatTypes.DISARM, CombatTypes.COUNTER, 1.2, 1.1, 2.0, 2.5),
    GAUNTLET_STYLE("Gauntlet Style", CombatPower.MEDIUM, CombatTypes.ATTACK, CombatTypes.FEINT, 0.8, 1.2, 1.1, 1.1),
    SHORT_BOW_STYLE("Short Bow Style", CombatPower.HEAVY, CombatTypes.ATTACK, CombatTypes.BLOCK, 1.5, 1.0, 1.75, 1.25),
    LONG_BOW_STYLE("Long Bow Style", CombatPower.HEAVY, CombatTypes.ATTACK, CombatTypes.BLOCK, 1.75, 1.0, 1.25, 1.75),
    CHAKRA_BOW_STYLE("Chakra Bow Style", CombatPower.CHAKRA_HEAVY, CombatTypes.ATTACK, CombatTypes.ATTACK, 1.0, 1.75, 1.75, 1.75),
    MALLET_STYLE("Mallet Style", CombatPower.LIGHT, CombatTypes.ATTACK, CombatTypes.PARRY, 1.2, 1.2, 1.75, 1.3),
    WAR_HAMMER_STYLE("War Hammer Style", CombatPower.HEAVY, CombatTypes.ATTACK, CombatTypes.ATTACK, 2.0, 1.5, 0.8, 2.0),
    MOCHI_POUNDER_STYLE("Mochira's Mallet Style", CombatPower.CHAKRA_HEAVY, CombatTypes.ATTACK, CombatTypes.COUNTER, 1.5, 1.5, 1.75, 1.75),
    CLAW_STYLE("Claw Style", CombatPower.LIGHT, CombatTypes.ATTACK, CombatTypes.ATTACK, 1.0, 1.2, 1.5, 1.5),
    DAGGER_STYLE("Dagger Style", CombatPower.LIGHT, CombatTypes.ATTACK, CombatTypes.PARRY, 1.2, 1.2, 1.5, 1.3),
    DUAL_DAGGER_STYLE("Dual Dagger Style", CombatPower.LIGHT, CombatTypes.ATTACK, CombatTypes.COUNTER, 1.4, 1.4, 1.7, 1.3)
    ;

    public final String name;
    public final CombatPower preferredPower;
    public final CombatTypes preferredType1;
    public final CombatTypes preferredType2;
    public final double staminaCostMultiplier;
    public final double chakraCostMultiplier;
    public final double speedMultiplier;
    public final double damageMultiplier;

    KenjutsuStyles(String name, CombatPower preferredPower, CombatTypes preferredType1, CombatTypes preferredType2, double staminaCostMultiplier, double chakraCostMultiplier, double speedMultiplier, double damageMultiplier) {
        this.name = name;
        this.preferredPower = preferredPower;
        this.preferredType1 = preferredType1;
        this.preferredType2 = preferredType2;
        this.staminaCostMultiplier = staminaCostMultiplier;
        this.chakraCostMultiplier = chakraCostMultiplier;
        this.speedMultiplier = speedMultiplier;
        this.damageMultiplier = damageMultiplier;
    }
}
