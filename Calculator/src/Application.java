import Study.Unit;

public class Application {
    public static void main(String[] args) {
        Unit player = new Unit(50, 20, 4); // HP, ATK, DEF
        Unit monster = new Unit(100, 5, 5); // HP, ATK, DEF

        while(!player.isDead() || !monster.isDead()){
            player.attack(monster);
            if(monster.isDead()) break;
            monster.attack(player);
        }

        player.display();
        monster.display();
    }
}
