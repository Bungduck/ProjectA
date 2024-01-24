public class Heal {

    public boolean isFullHP(int health, int healamount){
        int remainHealth = health + healamount;
        return remainHealth >=0;
    }

    public void heal(int health, int healamount){
        boolean fullHP = isFullHP(health, healamount);
        if(fullHP){
            system.out.println("최대체력을 넘김");
        }
        else{
            system.out.println("최대체력이 아님");

        }
    }

}
