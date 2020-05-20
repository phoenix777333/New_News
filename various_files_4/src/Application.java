import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Application {

    public static void main(String[] args) throws IOException {

        String pizza = "Pizza 75.00 2";
        String kebab = "Kebab 45.00 1";
        String cola = "Cola 9.50 3";

        double Prices = 75.00 + 45.00 + 9.50;

        FileWriter desires = new FileWriter("../desires.txt");
        desires.write(pizza + kebab + cola);
        desires.close();

        File file = new File ("../desires.txt");

            if (file.exists()) {
                System.out.println("File is founded on disk...");
                Scanner in = new Scanner( file );

                for (int i = 0; i<=2; i++) {
                    String base_print = in.nextLine();
                    System.out.println(base_print);
                }

                System.out.println("Prices : " + Prices);
            } else
                System.out.println("Files is missing?");

    }


}
