public class SwitchCase {
    public static void main(String[] args) {
        // int num = 100;
        // switch(num) {
        //     case 5 : System.out.println("Case 1 : " + num);
        //     break;
        //     case 10 : System.out.println("Case 2 : " + num);
        //     break;
        //     case 100 : System.out.println("Case 2 : " + num);
        //     break;
        //     default : System.out.println("Not a number");
        // }
        String language = "Java";
        String grade = "";
        switch(language) {
            case "Java" : grade = "a";
            break;
            case "Python" : grade = "b";
            break;
            case "C/C++" : grade = "c";
            default : grade = "d";
            break;
        }
        System.out.println("Your grade is : " + grade);

    }
}
