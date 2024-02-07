package Study;

public class SFor {
    public SFor() {
        // 소수의 특징 1과 자기 자신을 약수로 갖는 수.
        // 약수 : 어떤 수를 나눌 수 있는 수.
        // 어떤 수를 표현하기 위한 최소한의 단위 수.
        // 12라는 숫자있으면 2^2 * 3^1. 여기서 2랑 3이 소수야.
        // 4라는거 보면 2^2 2로 표현이 되는 수. 근데 2는 2말고는 표현이 안돼. 2는 약수로 1과 2밖에 없기 때문에.
        // 1은 약수가 1개야 1하나밖에 없어서 그래서 1은 소수가 아님.
        // 2, 3, 5, 7, 11, 13, 17, 19, ...

        // 문제: 1부터 50이하의 소수를 모두 출력하는 프로그램을 만드시오.
        // Start
        int primnum;
        int j = 0;
        int i;
        for (i = 2; i <= 50; ++i) {
            j = 0;
            for (primnum = 2; primnum < i; ++primnum) {
            }
            if (i % primnum == 0)
                j += 1;
        }
        if (j == 0)
            System.out.println(i + "소수");

    }
        }
        // End


