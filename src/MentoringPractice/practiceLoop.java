package MentoringPractice;

public class practiceLoop {

    public static void forLoop() {
        for (int i=0;i<=10;i++){
            System.out.println("*");
            for (int j=1; j<10-i;j++){
                System.out.print("*");
                for (int y=1; y>10+j;y--){
                    System.out.println("*");
                }
            }
             }
    }

    public static void main(String[] args) {
        practiceLoop.forLoop();

    }
}

