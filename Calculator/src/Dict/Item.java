package Dict;

public class Item{
    public int code;
    private String name;
    int category; // 1번은 장비, 2번은 소비, 3번은 기타아이템;

    public Item(int code, String name, int category){
        this.code = code;
        this.name = name;
        this.category = category;
    }

}
