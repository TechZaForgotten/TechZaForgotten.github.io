package itemstuff;

public class WeaponClass {
    private final String name;
    private final WeaponType weaponType;
    private final MaterialClass material;
    private final ItemGrade grade;
    private final ItemPrefix prefix;

    public WeaponClass(String name, WeaponType weaponType, MaterialClass material, ItemGrade grade, ItemPrefix prefix) {
        this.name = name;
        this.weaponType = weaponType;
        this.material = material;
        this.grade = grade;
        this.prefix = prefix;
    }

    public int calculateDamage() {
        double damage = (this.material.damage * (this.weaponType.statsMultiplier + this.grade.multiplier)) * this.prefix.damageMultiplier;

        return (int) Math.ceil(damage);
    }

    public int calculateDurability() {
        double durability = (this.material.durability * (this.weaponType.statsMultiplier + this.grade.multiplier)) * this.prefix.durabilityMultiplier;

        return (int) Math.ceil(durability);
    }

    public int calculateCost() {
        double weaponTypeAdjuster = 0.25;

        double cost = ((this.material.cost * this.material.laborCostMultiplier) * ((this.weaponType.cost * weaponTypeAdjuster) * this.prefix.costMultiplier)) * this.grade.costMultiplier;

        int yenConversionMultiplier = 100;

        return (int) Math.ceil(cost * yenConversionMultiplier);
    }

    public void displayInfo() {

        System.out.printf(
                "========================================%n" +
                "%s %s %s%n" +
                "Name: %s | Grade: %s%n" +
                "Damage: %s | Durability %s%n" +
                "Price/Cost: %s%n" +
                "========================================%n"
        ,this.prefix.name, this.material.name, this.weaponType.name, this.name, this.grade.name, calculateDamage(), calculateDurability(), calculateCost()
        );

    }

}
