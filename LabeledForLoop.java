class LabeledForLoop {
    public static void main(String[] args) {
        outer:
        for(int i = 1; i < 5; i++) {
            for(int j = 2; j < 7; j++) {
                if(i == j) {
                    continue outer;
                    // break outer;
                }
                // else {
                //     System.out.println(i + " : " + j);
                // }
                System.out.println(i + " : " + j);
            }   
        }
    }
}
