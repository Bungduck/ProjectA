public class Variable {
    // 정수
    short si; // 2Byte 저장
    int i; // 4Byte 저장
    long l; // 8Byte 저장
    
    // 실수
    float f; // 4Byte 저장
    double d; // 8Byte 저장
    
    // 문자열
    String s; // 일종의 객체와 같은 개념이라서 입력받은 값에 따라서 메모리 할당이 달라짐. 얘는 유동적임.
    
    // 문자
    char c; // 1Byte

    Variable(){
        i = 10;
        d = 3.1;
        s = "Apple";
        c = 'c';
    }

}
