import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferReader br = new BufferReader(new InputStreamReader(System.in));
        String str = br.readLine();

        Character[] spots = new Character[str.length()];
        HashMap<Character, Interger> lastOccurence = new HashMap<>();
        for(Char ch : str.toCharArray()){
            lastOccurence.put(ch, -1);
        }
        generateWords2(0, str, spots, lastOccurence);
    }

    public static void generateWords2(int cc, String str, Character[] spots,HashMap<Character, Interger> lastOccurence) {
        if(cc == str.length){
            for(int i=0;i<spots.length;i++){
                System.out.print(spots[i]);
            }   
            System.out.println();
            return;
        }
        
        char ch = str.charAt(cc);
        int lo = lastOccurence(ch);
        for(int i = lo+1; i < spots.length; i++){
            if(spots[i] == null){
                spots[i] = ch;
                lastOccurence.put(ch,i);
                generateWords2(cc+1,str,spots,lastOccurence);
                lastOccurence.put(ch,lo);
                spots[i] = null;
            }
        }
    }
}