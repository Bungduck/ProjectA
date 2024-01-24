
public class Application {
    public static void main(String[] args) {
        //~~~~~~~실행하는 것들~~~~~~~~~~~
        //이것저것 선언하고 만들고 외부함수 들여와서 쓸거야.\

        Weapon w = new Weapon();
        int health = 10;
        int damage = w.equipmentWeapon("Bow");

        Hit hit = new Hit();

        hit.damaged(0.5, health, damage);


    }
}
