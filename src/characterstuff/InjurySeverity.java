package characterstuff;

public enum InjurySeverity {
    MINOR(25, 1),
    MAJOR(50, 3),
    BROKEN(75, 6)
    ;

    public final int statReduction;
    public final int recoveryTimeMultiplier;

    InjurySeverity(int statReduction, int recoveryTimeMultiplier) {
        this.statReduction = statReduction;
        this.recoveryTimeMultiplier = recoveryTimeMultiplier;
    }
}
