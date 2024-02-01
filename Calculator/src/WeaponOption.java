public class WeaponOption {
    int weaponATK;

    // best = 8, worst = 5
    public WeaponOption(int worst, int best){
        int ATKs[] = new int[best - worst + 1];

        for(int i = 0; i < ATKs.length; ++i){
            ATKs[i] = worst + i;
        }

        weaponATK = ATKs[(int)(Math.random() * ATKs.length)];

        System.out.println("무기 공격력은 " + weaponATK + " 입니다.");
    }

}
