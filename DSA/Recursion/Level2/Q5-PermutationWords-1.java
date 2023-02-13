import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferReader br = new BufferReader(new InputStreamReader(System.in));
        String str = br.readLine();

        HashMap<Character, Interger> fMap = new HashMap<>();
        for(Char ch : str.toCharArray()){
            if(fMap.containsKey(ch)){
                fMap.put(ch, fMap.get(ch)+1);
            }
            else{
                fMap.put(ch,1);
            }
        }
        generateWords(1, str.length(), fMap, "");
    }

    public static void generateWords(int cs, int ts, HashMap<Character, Interger> fMap, String asf) {
        if(cs > ts){
            System.out.println(asf);   
            return;
        }
        
        for(Char ch: fMap.keySet()){
            if(fMap.get(ch) > 0){
                fMap.put(ch, fMap.get(ch) - 1);
                generateWords(cs+1,ts,fMap,asf+ch);
                fMap.put(ch, fMap.get(ch) + 1);
            }
        }
    }
}