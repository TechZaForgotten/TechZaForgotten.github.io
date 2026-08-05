class NarutoCharacters {
    constructor(name, health, maxHealth, chakra, maxChakra, stamina, maxStamina,
    ninjutsuHours, taijutsuHours, kenjutsuHours, shurikenjutsuHours, genjutsuHours,
    stealth, speed, perception,
    healthProf, staminaProf, chakraProf,
    stealthProf, speedProf, perceptionProf,
    ninjutsuProf, taijutsuProf, kenjutsuProf, shurikenjutsuProf, genjutsuProf,
    everythingProf,
    chakraMult, staminaMult,
    damageBonus, damageReduction,
    speedMult, strengthMult) {
    this.name = name;
    this.health = health;
    this.maxHealth = maxHealth;
    this.chakra = chakra;
    this.maxChakra = maxChakra;
    this.stamina = stamina;
    this.maxStamina = maxStamina;
    this.hours = [ninjutsuHours, taijutsuHours, kenjutsuHours, shurikenjutsuHours, genjutsuHours];
    this.stats = [stealth, speed, perception];
    this.proficiencies = [healthProf, staminaProf, chakraProf,
    stealthProf, speedProf, perceptionProf,
    ninjutsuProf, taijutsuProf, kenjutsuProf, shurikenjutsuProf, genjutsuProf];
    this.everythingProf = everythingProf;
    this.chakraMult = chakraMult;
    this.staminaMult = staminaMult;
    this.damageBonus = damageBonus;
    this.damageReduction = damageReduction;
    this.speedMult = speedMult;
    this.strengthMult = strengthMult;
    }
}

export const characterDatabase = {
    // Team 0
    aoi: new NarutoCharacters

}