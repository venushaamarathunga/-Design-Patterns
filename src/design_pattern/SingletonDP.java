package design_pattern;

public class SingletonDP {
    public static void main(String args[]){
        ClipBoard cp = ClipBoard.getClipBoard();
//        cp.setValue("venusha");
//        System.out.println(cp.value);
    }
}

class ClipBoard{
    private static ClipBoard clipBoard = new ClipBoard();
//    String value;
    private ClipBoard(){

    }

    static ClipBoard getClipBoard() {
        return clipBoard;
    }
//    public void setValue(String value){
//        this.value = value;
//    }
}