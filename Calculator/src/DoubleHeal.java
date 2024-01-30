public class DoubleHeal {

    public void doubleHeal(int maxHP, int health, int healamount){
        Heal h = new Heal();
        int resentHP = health;

        // i 변수를 이용해서 2번 회복하시오.
        for(int i = 0; i < 3; ++i ) {
            resentHP +=maxHP ;
            boolean fullHP = h.isFullHP(maxHP,health,healamount);
                return;
            if (fullHP) {
                System.out.println("최대체력을 넘김");
                break;
            } else {
                System.out.println("회복 " + i + "회");
            }
        }
    }
}
