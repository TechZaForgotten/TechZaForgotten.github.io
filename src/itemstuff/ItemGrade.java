package itemstuff;

public enum ItemGrade {
    LOW_TIER("Low Tier", "1 Star", 0.5, 0.8),
    BASIC("Basic", "2 Star", 1.0, 1.0),
    HIGH_TIER("High Tier", "3 Star", 2.0, 4.0),
    SUPREME_GRADE("Supreme Grade", "4 Star", 4.0, 8.0),
    LEGENDARY_GRADE("Legendary Grade", "5 Star", 8.0, 16.0)
    ;

    public final String name;
    public final String altName;
    public final double multiplier;
    public final double costMultiplier;

    ItemGrade(String name, String altName, double multiplier, double costMultiplier) {
        this.name = name;
        this.altName = altName;
        this.multiplier = multiplier;
        this.costMultiplier = costMultiplier;
    }
}
