import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class WordCount2 {
    public static void main(String[] args){
        String line;
        Map<String, Integer> counter = new HashMap<String, Integer>();
        try {
            FileReader fileReader = new FileReader("src/main/resources/sample.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while((line = bufferedReader.readLine()) != null) {
                String line2 = line.toUpperCase();
                String[] words = line2.split(" ");
                for(int i = 0; i < words.length; i++){
                    //System.out.println(words[i]);
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
//{MOTHERS=1, ASHU=1, DINESH=1, IN=1, GARIMA=1, UNIVERSITY.=1, I=1, STATE=1, IS=4, FROM=1, MY=5, NAME=4, BROTHERS=1, MASTERS=1, CALIFORNIA=1, COMPUTER=1, HELLO,=1, FATHERS=1, SCIENCE=1, SUNITA=1, DID=1, GUPTA=4}