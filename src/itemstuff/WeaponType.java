package itemstuff;

import java.util.ArrayList;

public enum WeaponType {
    KUNAI("Kunai", 1.0, 5),
    SHURIKEN("Shuriken", 0.5, 1),
    SENBON("Senbon", 1.1 , 7),
    ARROW("Arrow", 0.75, 50),
    KATANA("Katana", 1.3 , 150),
    ODACHI("Odachi", 1.5 , 250),
    TANTO("Tanto", 1.2 , 100),
    NAGINATA("Naginata", 1.4 , 200),
    CHOKUTO("Chokuto", 1.25 , 125),
    SWORD("Sword", 1.3 , 150),
    GREAT_SWORD("Great Sword", 1.5 , 250),
    LONG_SWORD("Long Sword", 1.4 , 200 ),
    SHORT_SWORD("Short Sword", 1.2 , 100 ),
    KUNAI_BLADE("Kunai Blade", 1.4 , 175 ),
    STAFF("Staff", 1.2 , 125 ),
    BO_STAFF("Bo Staff", 1.4 , 175 ),
    SPEAR("Spear", 1.3 , 150 ),
    BOW("Bow", 1.3 , 150 ),
    LONG_BOW("Long Bow", 1.4 , 175 ),
    SHORT_BOW("Short Bow", 1.2 , 125 ),
    MALLET("Mallet", 1.1 , 75 ),
    HAMMER("Hammer", 1.3 , 150 ),
    WAR_HAMMER("War Hammer", 1.5 , 250 ),
    FLAIL("Flail", 1.2 , 125 ),
    MORNING_STAR("Morning Star", 1.4 , 150 ),
    WAR_AXE("War Axe", 1.5 , 275 ),
    AXE("Axe", 1.3 , 150 ),
    GAUNTLET("Gauntlet", 1.2 , 150 ),
    CHAINS("Chains", 1.2 , 75 ),
    SCYTHE("Scythe", 1.3 , 150 ),
    SHORT_SCYTHE("Short Scythe" , 1.2 , 125 ),
    LONG_SCYTHE("Long Scythe", 1.5 , 225 ),
    KOPIS("Kopis", 1.2 , 125 ),
    LARGE_KOPIS("Large Kopis", 1.35 , 150 ),;

    public final String name;
    public final double statsMultiplier;
    public final int cost;

    WeaponType(String name, double statsMultiplier, int cost) {
        this.name = name;
        this.statsMultiplier = statsMultiplier;
        this.cost = cost;
    }


}
