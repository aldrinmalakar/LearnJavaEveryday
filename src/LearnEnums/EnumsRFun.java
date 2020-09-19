package LearnEnums;

enum Flavor {
    VANILLA, COFFEE, SUGAR, SALT, NUTMEG;
        }

 public class EnumsRFun {

     public static void main(String[] args) {

         Flavor f = Flavor.COFFEE;

         switch (f){
             case COFFEE:
                 System.out.println("Coffee is a blood of working class people!");
         break;
         }

     }

    }

