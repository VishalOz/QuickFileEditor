import java.util.Scanner;
public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int option = 0;
        boolean running = true;
        while(running) {
            System.out.println("|================================================|");
            System.out.println("|                  File Handler                  |");
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
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.println("Enter the file name or location: ");
                    String fnl1 = scanner.nextLine();
                    System.out.println("What you want to write: ");
                    String fc1 = scanner.nextLine();
                    createFile();
                    break;

                case 2:
                    System.out.println("Enter the file name or location: ");
                    String fnl2 = scanner.nextLine();
                    System.out.println("What you want to write: ");
                    String fc2 = scanner.nextLine();
                    writeFile();
                    break;

                case 3:
                    System.out.println("Enter the file name or location: ");
                    String fnl3 = scanner.nextLine();
                    System.out.println("What do you want to rename it: ");
                    String fr1 = scanner.nextLine();
                    renameFile();
                    break;

                case 4:
                    System.out.println("Enter the file name or location: ");
                    String fnl4 = scanner.nextLine();
                    readFile();
                    break;

                case 5:
                    System.out.println("Exiting the program...");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid input !!! check the Diagram.");




            }
        }



    }
    public static void createFile() {

    }

    public static void writeFile() {

    }
    public static void renameFile() {

    }
    public static void readFile() {

    }
}
