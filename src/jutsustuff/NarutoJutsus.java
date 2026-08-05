package jutsustuff;

import characterstuff.NarutoCharacters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NarutoJutsus {
    private final String chakraNature;
    private final int minDamage;
    private final int minSpeed;
    private final int minDistance;
    private final int minChakraCost;
    private final double minSpeedBoost;
    private final double minStrengthBoost;

    // Fixed database of dice costs: [d4, d6, d8, d10, d12, d20, d48, d100]
    private static final int[] DICE_COSTS = {25, 50, 75, 125, 200, 325, 525, 850};
    private static final int[] DICE_DMG = {4, 6, 8, 10, 12, 20, 48, 100};
    private static final List<Rankings> RANKS_LIST = Arrays.asList(Rankings.E, Rankings.D, Rankings.C, Rankings.B, Rankings.A, Rankings.S, Rankings.FORBIDDEN);
    private static final List<Rankings> rank = new ArrayList<>();

    public NarutoJutsus(String chakraNature, int minDamage, int minSpeed, int minDistance,
                        int minChakraCost, double minSpeedBoost, double minStrengthBoost) {
        this.chakraNature = chakraNature;
        this.minDamage = minDamage;
        this.minSpeed = minSpeed;
        this.minDistance = minDistance;
        this.minChakraCost = minChakraCost;
        this.minSpeedBoost = minSpeedBoost;
        this.minStrengthBoost = minStrengthBoost;
    }

    public CustomJutsu imbueCreation(String name, NarutoCharacters creator,int SpeedModifier, int StrengthModifier, int effectAmount, boolean isFullBody){

        double strengthCost = StrengthModifier * 50;
        double speedCost = SpeedModifier * 50;
        int chakraCost = (int) ((this.minChakraCost * 3) + (strengthCost + speedCost));
        double SpeedBoost = this.minSpeedBoost + (SpeedModifier * 0.01);
        double StrengthBoost = this.minStrengthBoost + (StrengthModifier * 0.01);
        int fullBodyMultiplier = 5;

        if (effectAmount > 0) {
            chakraCost = (int)Math.ceil(effectAmount * 2);
        }


        Rankings rank = null;

        if (SpeedBoost >= 5.25 || StrengthBoost >= 5.25) {
            rank = Rankings.FORBIDDEN;
        } else if (SpeedBoost >= 4.0 || StrengthBoost >= 4.0) {
            rank = Rankings.S;
        } else if (SpeedBoost >= 3.0 || StrengthBoost >= 3.0) {
            rank = Rankings.A;
        } else if (SpeedBoost >= 2.25 || StrengthBoost >= 2.25) {
            rank = Rankings.B;
        } else if (SpeedBoost >= 1.75 || StrengthBoost >= 1.75) {
            rank = Rankings.C;
        } else if (SpeedBoost >= 1.25 || StrengthBoost >= 1.25) {
            rank = Rankings.D;
        } else if (SpeedBoost >= 1.0 || StrengthBoost >= 1.0) {
            rank = Rankings.E;
        }

        if (isFullBody) {
            chakraCost *= fullBodyMultiplier;
        }

        int isNull = 0;
        double Null = 0.0;
        boolean isBuff = true;

        return new CustomJutsu(name, creator.name(),this.chakraNature, isNull, null, null, null,rank.name, rank.hourRequirement, isNull, isNull, isNull,
                chakraCost, Null, null, isNull, SpeedBoost, StrengthBoost, isBuff);
    }

    private List<Rankings> findRank(int potentialDmg) {
        if (potentialDmg >= 1280) {
            rank.add(Rankings.E);
            rank.add(Rankings.D);
            rank.add(Rankings.C);
            rank.add(Rankings.B);
            rank.add(Rankings.A);
            rank.add(Rankings.S);
            rank.add(Rankings.FORBIDDEN);
        } else if (potentialDmg >= 652) {
            rank.add(Rankings.E);
            rank.add(Rankings.D);
            rank.add(Rankings.C);
            rank.add(Rankings.B);
            rank.add(Rankings.A);
            rank.add(Rankings.S);
        } else if (potentialDmg >= 376) {
            rank.add(Rankings.E);
            rank.add(Rankings.D);
            rank.add(Rankings.C);
            rank.add(Rankings.B);
            rank.add(Rankings.A);
        } else if (potentialDmg >= 188) {
            rank.add(Rankings.E);
            rank.add(Rankings.D);
            rank.add(Rankings.C);
            rank.add(Rankings.B);
        } else if (potentialDmg >= 96) {
            rank.add(Rankings.E);
            rank.add(Rankings.D);
            rank.add(Rankings.C);
        } else if (potentialDmg >= 32) {
            rank.add(Rankings.E);
            rank.add(Rankings.D);
        } else if (potentialDmg >= 0) {
            rank.add(Rankings.E);
        }

        return rank;
    }

    public CustomJutsu jutsuCreation(String name, NarutoCharacters creator, int[] diceAmounts, int speedModifier, int distanceModifier,
                                     int shotAmount, int effectsAmount, JutsuType type, JutsuChakraInput size, JutsuShape shape) {

        if (type == null || size == null || diceAmounts == null || diceAmounts.length < 8) {
            System.out.println("Error: Missing parameters or incomplete dice array.");
            return null;
        }

        if (size == JutsuChakraInput.COMPRESSED && type == JutsuType.CONTACT) {
            System.out.println("Cannot Compress an Contact Jutsu");
            return null;
        }





        int finalDistance = this.minDistance + distanceModifier;
        int finalSplashDistance = (int)Math.floor((type.baseSplashDistance * size.multiplier)/5);
        int finalSpeed = Math.round((this.minSpeed + ((float) creator.speed() /2)) + speedModifier);

        if (type == JutsuType.CONTACT) {
            finalSpeed -= this.minSpeed;
            finalSpeed += creator.speed();
        }

        if (finalSplashDistance < 5) {
            finalSplashDistance = 0;
        }

        int speedCost = speedModifier * 25;
        int distanceCost = (distanceModifier / 5) * 50;

        // 3. Compact dice cost aggregation
        double totalDiceCost = 0;
        for (int i = 0; i < 8; i++) {
            totalDiceCost += diceAmounts[i] * DICE_COSTS[i];
        }
        totalDiceCost *= 1.5; // Apply flat dice scaling modifier

        double chakraVariables = (type.multiplier * (size.multiplier + shape.multiplier));

        double preCalcCost = totalDiceCost + speedCost + distanceCost + this.minChakraCost;
        double finalChakraCost = Math.ceil(preCalcCost * chakraVariables);



        if (effectsAmount > 0) finalChakraCost = (Math.ceil(finalChakraCost * (effectsAmount * 1.5)));

        double finalBaseDamage = Math.ceil(this.minDamage * chakraVariables);

        if  (type == JutsuType.MULTI) {
            double amountCost = (double) 1 / shotAmount;
            finalBaseDamage *= amountCost;
            finalChakraCost *= amountCost;
            finalBaseDamage = Math.ceil(finalBaseDamage);
            finalChakraCost = Math.ceil(finalChakraCost);
        }



        int potentialDmg = 0;
        for (int i = 0; i < 8; i++) {
            potentialDmg += diceAmounts[i] * DICE_DMG[i];
        }
        potentialDmg += (int) finalBaseDamage;

        findRank(potentialDmg);
        potentialDmg -= (int) finalBaseDamage;

        finalChakraCost /= rank.getLast().costReduction;
        finalBaseDamage *= rank.getLast().damageBonus;

        findRank(((int)finalBaseDamage + potentialDmg));

        int actionBuildup = 0;
        if (size == JutsuChakraInput.COMPRESSED) {
            for (int i = 0; i < rank.size(); i+=2) {
                if (i == 8) {
                    break;
                }
                if (rank.get(i) == RANKS_LIST.get(i)) {
                    actionBuildup++;
                }
            }
            if (type != JutsuType.EXPLOSION) {
            name = name + " (" + (actionBuildup) +" action buildup)";
            }
        }
        if (type == JutsuType.EXPLOSION) {
            for (int i = 0; i < rank.size(); i+=2) {
                if (rank.get(i) == RANKS_LIST.get(i)) {
                    actionBuildup++;
                }
            }
            name = name + " (" + (actionBuildup) +" action buildup)";
        }

        double speedBoost = 0.0;
        double strengthBoost = 0.0;
        boolean isBuff = false;

        return new CustomJutsu(name, creator.name(), this.chakraNature, shotAmount, size.name, type.name, shape.name, rank.getLast().name, rank.getLast().hourRequirement, finalDistance, finalSplashDistance, finalSpeed,
                finalChakraCost, finalBaseDamage, diceAmounts, effectsAmount, speedBoost, strengthBoost,  isBuff);
    }
}