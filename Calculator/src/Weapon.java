public class Weapon {

    public int equipmentWeapon(String weaponName){

        return switch (weaponName) {
            case "Two-Handed Sword" -> 5;
            case "One-Handed Sword" -> 3;
            case "Bow" -> 8;
            case "Spear" -> 7;
            case "Wand" -> 6;
            default -> 0;
        };
        
        /*
        위와 동일
        if(weaponName == "Two-Handed Sword");
        if(weaponName == "One-Handed Sword");
        if(weaponName == "Bow");
        if(weaponName == "Spear");
        if(weaponName == "Wand");
         */
    }
}
