package itemstuff;

public class MaterialDatabase {
    public static final MaterialClass WOOD = new MaterialClass("Wooden", 5, 1.0, 2, 10);
    public static final MaterialClass STONE = new MaterialClass("Stone", 7, 1.0, 3, 25);

    public static final MaterialClass COPPER = new MaterialClass("Copper", 9, 1.1, 5, 75);
    public static final MaterialClass IRON = new MaterialClass("Iron", 15, 1.2, 6, 150);

    public static final MaterialClass FOLDED_COPPER = new MaterialClass("Folded Copper", 17, 1.3, 8, 400);
    public static final MaterialClass FOLDED_IRON = new MaterialClass("Folded Iron", 30, 1.3, 9, 800);

    public static final MaterialClass MAGNET_RELEASE = new MaterialClass("Magnet Release", 40, 1.75, 12, 1000);

    public static final MaterialClass FOLDED_STEEL = new MaterialClass("Folded Steel", 45, 1.4, 11, 1200);
    public static final MaterialClass COBOLT = new MaterialClass("Cobolt", 60, 1.5, 12, 2400);

    public static final MaterialClass MYTHRIL = new MaterialClass("Mythril", 80, 1.75, 15, 5000);
    public static final MaterialClass OBSIDIAN_DIAMOND_ALLOY = new MaterialClass("Obsidian Alloy", 100, 2.0, 20, 10000);
}
