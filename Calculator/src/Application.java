import Dictionary.MonsterDictionary;
import Dictionary.SearchData;

public class Application {
    public static void main(String[] args) {
        //~~~~~~~실행하는 것들~~~~~~~~~~~
        //이것저것 선언하고 만들고 외부함수 들여와서 쓸거야.\

        /*
        Weapon w = new Weapon();
        int health = 10;
        int damage = w.equipmentWeapon("Bow");

        Hit hit = new Hit();

        hit.damaged(0.5, health, damage);
        */

//        MonsterDictionary mD = new MonsterDictionary();
//        SearchData sD = new SearchData();
//
//        sD.searchData(mD.monsterData, 444);
//
//        DoubleHeal dH = new DoubleHeal();
//        dH.doubleHeal(10, 5, 3);

//        WeaponOption wO = new WeaponOption(30,35);

        SearchData sD = new SearchData();
        
        int[] arr = {5, 10, 15, 20, 25};
        int goal = 7;

        if(sD.searchArrayData(arr, goal)){
            System.out.println("일치하는 것을 찾았습니다.");    
        }
        else{
            System.out.println("일치하는 것을 찾지 못했습니다.");
        }
        


    }
}
