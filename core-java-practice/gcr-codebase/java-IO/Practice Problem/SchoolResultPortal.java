import java.io.*;
public class SchoolResultPortal {
    public static void main(String[] args) {

        String inputFile = "students.txt";
        String outputFile = "reportcard.txt";

        try {
            FileReader fr = new FileReader(inputFile);
            BufferedReader br = new BufferedReader(fr);

            FileWriter fw = new FileWriter(outputFile, true);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("====================================");
            bw.newLine();
            bw.write("        STUDENT REPORT CARD");
            bw.newLine();
            bw.write("====================================");
            bw.newLine();

            String line;

            while ((line = br.readLine()) != null) {

                String[] data = line.split(" ");

                String name = data[0];

                int total = 0;

                for (int i = 1; i < data.length; i++) {
                    total += Integer.parseInt(data[i]);
                }

                double average = (double) total / (data.length - 1);

                bw.write("Name    : " + name);
                bw.newLine();
                bw.write("Average : " + String.format("%.2f", average));
                bw.newLine();
                bw.write("------------------------------------");
                bw.newLine();
            }

            br.close();
            bw.close();

            System.out.println("Report card generated successfully.");

        }
        catch (FileNotFoundException e) {
            System.out.println("Error: Input file not found.");
        }
        catch (IOException e) {
            System.out.println("Error while reading/writing file.");
        }
        catch (NumberFormatException e) {
            System.out.println("Invalid marks found in the file.");
        }
    }
}