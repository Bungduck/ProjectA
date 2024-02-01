public class SumDamage {

    public void keepHit(int health, int[] dmgArr){
        for(int i = 0; i < dmgArr.length; ++i){
            health -= dmgArr[i];
            // 현재 피해를 몇 입혔는지 추가로 출력하시오.

            if(){
                System.out.println("캐릭터가 죽었습니다.");
                return;
            }
        }
        System.out.println("피해를 입은 후 남은 체력은 " + health + " 입니다.");
    }

}
