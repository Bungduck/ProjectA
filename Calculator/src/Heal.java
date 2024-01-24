public class Heal {
    public boolean isFullHP(int maxHP, int health, int healamount){
        int remainHealth = health + healamount;
        return remainHealth >= maxHP;
    }

    public void heal(int maxHP, int health, int healamount){
        boolean fullHP = isFullHP(maxHP, health, healamount);
        if(fullHP){
            System.out.println("최대체력을 넘김");
        }
        else{
            System.out.println("최대체력이 아님");
        }
    }

}
/*
모든 클래스는 대문자로 시작해. 이건 만국 공통의 절대적 질서같은 느낌.

모든 메소드는 소문자로 시작해. 이건 절대적보다는 70~80% 확신이 드는 암묵적 룰.
함수 = 메소드

모든 변수이름은 소문자로 시작해. 이것도 70~80% 확신
예외: 변하지 않는 변수는 모든 문자가 대문자임.
ex ) GOALEXP = 1000;

 */
