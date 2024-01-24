public class CriticalHit {

    public boolean isCritial(double criticalProbability){
        // 반환타입이 double 랜덤으로 0~1사이의 숫자를 반환해주는 자바 내장함수야.
        return Math.random() < criticalProbability;
    }

        
}

/*

확률을 표현할 때는 보통
0 ~ 1 사이의 실수를 써.

0.05 이하면 5% 확률 성공

매개변수로 1을 준다.

1 이하의 수 : 항상 성립하니까 이건 100%

 */
