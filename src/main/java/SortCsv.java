import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SortCsv {
    public static void main(String[] args){
        String line;
        int temp = 0;
        try {
            BufferedReader file = new BufferedReader(new FileReader("src/main/resources/sample_numcsv.csv"));
            while((line = file.readLine()) != null) {
                String[] nums = line.split(",");
                Integer[] intNum = new Integer[nums.length];
                for(int i = 0; i < nums.length; i++) {
                    intNum[i] = Integer.parseInt(nums[i]);
                }
                for(int i = 0; i < intNum.length; i++) {
                    for( int j = i + 1; j < intNum.length; j++){
                        if(intNum[i] > intNum[j]){
                            temp = intNum[i];
                            intNum[i] = intNum[j];
                            intNum[j] = temp;
                        }
                    }
                }
                for(int i = 0; i < intNum.length; i++) {
                   System.out.println(intNum[i]);
                }
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}
