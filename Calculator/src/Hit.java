public class Hit {

    public boolean isDeath(int health, int attackDamage) {
        int remainHealth = health - attackDamage;
        return remainHealth <= 0;
    }

    public void damaged(int health, int attackDamage){
        boolean died = isDeath(health, attackDamage);

        if(died){
            System.out.println("죽음.");
        }
        else{
            System.out.println("살아있음.");
        }

        /*
        if 내부에 들어가는 식이 조건식인데. 여기에는 boolean 타입.
        boolean 자료형이 들어가거나,
        이항조건연산자로 이루어진 식이 들어감.
        < , > , <= , >=, &&, ||
        단항연산자
        !



         */

    }

}

/*

변수의 종류에는 4가지 정도 있어.

정수
int, short, long

실수
float, double

문자(문자열)
char, String

불타입
boolean


 */