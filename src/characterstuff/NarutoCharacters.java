package characterstuff;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class NarutoCharacters {
    public NarutoCharacters(String name, int health, int chakra, int stamina, int ninjutsuMastery, int taijutsuMastery, int kenjutsuMastery, int shurikenjutsuMastery, int genjutsuMastery, int stealthMastery, int speedMastery, int perceptionMastery, int healthProf, int staminaProf, int chakraProf, int stealthProf, int speedProf, int perceptionProf, int ninjutsuProf, int taijutsuProf, int kenjutsuProf, int shurikenjutsuProf, int genjutsuProf, int everythingProf, int chakraMult, int staminaMult, boolean hasSuperiorityComplex) {
        this.name = name;
        this.health = health;
        this.chakra = chakra;
        this.stamina = stamina;
        this.ninjutsuMastery = ninjutsuMastery;
        this.taijutsuMastery = taijutsuMastery;
        this.kenjutsuMastery = kenjutsuMastery;
        this.shurikenjutsuMastery = shurikenjutsuMastery;
        this.genjutsuMastery = genjutsuMastery;
        this.stealthMastery = stealthMastery;
        this.speedMastery = speedMastery;
        this.perceptionMastery = perceptionMastery;
        this.healthProf = healthProf;
        this.staminaProf = staminaProf;
        this.chakraProf = chakraProf;
        this.stealthProf = stealthProf;
        this.speedProf = speedProf;
        this.perceptionProf = perceptionProf;
        this.ninjutsuProf = ninjutsuProf;
        this.taijutsuProf = taijutsuProf;
        this.kenjutsuProf = kenjutsuProf;
        this.shurikenjutsuProf = shurikenjutsuProf;
        this.genjutsuProf = genjutsuProf;
        this.everythingProf = everythingProf;
        this.chakraMult = chakraMult;
        this.staminaMult = staminaMult;
        this.hasSuperiorityComplex = hasSuperiorityComplex;
    }

    private final String name;

    private final int health;
    private final int chakra;
    private final int stamina;

    private final int ninjutsuMastery;
    private final int taijutsuMastery;
    private final int kenjutsuMastery;
    private final int shurikenjutsuMastery;
    private final int genjutsuMastery;

    private final int stealthMastery;
    private final int speedMastery;
    private final int perceptionMastery;

    private final int healthProf;
    private final int staminaProf;
    private final int chakraProf;

    private final int stealthProf;
    private final int speedProf;
    private final int perceptionProf;

    private final int ninjutsuProf;
    private final int taijutsuProf;
    private final int kenjutsuProf;
    private final int shurikenjutsuProf;
    private final int genjutsuProf;

    private final int everythingProf;

    private final int chakraMult;
    private final int staminaMult;

    private final boolean hasSuperiorityComplex;

    public int speed() {
        return speedMastery;
    }

    public String name() {
        return name;
    }

    double shadowTPB = 0.5;
    int trainingPointModifier = 1;

    double[] trainingPartnerValues = new double[] {1.25, 2.0, 4.0, 8.0};
    double[] trainingPartnerValuesSuperiorityComplex = new double[] {1.05, 1.05, 10.0, 20.0};

    Random random = new Random();

    private void injuryCheck(TrainingDifficulty difficulty) {

        Map<InjuryLocations, Double> injuryPoolMap = difficulty.injuryChances;

        double totalWeight = 0;
        for (double weight : injuryPoolMap.values()) {
            totalWeight += weight;
        }

        double threshold = random.nextDouble() * totalWeight;

        for (Map.Entry<InjuryLocations, Double> entry : injuryPoolMap.entrySet()) {
            threshold -= entry.getValue();
            if (threshold <= 0) {
                if (entry.getKey() == InjuryLocations.NONE) {
                    System.out.println(this.name + " is exhausted for " + difficulty.exhaustionTime + " hours");
                    return;
                }
                exhaustiveCheck(difficulty, entry.getKey());
            break;
            }
        }
    }

    private void exhaustiveCheck(TrainingDifficulty difficulty, InjuryLocations injury) {

        Map<InjurySeverity, Double> injurySeverityPoolMap = new HashMap<>();
        InjurySeverity severity;

        switch (difficulty) {
            case AVERAGE -> injurySeverityPoolMap.putAll(Map.of(InjurySeverity.MINOR, 90.0, InjurySeverity.MAJOR, 10.0, InjurySeverity.BROKEN, 0.0));
            case ROUGH -> injurySeverityPoolMap.putAll(Map.of(InjurySeverity.MINOR, 60.0, InjurySeverity.MAJOR, 20.0, InjurySeverity.BROKEN, 10.0));
            case HARDCORE -> injurySeverityPoolMap.putAll(Map.of(InjurySeverity.MINOR, 40.0, InjurySeverity.MAJOR, 40.0, InjurySeverity.BROKEN, 20.0));
        }

        double totalWeight = 0;
        for (double weight : injurySeverityPoolMap.values()) {
            totalWeight += weight;
        }

        double threshold = random.nextDouble() * totalWeight;

        for (Map.Entry<InjurySeverity, Double> entry : injurySeverityPoolMap.entrySet()) {
            threshold -= entry.getValue();
            if (threshold <= 0) {
                severity = entry.getKey();
                int exhaustionTime = (int) Math.ceil((difficulty.exhaustionTime * injury.recoveryTimeMultiplier) * severity.recoveryTimeMultiplier);

                System.out.println(this.name + " has a " + severity.name() + " injury on their " + injury.name + ". Lowering " + injury.stats + " by " + severity.statReduction + "% for: " + exhaustionTime + " hours.");
                System.out.println(this.name + " is exhausted for " + difficulty.exhaustionTime + " hours");
                break;
            }
        }

    }

    private double calculateTrainingBonus(int proficiency, int[] trainingPartners) {

        double trainingBonus = proficiency;

        double[] activeValues = this.hasSuperiorityComplex ? trainingPartnerValuesSuperiorityComplex : trainingPartnerValues;

        for (int i = 0; i < trainingPartners.length; i++) {
            trainingBonus += trainingPartners[i] * activeValues[i];
        }

        return trainingBonus;
    }

    private int calculateHours(int hoursSpent, int proficiency, int[] trainingPartners, int daysTrained, int shadowClones, TrainingDifficulty difficulty) {

        double trainingBonus = calculateTrainingBonus(proficiency, trainingPartners);

        double hours = hoursSpent * trainingBonus;

        int hoursGained = (int) Math.ceil(hours * difficulty.trainingBonus);

        if (shadowClones > 0) {
            double cloneBonus = 1;
            for (int i = 0; i < shadowClones; i++) {
                cloneBonus += shadowTPB;
            }
            hoursGained = (int) Math.ceil(hoursGained * cloneBonus);
        }

        hoursGained *= daysTrained;

        return hoursGained;
    }

    public void train(TrainingTypes type, int hoursSpent, int[] trainingPartners, int daysTrained, int shadowClones,  TrainingDifficulty difficulty) {
        if (daysTrained == 0) {
            throw new IllegalArgumentException("Days trained must be positive.");
   }

        int proficiency = this.everythingProf;
        double gainMultiplier = difficulty.trainingBonus;

        switch (type) {
            case NINJUTSU -> proficiency += this.ninjutsuProf;
            case TAIJUTSU ->  proficiency += this.taijutsuProf;
            case KENJUTSU ->   proficiency += this.kenjutsuProf;
            case GENJUTSU ->  proficiency += this.genjutsuProf;
            case SHURIKENJUTSU ->   proficiency += this.shurikenjutsuProf;
            case HEALTH ->  proficiency += this.healthProf;
            case CHAKRA -> {
                proficiency += this.chakraProf;
                gainMultiplier += this.chakraMult;
            }
            case STAMINA -> {
                proficiency += this.staminaProf;
                gainMultiplier += this.staminaMult;
            }
            case STEALTH ->  proficiency += this.stealthProf;
            case SPEED ->  proficiency += this.speedProf;
            case PERCEPTION ->  proficiency += this.perceptionProf;
        }

        // injuryCheck(difficulty);

        int hoursGained = (int) Math.ceil(calculateHours(hoursSpent, proficiency, trainingPartners, daysTrained, shadowClones, difficulty) * gainMultiplier);

        hoursGained *= trainingPointModifier;

        int finalHoursGained = (int) Math.ceil(hoursGained * type.statMultiplication);
        System.out.println(this.name + " Gained " + finalHoursGained + " " + type.typeName);
    }

}
