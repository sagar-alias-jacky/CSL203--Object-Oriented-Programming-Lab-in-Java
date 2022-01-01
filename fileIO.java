import java.util.Scanner;
import java.io.*;

public class fileIO {
    public static void main(String[] args) {
        File file = new File("newFile.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out, true);
        String data = "";
        try (FileWriter fout = new FileWriter(file)) {
            pw.println("New file named newFile.txt has been created!");
            pw.println("Enter the text to be stored in the file(type 'q' to exit): \n");
            while (!data.equals("q")) {
                data = br.readLine();
                if (!data.equals("q")) {
                    fout.write(data);
                }
            }
            pw.println("\nThe data has been successfully written to the file newFile.txt");
        } catch (IOException e) {
            pw.println("\nError writing to the file: " + e);
        }
        try (Scanner fin = new Scanner(file)) {
            pw.println("\nReading from file newFile.txt");
            pw.println("\nThe contents of the file: ");
            while (fin.hasNextLine()) {
                data = fin.nextLine();
                pw.println(data);
            }
            pw.println("\nThe data has been read successfully from the file newFile.txt");
        } catch (FileNotFoundException e) {
            pw.println("\nError encountered while opening the specified file: " + e);
        }
    }
}