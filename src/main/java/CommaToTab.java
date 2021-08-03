import java.util.*;
import java.io.*;

public class CommaToTab {
    public static void main(String[] input) {
        String line;
        List<String> processedLines = new ArrayList<String>();
        StringBuilder builder;
        try {
            FileReader fileReader = new FileReader("src/main/resources/sample_csv.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while((line = bufferedReader.readLine()) != null) {
                builder = new StringBuilder(line);
                int index = builder.indexOf(",");
                while (index >= 0) {
                    builder.setCharAt(index, '\t');
                    index = builder.indexOf(",", index+1);
                }
                processedLines.add(builder.toString());
            }
            File outFile = new File("src/main/resources/sample_tsv.tsv");
            PrintWriter writer = new PrintWriter(outFile);
            for(int i = 0; i < processedLines.size(); i++) {
                writer.println(processedLines.get(i));
            }
            writer.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}