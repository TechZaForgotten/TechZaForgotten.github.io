package itemstuff;

public enum ItemPrefix {
    STANDARD("Standard", 1.0, 1.0, 1.0),
    SHARP("Sharp", 1.2, 1.0, 1.2),
    BRITTLE("Brittle", 1.0 , 0.8 , 0.8 ),
    BROKEN("Broken", 0.0 , 0.0 , 0.0 ),
    HEAVY("Heavy", 1.1 , 1.2 , 1.3 ),
    LIGHT("Light", 1.2 , 1.1 , 1.3 ),
    UNSTABLE("Unstable", 0.5 , 0.1 , 0.4 ),
    DURABLE("Durable", 1.0 , 1.2 , 1.2 ),
    RUSTED("Rusted", 0.5 , 0.5 , 0.0 ),
    ;

    public final String name;
    public final double damageMultiplier;
    public final double durabilityMultiplier;
    public final double costMultiplier;


    ItemPrefix(String name, double damageMultiplier, double durabilityMultiplier, double costMultiplier) {
        this.name = name;
        this.damageMultiplier = damageMultiplier;
        this.durabilityMultiplier = durabilityMultiplier;
        this.costMultiplier = costMultiplier;
    }
}
