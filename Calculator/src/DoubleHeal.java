public class DoubleHeal {

    public void doubleHeal(int maxHP, int health, int healamount){
        Heal h = new Heal();
        int resentHP = health;

        // i 변수를 이용해서 2번 회복하시오.
        for(int i = 1; i <= 2; ++i ) {
            System.out.println("현재체력 : " + resentHP);
            resentHP += healamount;
            boolean fullHP = h.isFullHP(maxHP,resentHP,0);
            if (fullHP) {
                System.out.println("최대체력을 넘김");
                break;
            } else {
                System.out.println("회복 " + i + "회");
            }
            System.out.println("회복 후 HP : " + resentHP);
        }

    }
}
