package combatstuff;

import characterstuff.CharacterDatabase;
import characterstuff.NarutoCharacters;
import jutsustuff.Rankings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NarutoCombat {
    private final String combatType;
    private final double chakraMultiplier;
    private final double staminaMultiplier;
    private final double speedMultiplier;
    private final double damageMultiplier;

    public NarutoCombat(String combatType, double chakraMultiplier, double staminaMultiplier, double speedMultiplier, double damageMultiplier) {
        this.combatType = combatType;
        this.chakraMultiplier = chakraMultiplier;
        this.staminaMultiplier = staminaMultiplier;
        this.speedMultiplier = speedMultiplier;
        this.damageMultiplier = damageMultiplier;
    }



    /**
     * Dice: d4 d6 d8 d10 d12 d20 d48 d100
     */

    private static final int[] DICE_COST = {25, 50, 75, 125, 200, 325, 525, 850};
    private static final int[] DICE_DMG = {4, 6, 8, 10, 12, 20, 48, 100};

    private static final double diceMult = 0.5;
    private static final double synergyBuff = 0.2;
    private static final double rankMult = 0.75;
    private static final double baseDamageMult = 2;
    private static final double speedMultiplierDivider = 2;

    private static final List<Rankings> RANKS_LIST = Arrays.asList(Rankings.E, Rankings.D, Rankings.C, Rankings.B, Rankings.A, Rankings.S, Rankings.FORBIDDEN);
    private static final List<Rankings> rank = new ArrayList<>();

    private List<Rankings> findRank(int potentialDmg) {
        if (potentialDmg >= 1280 * rankMult) {
            rank.add(Rankings.E);
            rank.add(Rankings.D);
            rank.add(Rankings.C);
            rank.add(Rankings.B);
            rank.add(Rankings.A);
            rank.add(Rankings.S);
            rank.add(Rankings.FORBIDDEN);
        } else if (potentialDmg >= 652 * rankMult) {
            rank.add(Rankings.E);
            rank.add(Rankings.D);
            rank.add(Rankings.C);
            rank.add(Rankings.B);
            rank.add(Rankings.A);
            rank.add(Rankings.S);
        } else if (potentialDmg >= 376 * rankMult) {
            rank.add(Rankings.E);
            rank.add(Rankings.D);
            rank.add(Rankings.C);
            rank.add(Rankings.B);
            rank.add(Rankings.A);
        } else if (potentialDmg >= 188 * rankMult) {
            rank.add(Rankings.E);
            rank.add(Rankings.D);
            rank.add(Rankings.C);
            rank.add(Rankings.B);
        } else if (potentialDmg >= 96 * rankMult) {
            rank.add(Rankings.E);
            rank.add(Rankings.D);
            rank.add(Rankings.C);
        } else if (potentialDmg >= 32 * rankMult) {
            rank.add(Rankings.E);
            rank.add(Rankings.D);
        } else if (potentialDmg >= 0 * rankMult) {
            rank.add(Rankings.E);
        }

        return rank;
    }

    public CustomCombat createKenjutsu(String name, NarutoCharacters creator, KenjutsuStyles style,
                                       int[] diceAmount,
                                       int attackAmount, int effectAmount,
                                       CombatPower power, CombatMastery mastery, CombatTypes type) {

        if (creator == null || diceAmount.length != DICE_COST.length || power == null || mastery == null || style == null || type == null) {
            System.out.println("Yo, Did you forget an input?");
            return null;
        }

        if ((type == CombatTypes.BLOCK || type == CombatTypes.GRAPPLE || type == CombatTypes.DISARM || type == CombatTypes.PARRY) && attackAmount > 1) {
            System.out.println("HEY! BLOCKS, GRAPPLES, DISARMS, AND PARRY CANT ATTACK TWICE!");
            return null;
        }

        if (attackAmount == 0) {
            attackAmount ++;
        }

        double typeDamageMultiplier = type.damageMultiplier;
        double typeStaminaMultiplier = type.staminaMultiplier;
        int minimumStamina = type.minimumStamina;

        int minimumSpeed = creator.speed();

        if (type == style.preferredType1 || type == style.preferredType2) {
            typeDamageMultiplier += synergyBuff;
            typeStaminaMultiplier -= synergyBuff;
            minimumStamina += (int) (Math.ceil(1/(type.minimumStamina * synergyBuff)));
        }

        double damageMultiplier = typeDamageMultiplier + power.damageMultiplier;
        double staminaMultiplier = typeStaminaMultiplier + power.staminaMultiplier;
        double speedMultiplier = power.speedMultiplier;
        double chakraMultiplier = style.chakraCostMultiplier;

        if (power == style.preferredPower) {
            damageMultiplier += synergyBuff;
            staminaMultiplier -= synergyBuff;
            speedMultiplier += synergyBuff;
            chakraMultiplier -= synergyBuff;
        }

        if ((type == style.preferredType1 || type == style.preferredType2) && power == style.preferredPower) {
            damageMultiplier += synergyBuff;
            staminaMultiplier -= synergyBuff;
            speedMultiplier += synergyBuff;
            minimumStamina += (int) (Math.ceil(1/(type.minimumStamina * synergyBuff)));
        }

        int stamina = minimumStamina;
        int chakra = power.minChakra;

        for (int i = 0 ; i < diceAmount.length ; i++) {
            if (diceAmount[i] != 0){
                stamina += (int) Math.ceil((diceAmount[i] * (DICE_COST[i] * diceMult)));
            }
        }

        double finalBaseDamage = Math.ceil(((power.minDamage * (mastery.multiplier + damageMultiplier)) * this.damageMultiplier)/baseDamageMult);
        double finalStaminaCost =  Math.ceil((stamina * staminaMultiplier) * this.staminaMultiplier);
        double finalChakraCost =  Math.ceil((chakra * chakraMultiplier));
        double finalSpeed = Math.ceil((minimumSpeed * (((mastery.multiplier + speedMultiplier)) * this.speedMultiplier) / speedMultiplierDivider) );

        if (effectAmount > 0) {
            double effectCost = effectAmount * 1.2;
            finalStaminaCost *= effectCost;
            finalChakraCost *= effectCost;
            finalBaseDamage = Math.ceil(finalBaseDamage);
            finalStaminaCost = Math.ceil(finalStaminaCost);
            finalChakraCost = Math.ceil(finalChakraCost);
        }

        if (attackAmount > 1) {
            double amountCost = (double) 1 /attackAmount;
            finalBaseDamage *= amountCost;
            finalStaminaCost *= amountCost;
            finalChakraCost *= amountCost;
            finalBaseDamage = Math.ceil(finalBaseDamage);
            finalStaminaCost = Math.ceil(finalStaminaCost);
            finalChakraCost = Math.ceil(finalChakraCost);
        }

        int potentialDmg = 0;
        for (int i = 0; i < 8; i++) {
            potentialDmg += diceAmount[i] * DICE_DMG[i];
        }
        potentialDmg += (int) finalBaseDamage;

        findRank(potentialDmg);
        potentialDmg -= (int) finalBaseDamage;

        finalChakraCost *= rank.getLast().damageBonus;
        finalStaminaCost /= rank.getLast().costReduction;
        finalBaseDamage *= rank.getLast().damageBonus;

        findRank(((int) finalBaseDamage + potentialDmg));

        return new CustomCombat(name, creator.name(), style.name, mastery.name, type.name, power.name, rank.getLast().name, rank.getLast().hourRequirement, effectAmount, attackAmount,finalChakraCost, finalStaminaCost, finalSpeed, finalBaseDamage, diceAmount);
    }

    public CustomCombat createTaijutsu(String name, NarutoCharacters creator, TaijutsuStyles style,
                                       int[] diceAmount,
                                       int attackAmount, int effectAmount,
                                       CombatPower power, CombatMastery mastery, CombatTypes type) {

        if (creator == null || diceAmount.length != DICE_COST.length || power == null || mastery == null || style == null || type == null) {
            System.out.println("Yo, Did you forget an input?");
            return null;
        }

        if ((type == CombatTypes.BLOCK || type == CombatTypes.GRAPPLE || type == CombatTypes.DISARM || type == CombatTypes.PARRY) && attackAmount > 1) {
            System.out.println("HEY! BLOCKS, GRAPPLES, DISARMS, AND PARRY CANT ATTACK TWICE!");
            return null;
        }

        if (attackAmount == 0) {
            attackAmount ++;
        }

        double typeDamageMultiplier = type.damageMultiplier;
        double typeStaminaMultiplier = type.staminaMultiplier;
        int minimumStamina = type.minimumStamina;

        int minimumSpeed = creator.speed();

        if (type == style.preferredType1 || type == style.preferredType2) {
            typeDamageMultiplier += synergyBuff;
            typeStaminaMultiplier -= synergyBuff;
            minimumStamina += (int) (Math.ceil(1/(type.minimumStamina * synergyBuff)));
        }

        double damageMultiplier = typeDamageMultiplier + power.damageMultiplier;
        double staminaMultiplier = typeStaminaMultiplier + power.staminaMultiplier;
        double speedMultiplier = power.speedMultiplier;
        double chakraMultiplier = style.chakraCostMultiplier;

        if (power == style.preferredPower) {
            damageMultiplier += synergyBuff;
            staminaMultiplier -= synergyBuff;
            speedMultiplier += synergyBuff;
            chakraMultiplier -= synergyBuff;
        }

        if ((type == style.preferredType1 || type == style.preferredType2) && power == style.preferredPower) {
            damageMultiplier += synergyBuff;
            staminaMultiplier -= synergyBuff;
            speedMultiplier += synergyBuff;
            minimumStamina += (int) (Math.ceil(1/(type.minimumStamina * synergyBuff)));
        }

        int stamina = minimumStamina;
        int chakra = power.minChakra;

        for (int i = 0 ; i < diceAmount.length ; i++) {
            if (diceAmount[i] != 0){
                stamina += (int) Math.ceil((diceAmount[i] * (DICE_COST[i] * diceMult)));
            }
        }

        double finalBaseDamage = Math.ceil(((power.minDamage * (mastery.multiplier + damageMultiplier)) * this.damageMultiplier)/baseDamageMult);
        double finalStaminaCost =  Math.ceil((stamina * staminaMultiplier) * this.staminaMultiplier);
        double finalChakraCost =  Math.ceil((chakra * chakraMultiplier));
        double finalSpeed = Math.ceil((minimumSpeed * (((mastery.multiplier + speedMultiplier)) * this.speedMultiplier) / speedMultiplierDivider) );

        if (effectAmount > 0) {
            double effectCost = effectAmount * 1.2;
            finalStaminaCost *= effectCost;
            finalChakraCost *= effectCost;
            finalBaseDamage = Math.ceil(finalBaseDamage);
            finalStaminaCost = Math.ceil(finalStaminaCost);
            finalChakraCost = Math.ceil(finalChakraCost);
        }

        if (attackAmount > 1) {
            double amountCost = (double) 1 /attackAmount;
            finalBaseDamage *= amountCost;
            finalStaminaCost *= amountCost;
            finalChakraCost *= amountCost;
            finalBaseDamage = Math.ceil(finalBaseDamage);
            finalStaminaCost = Math.ceil(finalStaminaCost);
            finalChakraCost = Math.ceil(finalChakraCost);
        }

        int potentialDmg = 0;
        for (int i = 0; i < 8; i++) {
            potentialDmg += diceAmount[i] * DICE_DMG[i];
        }
        potentialDmg += (int) finalBaseDamage;

        findRank(potentialDmg);
        potentialDmg -= (int) finalBaseDamage;

        finalChakraCost *= rank.getLast().damageBonus;
        finalStaminaCost /= rank.getLast().costReduction;
        finalBaseDamage *= rank.getLast().damageBonus;

        findRank(((int) finalBaseDamage + potentialDmg));

        return new CustomCombat(name, creator.name(), style.name, mastery.name, type.name, power.name, rank.getLast().name, rank.getLast().hourRequirement, effectAmount, attackAmount,finalChakraCost, finalStaminaCost, finalSpeed, finalBaseDamage, diceAmount);
    }

}