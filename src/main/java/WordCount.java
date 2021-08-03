import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public static void main(String[] args){
        String line;
        Map<String, Integer> counter = new HashMap<String, Integer>();
        try {
            FileReader fileReader = new FileReader("src/main/resources/sample.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while((line = bufferedReader.readLine()) != null) {
                String[] words = line.split(" ");
                for(int i = 0;i<words.length;i++){
                    if(counter.containsKey(words[i])){
                        counter.put(words[i], counter.get(words[i])+1);
                    } else {
                        counter.put(words[i],1);
                    }
                }
            }
            System.out.println(counter);

        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}
