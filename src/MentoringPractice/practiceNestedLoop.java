package MentoringPractice;

public class practiceNestedLoop {

    /*
    1 2 3 4
    5 6 7
    7 8
    9
     */
    static int a = 1;

    public static void main(String[] args) {

//        for (int i = 0; i < 10; i++) {
//            for (int j = 1; j <= 4 - i; j++) {
//                System.out.print(a + " ");
//                a++;
//            }
//            System.out.println(" ");
//        }
        /*
    1
    2 3
    4 5 6
    7 8 9 10
     */

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a + " ");
                a++;
            }
            System.out.println(" ");

        }

    }
}


