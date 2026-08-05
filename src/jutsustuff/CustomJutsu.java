package jutsustuff;

public class CustomJutsu {

        private final String name;
        public final String creatorName;
        private final String chakraNature;
        private final int shotAmount;
        private final String size;
        private final String type;
        private final String shape;
        private final String rank;
        private final int learningHours;
        private final int totalDistance;
        private final int totalSplashDistance;
        private final int totalSpeed;
        private final double totalChakraCost;
        private final double totalBaseDamage;
        private final int[] dice;
        private final int effectsAmount;

        private final double speedBoost;
        private final double strengthBoost;

        private final boolean isBuff;


        public CustomJutsu(String name, String creatorName, String chakraNature, int shotAmount, String size, String type, String shape, String rank, int learningHours, int distance, int splashDistance, int speed, double chakraCost,
                           double baseDamage, int[] dice, int effectsAmount, double speedBoost, double strengthBoost, boolean isBuff) {
            this.name = name;
            this.creatorName = creatorName;
            this.shotAmount = shotAmount;
            this.size = size;
            this.type = type;
            this.chakraNature = chakraNature;
            this.shape = shape;
            this.rank = rank;
            this.learningHours = learningHours;
            this.totalDistance = distance;
            this.totalSplashDistance = splashDistance;
            this.totalSpeed = speed;
            this.totalChakraCost = chakraCost;
            this.totalBaseDamage = baseDamage;
            this.dice = dice;
            this.effectsAmount = effectsAmount;
            this.speedBoost = speedBoost;
            this.strengthBoost = strengthBoost;
            this.isBuff = isBuff;
        }

        public void displayInfo() {
            String[] diceLabels = {"d4", "d6", "d8", "d10", "d12", "d20", "d48", "d100"};
            StringBuilder diceString = new StringBuilder();

            StringBuilder effectsString = new StringBuilder();

            StringBuilder shotAmountString = new StringBuilder();

            if (shotAmount > 1) {
                shotAmountString.append("Shots:     ").append(shotAmount).append("%n").append("========================================%n");
            }

            String finalShotAmountString = shotAmount > 1 ? shotAmountString.toString().trim() : "========================================%n";

            if (effectsAmount > 0) {
                effectsString.append(effectsAmount);
            }

            String finalEffAO = effectsAmount > 0 ? effectsString.toString().trim() : "None";

            if (dice != null){
                for (int i = 0; i < dice.length; i++) {
                    if (dice[i] > 0) { // Hides zero dice automatically
                        diceString.append(dice[i]).append("x").append(diceLabels[i]).append(" ");
                    }
                }
            }
            String finalDiceOutput = diceString.length() > 0 ? diceString.toString().trim() : "None";

            if (isBuff) {
                System.out.printf(
                        "========================================%n" +
                                "Jutsu:     %s%n" +
                                "Nature:    %s%n" +
                                "Rank:      %s | Hours Required: %d%n" +
                                "Creator:   %s%n" +
                                "========================================%n" +
                                "Effects:   %s%n" +
                                "Chakra:    %.0f | Upkeep: %.0f%n" +
                                "Str Mult:  %s | Spd Mult: %s%n" +
                                "========================================%n",
                        name,chakraNature,rank,learningHours, creatorName,finalEffAO,totalChakraCost,(totalChakraCost/2),speedBoost,strengthBoost
                );
                return;
            }

            System.out.printf("========================================%n" +
                            "Jutsu:     %s%n" +
                            "Nature:    %s%n" +
                            "Rank:      %s | Hours Required: %d%n" +
                            "Creator:   %s%n" +
                            "========================================%n" +
                            "Size:      %s | Type: %s | Shape: %s%n" +
                            "Chakra:    %.0f | Upkeep: %.0f%n" +
                            finalShotAmountString +
                            "Distance:  %d Feet | Splash Dist: %d%n" +
                            "Speed:     %d | Effects: %s%n" +
                            "Base DMG:  %s%n" +
                            "Dice DMG:  %s%n" +
                            "========================================%n",
                    name, chakraNature, rank, learningHours, creatorName, size, type, shape,totalChakraCost, totalChakraCost/2,
                    totalDistance,totalSplashDistance,totalSpeed,finalEffAO,totalBaseDamage,finalDiceOutput
            );
        }
    }
