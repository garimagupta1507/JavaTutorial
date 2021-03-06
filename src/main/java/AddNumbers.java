import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AddNumbers {
    public static void main(String[] args){
        String line;
        try {
            FileReader fileReader = new FileReader("src/main/resources/sample_numcsv.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            int sum = 0;
            while((line = bufferedReader.readLine()) != null) {
                String[] nums = line.split(",");
                Integer[] intNum = new Integer[nums.length];
                for(int i = 0; i < nums.length; i++){
                  intNum[i] = Integer.parseInt(nums[i]);
                  sum = sum + intNum[i];
                }
            }
            System.out.println(sum);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}
