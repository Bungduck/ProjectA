public class WeaponOption {
    int weaponATK;

    public WeaponOption(int worst, int best){
        int ATKs[] = new int[best];
        ATKs[0] = 5;
        ATKs[1] = 6;
        ATKs[2] = 7;
        ATKs[3] = 8;


        for(int i = worst; i < best; ++i){

        }

        weaponATK = ATKs[(int)(Math.random() * ATKs.length)];

        System.out.println("무기 공격력은 " + weaponATK + " 입니다.");
    }

}
