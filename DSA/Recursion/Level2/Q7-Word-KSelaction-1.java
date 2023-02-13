import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferReader br = new BufferReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int k = Interger.parseInt(br.readLine());

        HashMap<Character> unique = new HashMap<>();
        String ustr = "";
        for(Char ch : str.toCharArray()){
            if(unique.contains(ch) == false){
                unique.add(ch);
                ustr+=ch;
            }
        }
        generateSelection(0, ustr, 0, k,"");
    }

    public static void generateSelection(int i, String ustr, int ssf, int ts, String asf) {
        if(i == ustr.length){
            if(ssf==ts){
                System.out.println(asf);
            }
            return;
        }
        
        char ch = ustr.charAt(i);
        generateSelection(i+1,ustr,ssf+1,ts,asf+ch); // Yes
        generateSelection(i+1,ustr,ssf+0,ts,asf+""); // No
    }
}