import java.io.File;
import java.util.Scanner;
public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int option = 0;
        while(option != 5) {
            System.out.println("|================================================|");
            System.out.println("                    File Handler                 |");
            System.out.println("|================================================|");
            System.out.println("| 1.Create a File                                |");
            System.out.println("| 2.Write on existing File                       |");
            System.out.println("| 3.Rename a File                                |");
            System.out.println("| 4.Read a File                                  |");
            System.out.println("| 5.Exit                                         |");
            System.out.println("|================================================|");
            System.out.println("|        CHOOSE AN OPTION (1/ 2/ 3/ 4/ 5)        |");
            System.out.println("|================================================|");

            System.out.println();
            System.out.println("Enter an Option: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Enter the file name: ");
                    String fn = scanner.nextLine();
                    System.out.println("What you want to write: ");
                    String fc = scanner.nextLine();
                    createFile();
                case 2:

            }
        }



    }
    public static void createFile() {

    }
}
