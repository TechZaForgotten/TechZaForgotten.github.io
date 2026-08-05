import characterstuff.CharacterDatabase;
import characterstuff.NarutoCharacters;
import combatstuff.*;
import jutsustuff.CustomJutsu;

import java.util.List;

import static characterstuff.CharacterDatabase.*;

public class Skills {

    static NarutoCharacters test = CharacterDatabase.osty;

    /**
     * Dices go as so {d4, d6, d8, d10, d12, d20, d48, d100}
     */

    public static final CustomCombat TestTai = CombatDatabase.TAIJUTSU.createTaijutsu(
            "Fork and Knife", test,
            TaijutsuStyles.TRAINED,
            new int[] {0, 2, 0, 0, 0, 0, 0, 0},
            2, 0,
            CombatPower.MEDIUM, CombatMastery.BEGINNER, CombatTypes.ATTACK
    );

    public static final CustomCombat SWEEP_KICK = CombatDatabase.TAIJUTSU.createTaijutsu(
            "Sweep Kick", aster,
            TaijutsuStyles.FISTS_OF_A_FLOWER,
            new int[] {2, 1, 0, 0, 0, 0, 0, 0},
            1, 1,
            CombatPower.LIGHT, CombatMastery.NONE, CombatTypes.ATTACK
    );

    public static final CustomCombat COUNTER = CombatDatabase.TAIJUTSU.createTaijutsu(
            "Counter", aster,
    TaijutsuStyles.FISTS_OF_A_FLOWER,
            new int[] {2, 0, 0, 0, 0, 0, 0, 0},
            0, 0,
    CombatPower.MEDIUM, CombatMastery.NONE, CombatTypes.COUNTER
    );

    public static final CustomCombat HOOK = CombatDatabase.TAIJUTSU.createTaijutsu(
            "Hook", aster,
    TaijutsuStyles.FISTS_OF_A_FLOWER,
            new int[] {1, 2, 0, 0, 0, 0, 0, 0},
            0, 0,
    CombatPower.HEAVY, CombatMastery.NONE, CombatTypes.ATTACK
    );

    public static final CustomCombat CUT = CombatDatabase.KENJUTSU.createKenjutsu(
            "Cut", aster,
            KenjutsuStyles.UNTRAINED,
            new int[] {2, 0, 0, 0, 0, 0, 0, 0,},
            1, 0,
            CombatPower.MEDIUM, CombatMastery.NONE, CombatTypes.ATTACK
    );

    public static final CustomCombat SCISSOR_KICK = CombatDatabase.TAIJUTSU.createTaijutsu(
            "Scissor Kick", marco,
    TaijutsuStyles.UNTRAINED,
            new int[] {3, 0, 0, 0, 0, 0, 0, 0},
            1, 0,
    CombatPower.CHAKRA_LIGHT, CombatMastery.NONE, CombatTypes.GRAPPLE
    );

    public static final CustomCombat POWER_SHOT = CombatDatabase.TAIJUTSU.createTaijutsu(
            "Power Shot", marco,
    TaijutsuStyles.UNTRAINED,
            new int[] {4, 0, 0, 0, 0, 0, 0, 0},
            1, 0,
    CombatPower.CHAKRA_HEAVY, CombatMastery.NONE, CombatTypes.ATTACK
    );

    public static final CustomCombat MARCO_BLOCK = CombatDatabase.TAIJUTSU.createTaijutsu(
            "Block", marco,
    TaijutsuStyles.UNTRAINED,
            new int[] {4, 0, 0, 0, 0, 0, 0, 0},
            1, 0,
    CombatPower.CHAKRA_MEDIUM, CombatMastery.NONE, CombatTypes.BLOCK
    );

    public static final CustomCombat SMITH_SLASH = CombatDatabase.KENJUTSU.createKenjutsu(
            "Slash", smith,
    KenjutsuStyles.UNTRAINED,
            new int[] {0, 2, 0, 0, 0, 0, 0, 0},
            1, 0,
    CombatPower.LIGHT, CombatMastery.NONE, CombatTypes.ATTACK
    );

    public static final CustomCombat TWIN_SLASH = CombatDatabase.KENJUTSU.createKenjutsu(
            "Twin Slash", smith,
    KenjutsuStyles.UNTRAINED,
            new int[] {0, 2, 0, 0, 0, 0, 0, 0},
            2, 0,
    CombatPower.LIGHT, CombatMastery.NONE, CombatTypes.ATTACK
    );

    public static final CustomCombat CLASH = CombatDatabase.KENJUTSU.createKenjutsu(
            "Clash", smith,
    KenjutsuStyles.UNTRAINED,
            new int[] {0, 2, 0, 0, 0, 0, 0, 0},
            1, 0,
    CombatPower.LIGHT, CombatMastery.NONE, CombatTypes.PARRY
    );

    public static final CustomCombat SMITH_BLOCK = CombatDatabase.KENJUTSU.createKenjutsu(
            "Block", smith,
    KenjutsuStyles.UNTRAINED,
            new int[] {0, 2, 0, 0, 0, 0, 0, 0},
            1, 0,
    CombatPower.LIGHT, CombatMastery.NONE, CombatTypes.BLOCK
    );

    public static final CustomCombat PERFECTED_SLASH = CombatDatabase.KENJUTSU.createKenjutsu(
            "Perfected Slash", smith,
    KenjutsuStyles.UNTRAINED,
            new int[] {0, 4, 0, 0, 0, 0, 0, 0},
            1, 0,
    CombatPower.LIGHT, CombatMastery.NONE, CombatTypes.ATTACK
    );

    public static final CustomCombat SMITH_DISARM = CombatDatabase.KENJUTSU.createKenjutsu(
            "Disarm", smith,
    KenjutsuStyles.UNTRAINED,
            new int[] {0, 1, 0, 0, 0, 0, 0, 0},
            1, 0,
    CombatPower.LIGHT, CombatMastery.NONE, CombatTypes.DISARM
    );

    public static final CustomCombat SMITH_PUNCH = CombatDatabase.TAIJUTSU.createTaijutsu(
            "Punch", smith,
    TaijutsuStyles.UNTRAINED,
            new int[] {1, 1, 0, 0, 0, 0, 0, 0},
            1, 0,
    CombatPower.LIGHT, CombatMastery.NONE, CombatTypes.ATTACK
    );

    public static final CustomCombat SMITH_KICK = CombatDatabase.TAIJUTSU.createTaijutsu(
            "Kick", smith,
    TaijutsuStyles.UNTRAINED,
            new int[] {0, 2, 0, 0, 0, 0, 0, 0},
            1, 0,
    CombatPower.LIGHT, CombatMastery.NONE, CombatTypes.ATTACK
    );

    public static final CustomCombat SMITH_GRAPPLE = CombatDatabase.TAIJUTSU.createTaijutsu(
            "Grapple", smith,
    TaijutsuStyles.UNTRAINED,
            new int[] {2, 0, 0, 0, 0, 0, 0, 0},
            1, 1,
    CombatPower.MEDIUM, CombatMastery.NONE, CombatTypes.GRAPPLE
    );

    public static final CustomCombat SMITH_TAI_BLOCK = CombatDatabase.TAIJUTSU.createTaijutsu(
            "Block", smith,
    TaijutsuStyles.UNTRAINED,
            new int[] {0, 1, 0, 0, 0, 0, 0, 0},
            1, 0,
    CombatPower.LIGHT, CombatMastery.NONE, CombatTypes.GRAPPLE
    );

    public static List<CustomCombat> SKILLS = List.of(
            SWEEP_KICK, COUNTER, HOOK, CUT, SCISSOR_KICK, POWER_SHOT, MARCO_BLOCK, SMITH_SLASH, TWIN_SLASH, CLASH, SMITH_BLOCK, PERFECTED_SLASH, SMITH_DISARM, SMITH_PUNCH, SMITH_KICK, SMITH_GRAPPLE, SMITH_TAI_BLOCK
    );

   /* public static final CustomCombat N/A = CombatDatabase.TAIJUTSU.createTaijutsu(
            "N/A", aster,
            TaijutsuStyles.,
            new int[] {0, 0, 0, 0, 0, 0, 0, 0},
            0, 0,
            CombatPower., CombatMastery., CombatTypes.
    );
     public static final CustomCombat N/A = CombatDatabase.KENJUTSU.createKenjutsu(
            "N/A", aster,
            KenjutsuStyles.,
            new int[] {0, 0, 0, 0, 0, 0, 0, 0},
            0, 0,
            CombatPower., CombatMastery., CombatTypes.
    );
    */

}
