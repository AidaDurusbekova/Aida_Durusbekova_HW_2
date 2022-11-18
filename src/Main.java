import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(koion(28, 29));
        System.out.println(koion(16, 28));
        System.out.println(koion(47, 18 ));
        System.out.println(koion(58, -9));
        System.out.println(koion(70, 40));


        System.out.println(koion(generateRandomAge(),29));
        System.out.println(koion(generateRandomAge(),28));
        System.out.println(koion(generateRandomAge(),18));
        System.out.println(koion(generateRandomAge(),-9));
        System.out.println(koion(generateRandomAge(),48));

    }







public static String koion ( int age, int temp){

        if (age >= 20 || age <= 45 && temp <=-20 && temp >30 ){
            return "mojno idti gulyat";
        }
        if (age < 20 && temp >= 0 && temp <= 28){
            return "mojno idti gulyat";
        }
        if(age > 45 && temp >=-10 && temp <=20){
            return "mojno idti gulyat";
        }
        else {
            return "sidi doma";
        }
}
   public static int generateRandomAge(){
    Random age = new Random();
    return age.nextInt( 75);
}

}