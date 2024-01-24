
public class Application {
    public static void main(String[] args) {
        //~~~~~~~실행하는 것들~~~~~~~~~~~
        //이것저것 선언하고 만들고 외부함수 들여와서 쓸거야.\

        int health = 10;
        int damage = 5;

        CalculatorModel c = new CalculatorModel();

        System.out.print(c.sub(health, damage));


    }
}
