import org.w3c.dom.ls.LSOutput;

import java.io.*;

public class Main{
public static void main(String[] args) {
    String[] Cameras = {"MIRRORLESS", "DSLR"};
    double[][] Costs = {{10500, 8500}, {9500, 7200}, {12000, 8000}};
    double maxDiff = 0;
    String maxCamera =  "";
    String[] tech = {"CANON", "SONY", "NIKON"};
    String fileName = "CameraTechnology.txt";

    try(BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))){
        writer.write("--------------------------------------------------------------------------");
        writer.newLine();
        writer.write("CAMERA TECHNOLOGY REPORT");
        writer.newLine();
        writer.write("--------------------------------------------------------------------------");
        writer.newLine();

        writer.write(String.format("%-16s", ""));

        writer.write(String.format("%-25s%-25s\n", "MIRRORLESS", "DSLR"));

        for (int row = 0; row < tech.length; row++){
            writer.write(String.format("%-16s", tech[row]));

            for (int clm = 0; clm < Costs[row].length; clm++){
                writer.write(String.format("%-25s", String.format("R %.2f", Costs[row][clm])));
            }

            writer.newLine();
        }

        writer.write("--------------------------------------------------------------------------");
        writer.newLine();
        writer.write("CAMERA TECHNOLOGY RESULTS");
        writer.newLine();
        writer.write("--------------------------------------------------------------------------");
        writer.newLine();

        for (int row = 0; row < tech.length; row++) {
            double diff = Costs[row][0] - Costs[row][1];

            String stars = "";
            if (diff >= 2500) {
                stars = "***";
            }

            if (diff > maxDiff) {
                maxDiff = diff;
                maxCamera = tech[row];
            }

            writer.write(String.format("%-16s %s%s  \n",
                    tech[row], String.format("R %.2f", diff), stars));
        }

        writer.newLine();
        writer.write("CAMERA WITH THE MOST COST DIFFERENCES: " + maxCamera);
        writer.newLine();
        writer.write("--------------------------------------------------------------------------");
        writer.newLine();


        System.out.println("Data successfully written to " + fileName);

    }catch (IOException e) {
        System.out.println("Error writing to file: " + e.getMessage());
    }
    //READ DATA FROM FILE
    System.out.println();
    System.out.println("READING DATA FROM FILE");
    System.out.println("===============================================================");
    try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){
        String line;
        while ((line = reader.readLine()) != null){
            System.out.println(line);
        }
    }catch (IOException e){
        System.out.println("Error reading from file " + e.getMessage());
    }
    }
}