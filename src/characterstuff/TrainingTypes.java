package characterstuff;

public enum TrainingTypes {
    NINJUTSU("Ninjutsu Mastery", 1.0),
    TAIJUTSU("Taijutsu Mastery", 1.0),
    KENJUTSU("Kenjutsu Mastery", 1.0),
    GENJUTSU("Genjutsu Mastery", ((double) 1 /2)),
    SHURIKENJUTSU("Shurikenjutsu Mastery", 1.0),
    HEALTH("Health", (double) 1 /10),
    CHAKRA("Chakra", 1.0),
    STAMINA("Stamina", 1.0),
    SPEED("Speed Points", (double) 1 /12),
    PERCEPTION("Perception Points", (double) 1 /12),
    STEALTH("Stealth Points", (double) 1 /12)
    ;

    public final String typeName;
    public final double statMultiplication;

    TrainingTypes(String typeName, double statMultiplication) {
        this.typeName = typeName;
        this.statMultiplication = statMultiplication;
    }
}
