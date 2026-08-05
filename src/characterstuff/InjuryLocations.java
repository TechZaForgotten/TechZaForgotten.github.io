package characterstuff;

public enum InjuryLocations {
    NONE("None", "No Injury", 1.0),
    HEAD("Head", "Perception", 1.3),
    BODY("Body", "Stamina", 1.25),
    LEFT_ARM("Left Arm", "Damage", 1.0),
    RIGHT_ARM("Right Arm", "Damage", 1.0),
    LEFT_LEG("Left Leg", "Speed", 1.0),
    RIGHT_LEG("Right Leg", "Speed", 1.0),
    ;

    public final String name;
    public final String stats;
    public final double recoveryTimeMultiplier;

    InjuryLocations(String name, String stats, double recoveryTimeMultiplier) {
        this.name = name;
        this.stats = stats;
        this.recoveryTimeMultiplier = recoveryTimeMultiplier;
    }
}
