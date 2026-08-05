package characterstuff;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static characterstuff.InjuryLocations.*;
import static characterstuff.InjuryLocations.RIGHT_ARM;

public enum TrainingDifficulty {
    LIGHT(0.5, 2, Map.of(NONE, 100.0)),
    AVERAGE(1.0, 4, Map.of(NONE, 80.0, LEFT_ARM, 3.34, RIGHT_ARM, 3.34, LEFT_LEG, 3.33, RIGHT_LEG, 3.33, BODY, 3.33, HEAD, 3.33)),
    ROUGH(1.5, 8, Map.of(NONE, 70.0, LEFT_ARM, 5.0, RIGHT_ARM, 5.0, LEFT_LEG, 5.0, RIGHT_LEG, 5.0, BODY, 5.0, HEAD, 5.0)),
    HARDCORE(2.0, 16, Map.of(NONE, 50.0, LEFT_ARM, 8.34, RIGHT_ARM, 8.34, LEFT_LEG, 8.33, RIGHT_LEG, 8.33, BODY, 8.33, HEAD, 8.33));

    public final double trainingBonus;
    public final int exhaustionTime;
    public final Map<InjuryLocations, Double> injuryChances;

    TrainingDifficulty(double trainingBonus, int exhaustionTime, Map<InjuryLocations, Double> injuryChances) {
        this.trainingBonus = trainingBonus;
        this.exhaustionTime = exhaustionTime;
        this.injuryChances = Collections.unmodifiableMap(injuryChances);
    }
}
