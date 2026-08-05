package itemstuff;

public class MaterialClass extends ItemClass {
    public final double laborCostMultiplier;
    public final int damage;
    public final int durability;

    public MaterialClass(String name, int cost, double laborCostMultiplier, int damage, int durability) {
        super(name, cost);
        this.laborCostMultiplier = laborCostMultiplier;
        this.damage = damage;
        this.durability = durability;
    }
}
