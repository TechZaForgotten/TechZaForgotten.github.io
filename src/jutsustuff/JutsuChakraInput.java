package jutsustuff;

public enum JutsuChakraInput {
    TINY("Tiny",0.25),
    SMALL("Small",0.5),
    MEDIUM("Medium",1.0),
    LARGE("Large",1.5),
    MASSIVE("Massive",2.0),
    COMPRESSED("Compressed",3.5);

    public final String name;
    public final double multiplier;

    JutsuChakraInput(String name, double multiplier) {
        this.name = name;
        this.multiplier = multiplier;
    }
}
