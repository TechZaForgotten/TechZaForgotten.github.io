package combatstuff;

public enum CombatMastery {
    NONE("None", 1),
    BEGINNER("Beginner", 1.2),
    ADVANCED_BEGINNER("Advanced Beginner", 1.5),
    PROFICIENT("Proficient", 1.8),
    COMPETENT("Competent", 2.1),
    EXPERT("Expert", 2.5),;

    public final String name;
    public final double multiplier;

    CombatMastery(String name, double multiplier) {
        this.name = name;
        this.multiplier = multiplier;
    }
}
