package Study;

public class SIf {

    public SIf(int score){
        // int score은 선언되고 값을 이미 받아온 상태임.
        // 아래에는 score에 따라 만점은 100점으로 설정하고
        // 90~100 : A, 80~89 : B, 70~79 : C, 60~69 : D, 60미만 : F
        // 를 출력하도록 조건문을 완성하시오.

        // Start

        if(score < 60){
            System.out.println("F");
        }
        else if (score < 70){
            System.out.println("D");
        }
        else if (score < 80){
            System.out.println("C");
        }
        else if (score < 90){
            System.out.println("B");
        }
        else if (score < 100){
            System.out.println("A");
        }
        // End
    }
}
