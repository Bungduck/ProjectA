package Study;

import java.lang.reflect.Array;

public class SArray {
    public SArray(){
        // 문자 배열을 10Byte 공간으로 선언한 후,
        // '0'부터 '9'까지 값으로 변수를 초기화하고
        // System.out.println() 함수를 이용해서
        // 총 0부터 9까지 값이 출력되도록 하시오.
        // Start
            
        char[] arr = {'0','1','2','3','4','5','6','7','8','9'};
        for(int i = 0; i < arr.length; ++i)
            System.out.println(arr[i]);

        char[] arr2 = new char[10];
        for(int i = 0; i < arr2.length; ++i){
            arr2[i] = (char) ('0' + i);
        }
        for(int i = 0; i < arr2.length; ++i)
            System.out.println(arr2[i]);

        // End
    }
}
