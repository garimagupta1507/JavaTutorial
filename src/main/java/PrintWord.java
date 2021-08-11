import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class PrintWord {
    public static void main(String[] args) {
        String line;
        Map<String, Integer> counter = new HashMap<String, Integer>();
        try {
            FileReader fileReader = new FileReader("src/main/resources/sample.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                String line2 = line.toUpperCase();
                String[] words = line2.split(" ");
                for (int i = 0; i < words.length; i++) {
                    //System.out.println(words[i]);
                    if (counter.containsKey(words[i])) {
                        counter.put(words[i], counter.get(words[i]) + 1);
                    } else {
                        counter.put(words[i], 1);
                    }
                }
            }
            int maxValue = 0;
            String finalKey = null;
            for(String key : counter.keySet()){
                if(maxValue <= counter.get(key)){
                    maxValue = counter.get(key);
                    finalKey = key;
                }
            }
            System.out.println(finalKey);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}
