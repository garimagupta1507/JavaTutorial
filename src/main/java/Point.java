import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Point {
    private int x;
    private int y;

    public void main(String[] input) {
        int count = 0;
        String line;
        try {
            FileReader fileReader = new FileReader("src/main/resources/point.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while((line = bufferedReader.readLine()) != null) {
                String[] nums = line.split(",");
                Integer[][] intNum = new Integer[2][2];
                for(int i = 0; i < nums.length; i++) {
                    for (int j = i + 1; j < nums.length - 1; j++){
                        intNum[i][j] = Integer.parseInt(nums[i],[j]);
                    }


                }
//                for(int i = 0; i < nums.length; i++) {
//                    System.out.println(intNum[i]);
//                }
            }

        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}
