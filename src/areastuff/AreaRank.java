package areastuff;

public enum AreaRank {
    E_RANK(1, 3),
    D_RANK(2, 4),
    C_RANK(3, 5),
    B_RANK(4, 6),
    A_RANK(5, 7),
    S_RANK(6, 8),
    ;

    public final int strongestEnemy;
    public final int maxNumberOfEnemies;


    AreaRank(int strongestEnemy, int maxNumberOfEnemies) {
        this.strongestEnemy = strongestEnemy;
        this.maxNumberOfEnemies = maxNumberOfEnemies;
    }
}
