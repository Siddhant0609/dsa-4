public class UnderstandingConst {
    int x, y;
    // init block - it is executed before constructor
    {
        System.out.println("Pre constructor call..." + x + " " + y);
    }
    UnderstandingConst() {
        System.out.println("Default constructor..." + x + " " + y);
    }
    public static void main(String[] args) {
        UnderstandingConst obj = new UnderstandingConst();
        System.out.println("X and Y is : " + obj.x + " " + obj.y);
    }
}
