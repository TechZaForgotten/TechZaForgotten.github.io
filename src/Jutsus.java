import characterstuff.CharacterDatabase;
import characterstuff.NarutoCharacters;
import jutsustuff.*;

import java.util.List;

import static characterstuff.CharacterDatabase.*;

public class Jutsus {

    static NarutoCharacters test = CharacterDatabase.osty;

    /**
     * Dices go as so {d4, d6, d8, d10, d12, d20, d48, d100}
     */

public static final CustomJutsu Test = ChakraNatureDatabase.LIGHTNING.jutsuCreation(
        "Penis",test,
        new int[]{0, 0, 0, 0, 0, 0, 0, 1},
        0, 0,
        0, 0,
        JutsuType.BEAM, JutsuChakraInput.MASSIVE, JutsuShape.FORMLESS
    );

public static final CustomJutsu BuffTest = ChakraNatureDatabase.LIGHTNING.imbueCreation(
        "Penis2", test,
        0, 0,
        0,
        false
);



public static final CustomJutsu AIR_BULLET = ChakraNatureDatabase.WIND.jutsuCreation(
        "Air Bullet",aster,
        new int[]{1, 1, 0, 0, 0, 0, 0, 0},
        25, 30,
        2, 0, JutsuType.MULTI, JutsuChakraInput.MEDIUM, JutsuShape.BASIC
);

    public static final CustomJutsu FIRE_WAVE = ChakraNatureDatabase.FIRE.jutsuCreation(
        "Fire Blast", aster,
        new int[]{0, 3, 0, 0, 0, 0, 0, 0},
            15, 20,
            1, 0,
    JutsuType.WAVE, JutsuChakraInput.LARGE, JutsuShape.FORMLESS
    );

    public static final CustomJutsu LIGHTNING_MOVE = ChakraNatureDatabase.LIGHTNING.jutsuCreation(
        "Stupid Ass Lightning Move",aster,
        new int[]{3, 0, 0, 0, 0, 0, 0, 0},
            30, 40,
            1, 0,
    JutsuType.SINGLE, JutsuChakraInput.MEDIUM, JutsuShape.BASIC
    );

    public static final CustomJutsu EARTH_WALL = ChakraNatureDatabase.EARTH.jutsuCreation(
        "Earth Wall",aster,
        new int[]{0, 2, 0, 0, 0, 0, 0, 0},
            20, 0,
            1, 0,
    JutsuType.BARRIER, JutsuChakraInput.MEDIUM, JutsuShape.BASIC
    );

    public static final CustomJutsu AIR_BOOST_THING = ChakraNatureDatabase.WIND.jutsuCreation(
        "Air Boost Thing",aster,
        new int[]{1, 0, 0, 0, 0, 0, 0, 0},
            40, 25,
            1, 1,
    JutsuType.BLAST, JutsuChakraInput.SMALL, JutsuShape.BASIC
    );

    public static final CustomJutsu WATER_VEIL = ChakraNatureDatabase.WATER.jutsuCreation(
            "Water Veil",marco,
            new int[]{0, 3, 0, 0, 0, 0, 0, 0},
            0, 0,
            1, 0,
            JutsuType.BARRIER, JutsuChakraInput.MEDIUM, JutsuShape.BASIC
    );

    public static final CustomJutsu AKADO_CLAN_RELEASE = ChakraNatureDatabase.ABSORBTION.jutsuCreation(
            "Chakra Absorbtion",marco,
            new int[]{4, 0, 0, 0, 0, 0, 0, 0},
            0, 0,
            1, 0,
            JutsuType.CONTACT, JutsuChakraInput.MEDIUM, JutsuShape.FORMLESS
    );

    public static final CustomJutsu ENCHANT = ChakraNatureDatabase.ABSORBTION.jutsuCreation(
        "Enchant",marco,
        new int[]{4, 0, 0, 0, 0, 0, 0, 0},
            0, 0,
            1, 0,
    JutsuType.CONTACT, JutsuChakraInput.MEDIUM, JutsuShape.FORMLESS
    );

    public static final CustomJutsu BLUR = ChakraNatureDatabase.WIND.imbueCreation(
            "Blur", smith, 5, 0, 0,
            false
    );

    public static final CustomJutsu SMITH_FLAMETHROWER = ChakraNatureDatabase.FIRE.jutsuCreation(
        "Flamethrower",smith,
        new int[]{2, 0, 0, 0, 0, 0, 0, 0},
            0, 10,
            1, 0,
    JutsuType.WAVE, JutsuChakraInput.MEDIUM, JutsuShape.FORMLESS
    );

    public static final CustomJutsu SMITH_WINDBURST = ChakraNatureDatabase.WIND.jutsuCreation(
        "Wind Burst",smith,
        new int[]{2, 0, 0, 0, 0, 0, 0, 0},
            0, 10,
            1, 0,
    JutsuType.BLAST, JutsuChakraInput.MEDIUM, JutsuShape.BASIC
    );

    public static final CustomJutsu BLITZ = ChakraNatureDatabase.LIGHTNING.jutsuCreation(
            "Blitz", aoi,
            new int[]{0,0,0, 0, 8, 8, 0, 0},
            20, 50,
            1, 1,
            JutsuType.BEAM, JutsuChakraInput.COMPRESSED, JutsuShape.FULL_DRAGON
    );

    public static final CustomJutsu MINOR_BLITZ = ChakraNatureDatabase.LIGHTNING.jutsuCreation(
            "Minor Blitz", aoi,
            new int[]{0, 0, 0, 8, 8, 0, 0, 0},
            20, 50,
            1, 0,
            JutsuType.BEAM, JutsuChakraInput.LARGE, JutsuShape.FULL_DRAGON
    );

    public static List<CustomJutsu> JUTSUS = List.of(
            AIR_BULLET, FIRE_WAVE, LIGHTNING_MOVE, EARTH_WALL, AIR_BOOST_THING,
            WATER_VEIL, AKADO_CLAN_RELEASE,
            ENCHANT, BLUR, SMITH_FLAMETHROWER, SMITH_WINDBURST,
            BLITZ, MINOR_BLITZ
    );

/*
public static final CustomJutsu N/A = ChakraNatureDatabase..jutsuCreation(
        "N/A",test,
        new int[]{0, 0, 0, 0, 0, 0, 0, 0},
        0, 0,
        0, 0,
        JutsuType., JutsuChakraInput., JutsuShape.
    );
 */

}
