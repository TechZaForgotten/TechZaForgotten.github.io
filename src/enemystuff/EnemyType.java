package enemystuff;

public enum EnemyType {
    BEAST(50, 500, 250, 75, 50, 30, 0, 0, 0, 0, 0, 0),
    JUTSULESS( 150, 600, 500, 125, 100, 60, 1, 2, 5, 500, 1, 0),
    GENIN( 250, 1500, 3000, 250, 250, 250, 1, 5, 20, 1500, 2, 3),
    CHUNIN( 500, 3000, 6000, 300, 300, 300, 2, 10, 50, 3000, 3, 4),
    JONIN( 1500, 9000, 18000, 900, 900, 900, 2, 30, 100, 25000, 5, 6),
    SPECIAL_JONIN(4500, 27000, 54000, 2700, 2700, 2700, 3, 30, 100, 75000, 7, 8);

    public final int averageHealth;
    public final int averageStamina;
    public final int averageChakra;

    public final int averageSpeed;
    public final int averagePerception;
    public final int averageStealth;

    public final int maxWeapons;
    public final int maxKunais;
    public final int maxShurikens;

    public final int averageYenOnPerson;

    public final int maxSkills;
    public final int maxJutsus;

    EnemyType(int averageHealth, int averageStamina, int averageChakra, int averageSpeed, int averagePerception, int averageStealth, int maxWeapons, int maxKunais, int maxShurikens, int averageYenOnPerson, int maxSkills, int maxJutsus) {
        this.averageHealth = averageHealth;
        this.averageStamina = averageStamina;
        this.averageChakra = averageChakra;
        this.averageSpeed = averageSpeed;
        this.averagePerception = averagePerception;
        this.averageStealth = averageStealth;
        this.maxWeapons = maxWeapons;
        this.maxKunais = maxKunais;
        this.maxShurikens = maxShurikens;
        this.averageYenOnPerson = averageYenOnPerson;
        this.maxSkills = maxSkills;
        this.maxJutsus = maxJutsus;
    }
}
