package Study;

// 아래는 캐릭터를 생성하는 기본 틀입니다.
// 여기는 플레이어가 될 수도 있고, 몬스터가 될 수도 있습니다.
// 아래 Unit 클래스에는 HP, ATK, DEF이 있으며
// 각각의 캐릭터는 체력이 0 이하가 되면 사망하는 메시지를 출력합니다.
// 각각의 캐릭터는 공격 메소드를 가지고 있습니다.
public class Unit {
    private int hp;
    private int atk;
    private int def;

    public Unit(int hp, int atk, int def) {
        this.hp = hp;
        this.atk = atk;
        this.def = def;
    }

    public boolean isDead(){
        if(hp < 0) {
            System.out.println("캐릭터가 사망했습니다.");
            return true;
        }
        else{
            return false;
        }
    }

    public void attack(Unit target){
        int trueDamage = atk - target.def;
        if(trueDamage < 0) trueDamage = 0;
        target.hp -= trueDamage;
    }


    public void display() {
        System.out.println(hp + " " + atk + " " + def);
    }

}
