package Dictionary;

public class SearchData {

    public void searchData(String[] Data, int goalID){
        // i++ => 우선순위가 가장낮은 i += 1
        //int a = 1;
        //++a;    // a에다가 1을 더한다. 우선순위가 가장 빠름.
        //a++;    // a에다가 1을 더한다. 우선순위가 가장 느림.
        //System.out.println(a++);
        //System.out.println(a);

        // 1번째 방법 전수조사 보통 for문을 사용해.
        // for문 첫번째 초기식, 두번째 조건식, 세번째 증감식
        for(int i = 0; i < Data.length; ++i){
            System.out.print(".");
            if(i == goalID) {
                System.out.println(Data[i]);
                break;
            }
        }

        // 2번째 방법은 이진탐색 방법.
        // while문은 쓴다.
        int leftpivot = 0, rightpivot = Data.length - 1;
        while(leftpivot <= rightpivot){
            int mid = (leftpivot + rightpivot) / 2;
            System.out.print(".");
            if(mid == goalID){
                System.out.println(Data[mid]);
                break;
            }

            if(mid < goalID) leftpivot = mid + 1;
            else rightpivot = mid;
        }

    }


    // arrays 배열안에 있는 값들 중에서 goalNum이 있는지 탐색하는거야.
    public boolean searchArrayData(int[] arrays, int goalNum) {
        for (int i = 0; i < arrays.length; ++i) {
            if (i == goalNum) ;


        }
        return true;

    }
}
