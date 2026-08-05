package jutsustuff;

public enum JutsuShape {
    FORMLESS("Formless", 0),
    BASIC("Basic", 0.5),
    WOLF_HEAD("Wolf Head", 1),
    FULL_WOLF("Full Wolf", 1.5),
    DRAGON_HEAD("Dragon Head", 2),
    FULL_DRAGON("Full Dragon", 2.5);

    public final String name;
    public final double multiplier;

    JutsuShape(String name, double multiplier) {
        this.name = name;
        this.multiplier = multiplier;
    }
}
