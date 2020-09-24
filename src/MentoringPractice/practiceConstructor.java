package MentoringPractice;

public class practiceConstructor {

    String name;
    String address;
    static int zipcode = 49120;

    public practiceConstructor(String name, String address) {
        this.name = name;
        this.address = address;


    }

    public void printAddress (){
        System.out.println(name +" the name of citizen, who lives in " +address+" "+zipcode);
    }

    /**
     * Making a main method to run all the required modules
     * @param args
     * Author: Aldrin Malakar
     * Date: 09-24-20
     */
    public static void main(String[] args) {
        /*
        What are objects?
        What we construct out of a class is object. It has attributes such as weight and color,
        or address and phone numbers etc.
         */

        practiceConstructor infoCitizen = new practiceConstructor("Aldrin", "LakeShore Apts, Michigan");
        practiceConstructor infoCitizen1 = new practiceConstructor("Chad", "DQ Head office, Michigan");
        practiceConstructor infoCitizen2 = new practiceConstructor("Rebecca", "EaglePoint castle, Michigan");


        /*

        Now we initialize the constructor variable.
         */
        infoCitizen.printAddress();
        infoCitizen1.printAddress();
        infoCitizen2.printAddress();


    }
}
