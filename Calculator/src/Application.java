import Dict.Item;
import Dict.Student;

public class Application {
    public static void main(String[] args) {

        Item suriken = new Item(1000, "뇌전", 2);
        Item slime = new Item(100, "슬라임의 액체", 3);

        Variable v = new Variable();

        Student s1 = new Student(2020123456, "홍길동");
        System.out.println("s1 학생의 이름은" + s1.name + "입니다.");

    }
}

// 이클립스랑 Intellij랑 그냥 똑같이 자바 실행시키는 거라서 상관없어.
