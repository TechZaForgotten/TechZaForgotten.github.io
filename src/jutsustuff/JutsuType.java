package jutsustuff;

public enum JutsuType {
    SINGLE("Single",1.0,25,0),
    MULTI("Multi",0.5,25,0),
    BLAST("Blast",1.25,25,5),
    EXPLOSION("Explosion",2.0,25,20),
    BARRIER("Barrier",1.0,25,5),
    WAVE("Wave",1.30,25,10),
    BEAM("Beam",2.0,25,0),
    AREA("Area",3.0,25,20),
    CONTACT("Contact",0.75,25,0);

    public final String name;
    public final double multiplier;
    public final double baseChakraCost;
    public final double baseSplashDistance;

    JutsuType(String name, double multiplier, double baseChakraCost, double baseSplashDistance) {
        this.name = name;
        this.multiplier = multiplier;
        this.baseChakraCost = baseChakraCost;
        this.baseSplashDistance = baseSplashDistance;
    }
}
