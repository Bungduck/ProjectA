public class If {

    public If(){
        // true나 false값의 boolean타입의 변수가 들어가야지.
        // 조건식이 들어가 이를 판단해주는 연산자가 뭐야.
        // &&, ||, <, >, ==, !, <=, >=
        int a = 3;
        if(a < 5){
            System.out.println("C");
        }
        else if(a < 10){
            System.out.println("B");
        }
        else if(a < 15){
            System.out.println("A");
        }
        else{ // a >= 15
            System.out.println("S");
        }

        char n = 'a';
        int num = '0';

        switch(n){
            case '0': case '1': case '2': case '3': case '4':
                // System.out.println("C");
                break;
            case '5': break;
            default:
        }

        int score = 100;
    }
}
