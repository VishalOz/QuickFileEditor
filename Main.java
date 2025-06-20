import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

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
                    createFile(fnl1, fc1);
                    break;

                case 2:
                    System.out.println("Enter the file name or location: ");
                    String fnl2 = scanner.nextLine();
                    System.out.println("What you want to write: ");
                    String fc2 = scanner.nextLine();
                    writeFile(fnl2, fc2);
                    break;

                case 3:
                    System.out.println("Enter the file name or location: ");
                    String fnl3 = scanner.nextLine();
                    System.out.println("What do you want to rename it: ");
                    String fr1 = scanner.nextLine();
                    renameFile(fnl3, fr1);
                    break;

                case 4:
                    System.out.println("Enter the file name or location: ");
                    String fnl4 = scanner.nextLine();
                    readFile(fnl4);
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
    public static void createFile(String fnl1, String fc1 ) {
        File file = new File(fnl1);
        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            }else{
                System.out.println("File already created.");
            }
        }catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void writeFile(String fnl2, String fc2) {
        try {
            FileWriter filewriter = new FileWriter(fnl2);
            filewriter.write(fc2);
            filewriter.close();
            System.out.println("Successfully wrote to "+ fnl2);
        }catch (Exception e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public static void renameFile(String fnl3 , String fr1) {

    }
    public static void readFile(String fnl4) {
        try {
            File file = new File(fnl4);
            Scanner reader =  new Scanner(fnl4);
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }
            reader.close();
        }catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
