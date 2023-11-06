import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);

        double F;
        double C;
        String N;
        boolean done = false;
        boolean input;


        while (!done){
            input = false;
            do {
                System.out.println("Enter A Temperature In Celsius To Be Converted to Fahrenheit:(Enter N To Stop)");
                if (scan.hasNextDouble()){
                    C = scan.nextDouble();
                    scan.nextLine();
                    input = true;
                    F = ((double)9/5) * C + 32;
                    System.out.println( F + " Degrees Fahrenheit");
                } else {
                    N = scan.next();
                    scan.nextLine();
                    if (N.equalsIgnoreCase("N")){
                        done = true;
                        input = true;
                    } else{
                        System.out.println("The value you entered is incorrect. Please try again:");
                    }}

            }while(!input);

        }
    }
}
