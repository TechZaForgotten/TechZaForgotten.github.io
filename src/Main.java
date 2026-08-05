import characterstuff.CharacterDatabase;
import characterstuff.NarutoCharacters;
import characterstuff.TrainingDifficulty;
import combatstuff.CustomCombat;
import jutsustuff.CustomJutsu;

import static characterstuff.CharacterDatabase.*;
import static characterstuff.TrainingDifficulty.*;
import static characterstuff.TrainingTypes.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
    void main() {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        IO.println("Super cool calculator GO!");

        System.out.println("------------------------------------------------------");
/* Momo
water.jutsuCreation("Sea Piercer", 0,4,0,0,0,0,0,0,60,60,1,true,false,false,false,false,true,false,false,false,false);
water.jutsuCreation("Typhoon Fist", 0,0,0,0,0,0,0,0,0,0,1,true,false,false,false,false,false,true,false,false,false);
water.jutsuCreation("Water Gunshot", 0,4,0,0,0,0,0,0,40,40,0,false,false,false,true,false,false,false,false,true,false);
water.jutsuCreation("Water Gunshot: Rainfall", 0,4,0,0,0,0,0,0,50,50,0,false,true,false,false,false,false,true,false,false,false);

taijutsu.createCombat("Strong Right", 0,4,0,0,0,0,0,0,60,0,0,0,false,false,true,false,false);
taijutsu.createCombat("Rough Waves", 0,1,0,0,0,0,0,0,60,0,3,0,false,false,true,false,false);
taijutsu.createCombat("Defensive Position", 0,2,0,0,0,0,0,0,60,0,0,0,false,true,false,false,false);
taijutsu.createCombat("Redirecting Current", 0,1,0,0,0,0,0,0,60,0,0,1,true,false,false,false,false);
taijutsu.createCombat("Calm Zone", 0,4,0,0,0,0,0,0,60,0,0,0,false,false,false,true,false);

System.out.println("------------------------------------------------------");

// Konan
water.jutsuCreation("Water Authority", 0,0,0,0,0,0,0,0,0,0,1,true,false,false,false,false,false,false,true,false,false);
water.jutsuCreation("Tidal Wave", 0,2,0,0,0,0,0,0,40,0,0,true,false,false,false,false,false,false,true,false,false);
fire.jutsuCreation("Fire Authority", 0,0,0,0,0,0,0,0,0,0,1,true,false,false,false,false,false,false,true,false,false);
fire.jutsuCreation("Blazing Glory", 0, 4,0,0,0,0,0,0,30,5,1,false,true,false,false,false,false,false,true,false,false);

kenjutsu.createCombat("Whirling Defense", 0,2,0,0,0,0,0,0,50,0,0,1,false,true,false,false,false);
kenjutsu.createCombat("Twirling Barrage",1,0,0,0,0,0,0,0,50,0,3,0,false,false,true,false,false);
kenjutsu.createCombat("Defense Breaker",0,4,0,0,0,0,0,0,50,0,0,1,false,false,true,false,false);
kenjutsu.createCombat("Lowered Arms", 0,4,0,0,0,0,0,0,50,0,0,0,true,false,false,false,false);
kenjutsu.createCombat("Wall Bypass", 0,2,0,0,0,0,0,0,50,0,0,1,false,false,true,false,false);
kenjutsu.createCombat("Forced Respect", 0,1,0,0,0,0,0,0,50,0,0,1,false,false,true,false,false);
kenjutsu.createCombat("Vengeance", 0,2,0,0,0,0,0,0,50,0,2,1,true,false,false,false,false);
kenjutsu.createCombat("Perception Bypass", 0,2,0,0,0,0,0,0,50,0,0,0,false,false,false,false,true);
kenjutsu.createCombat("Leader's Javelin", 0,4,0,0,0,0,0,0,50,0,0,1,false,false,true,false,false);

System.out.println("------------------------------------------------------");

// Mochira
fire.jutsuCreation("Heatwave", 0, 2,0,0,0,0,0,0,40,5,0,true,false,false,false,false,false,true,false,false,false);
earth.jutsuCreation("Mallet Hardening", 0,0,0,0,0,0,0,0,0,0,1,true,false,false,false,false,false,true,false,false,false);
earth.jutsuCreation("Mochi Bowl", 0, 2, 0,0,0,0,0,0,40,15,0,false,false,false,false,true,false,true,false,false,false);
lightning.jutsuCreation("Dazling Bolt", 4,0,0,0,0,0,0,0,40,40,0,false,false,false,true,false,false,true,false,false,false);

kenjutsu.createCombat("Mochi Pounder", 0, 2,0,0,0,0,0,0,75,0,0,1,false,false,true,false,false);
kenjutsu.createCombat("Hunger Stopper", 0,2,0,0,0,0,0,0,75,0,0,0,false,true,false,false,false);
kenjutsu.createCombat("Treat Pounding", 2,0,0,0,0,0,0,0,75,0,3,0,false,false,true,false,false);
kenjutsu.createCombat("Uppercut...?", 0,4,0,0,0,0,0,0,75,0,0,0,false,false,true,false,false);


 */
        System.out.println("------------------------------------------------------");

        caution.train(HEALTH, 9, new int[] {0,4,0,1}, 5, 0, HARDCORE);
        caution.train(STEALTH, 9, new int[] {0,4,0,1}, 5, 0, HARDCORE);
        caution.train(SPEED, 9, new int[] {0,4,0,1}, 5, 0, HARDCORE);
        caution.train(PERCEPTION, 9, new int[] {0,4,0,1}, 5, 0, HARDCORE);
        caution.train(CHAKRA, 5, new int[] {0,4,0,1}, 5, 0, HARDCORE);
        caution.train(STAMINA, 4, new int[] {0,4,0,1}, 5, 0, HARDCORE);
        caution.train(NINJUTSU, 4, new int[] {0,4,0,1}, 5, 0, HARDCORE);
        caution.train(KENJUTSU, 5, new int[] {0,4,0,1}, 5, 0, HARDCORE);

        caution.train(HEALTH, 4, new int[] {0,4,0,0}, 10, 0, HARDCORE);
        caution.train(SPEED, 4, new int[] {0,4,0,0}, 10, 0, HARDCORE);
        caution.train(STAMINA, 4, new int[] {0,4,0,0}, 10, 0, HARDCORE);

        tori.train(HEALTH, 9, new int[] {0,4,0,1}, 5, 0, HARDCORE);
        tori.train(STEALTH, 9, new int[] {0,4,0,1}, 5, 0, HARDCORE);
        tori.train(SPEED, 9, new int[] {0,4,0,1}, 5, 0, HARDCORE);
        tori.train(PERCEPTION, 9, new int[] {0,4,0,1}, 5, 0, HARDCORE);
        tori.train(CHAKRA, 5, new int[] {0,3,1,1}, 5, 0, HARDCORE);
        tori.train(STAMINA, 4, new int[] {0,4,0,1}, 5, 0, HARDCORE);
        tori.train(NINJUTSU, 5, new int[] {0,3,1,1}, 5, 0, HARDCORE);
        tori.train(TAIJUTSU, 4, new int[] {0,2,0,2}, 5, 0, HARDCORE);

        tori.train(HEALTH, 4, new int[] {0,4,0,0}, 10, 0, HARDCORE);
        tori.train(SPEED, 4, new int[] {0,4,0,0}, 10, 0, HARDCORE);
        tori.train(STAMINA, 4, new int[] {0,4,0,0}, 10, 0, HARDCORE);

        virgil.train(HEALTH, 9, new int[] {0,4,0,1}, 5, 0, HARDCORE);
        virgil.train(STEALTH, 9, new int[] {0,4,0,1}, 5, 0, HARDCORE);
        virgil.train(SPEED, 9, new int[] {0,4,0,1}, 5, 0, HARDCORE);
        virgil.train(PERCEPTION, 9, new int[] {0,4,0,1}, 5, 0, HARDCORE);
        virgil.train(CHAKRA, 5, new int[] {0,3,1,1}, 5, 0, HARDCORE);
        virgil.train(STAMINA, 4, new int[] {0,4,0,1}, 5, 0, HARDCORE);
        virgil.train(NINJUTSU, 5, new int[] {0,3,1,1}, 5, 0, HARDCORE);
        virgil.train(KENJUTSU, 4, new int[] {0,4,0,1}, 5, 0, HARDCORE);

        virgil.train(HEALTH, 4, new int[] {0,4,0,0}, 10, 0, HARDCORE);
        virgil.train(SPEED, 4, new int[] {0,4,0,0}, 10, 0, HARDCORE);
        virgil.train(STAMINA, 4, new int[] {0,4,0,0}, 10, 0, HARDCORE);

     /*   CharacterDatabase.aster.trainHealth(5, 2, 8, 0, 2, 1, 0);
        CharacterDatabase.smith.trainHealth(5, 2, 8, 0, 1, 1, 0);
        CharacterDatabase.marco.trainHealth(5, 2, 8, 0, 1, 1, 0);
        CharacterDatabase.osty.trainHealth(5, 0, 2, 9, 1, 1, 0);
        CharacterDatabase.aoi.trainHealth(5, 12, 0, 0, 1, 1, 0);
    */
       // showJutsus(selectedChar);
       // showSkills(selectedChar);

}

private void showJutsus(NarutoCharacters character) {
    String selectedChar = character.name();

    List<CustomJutsu> jutsuDatabase = Jutsus.JUTSUS;

    System.out.println("List Of Jutsus!");
    System.out.println("----------------------------------------------------");
    for (CustomJutsu customJutsu : jutsuDatabase) {
        if (Objects.equals(customJutsu.creatorName,selectedChar)) {
            customJutsu.displayInfo();
        }

    }
}

private void showSkills(NarutoCharacters character) {
    String selectedChar = character.name();

    List<CustomCombat> skillDatabase = Skills.SKILLS;

    System.out.printf("%n-----------------------------------------------------%n");
    System.out.println("List Of Skills!");
    System.out.println("----------------------------------------------------");
    for (CustomCombat customCombat : skillDatabase) {
        if (Objects.equals(customCombat.creator, selectedChar)) {
            customCombat.displayInfo();
        }
    }

}
