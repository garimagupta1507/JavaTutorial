import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
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
                for(int i = 0; i < words.length; i++){
                    if(counter.containsKey(words[i])){
                        counter.put(words[i], counter.get(words[i]) + 1);
                    } else {
                        counter.put(words[i], 1);
                    }
                }
            }
            System.out.println(counter);

        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}

//OUTPUT
//{Ashu=1, Masters=1, fathers=1, Hello,=1, brothers=1, in=1, Science=1, I=1, is=4, California=1, My=4, Sunita=1, my=1, Gupta=4, Garima=1, mothers=1, Dinesh=1, State=1, name=4, Computer=1, from=1, did=1, University.=1}