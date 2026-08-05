package jutsustuff;

public enum Rankings {
    E("E Rank", 10, 1.0, 1.0),
    D("D Rank", 20, 1.1, 1.2),
    C("C Rank", 40, 1.2, 1.4),
    B("B Rank", 120, 1.5, 3.0),
    A("A Rank", 360, 1.7, 3.4),
    S("S Rank", 1280, 1.9, 4.8),
    FORBIDDEN("Forbidden Jutsu", 1920, 2.5, 5.0);

    public final String name;
    public final int hourRequirement;
    public final double damageBonus;
    public final double costReduction;

    Rankings(String name, int hourRequirement, double damageBonus, double costReduction) {

        this.name = name;
        this.hourRequirement = hourRequirement;
        this.damageBonus = damageBonus;
        this.costReduction = costReduction;
    }
}
