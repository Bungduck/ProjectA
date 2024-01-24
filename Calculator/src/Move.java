public class Move {
    public int leftWallXPos = -10;
    public int rightWallXPos = 10;

    public int move(int charPos, int moveDistance){
        int resultCharPos = charPos + moveDistance;

        if(leftWallXPos < resultCharPos && resultCharPos < rightWallXPos){
            System.out.print("이동할 수 있음");
            return resultCharPos;
        }
        else{
            System.out.print("이동할 수 없음");
            return charPos;
        }
    }

}
