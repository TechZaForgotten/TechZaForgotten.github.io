import itemstuff.*;

public class Weapons {


    public static final WeaponClass MOCHI_MALLET = new WeaponClass(
            "Mochi's Mallet", WeaponType.MALLET, MaterialDatabase.IRON, ItemGrade.BASIC, ItemPrefix.STANDARD
    );

    public static final WeaponClass AVERAGE_KUNAI = new WeaponClass(
            "Standard Kunai", WeaponType.KUNAI,  MaterialDatabase.IRON, ItemGrade.LOW_TIER, ItemPrefix.STANDARD
    );

    public static final WeaponClass YAMATO = new WeaponClass(
            "The Yamato", WeaponType.KATANA, MaterialDatabase.MYTHRIL, ItemGrade.LEGENDARY_GRADE, ItemPrefix.SHARP
    );

    public static final WeaponClass GIFTED_SWORD = new WeaponClass(
            "Gifted Katana", WeaponType.KATANA, MaterialDatabase.IRON, ItemGrade.HIGH_TIER, ItemPrefix.SHARP
    );

    public static final WeaponClass MOMMA_ARROWS = new WeaponClass(
            "Base Arrows (40x)", WeaponType.ARROW, MaterialDatabase.STONE, ItemGrade.LOW_TIER, ItemPrefix.STANDARD
    );

    public static final WeaponClass LANDOFIRON_SHOP_CHOKUTO = new WeaponClass(
            "Chokuto", WeaponType.CHOKUTO, MaterialDatabase.IRON, ItemGrade.HIGH_TIER, ItemPrefix.STANDARD
    );

    public static final WeaponClass LANDOFIRON_SHOP_ARROWS = new WeaponClass(
            "Arrows (20x)", WeaponType.ARROW, MaterialDatabase.FOLDED_IRON, ItemGrade.BASIC, ItemPrefix.STANDARD
    );

    public static final WeaponClass LANDOFIRON_SHOP_KOPIS = new WeaponClass(
            "Kopis", WeaponType.KOPIS, MaterialDatabase.IRON, ItemGrade.HIGH_TIER, ItemPrefix.STANDARD
    );

}
