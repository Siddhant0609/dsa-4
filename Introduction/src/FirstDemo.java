class FirstDemo {
    public static void main(String args[]) {
        // System.out.println(args[0]);
        // System.out.println(args[1]);
        
        // String fnum = args[0];
        // String snum = args[1];
        // String result = fnum + snum;

        // Recommended way to type cast
        if (args.length == 2) {
            int fnum = Integer.parseInt(args[0]);
            int snum = Integer.parseInt(args[1]);
            int result = fnum + snum;
            System.out.println("Sum is "+result);
        }
        else {
            System.out.println("Invalid Input");
        }
    }
}
