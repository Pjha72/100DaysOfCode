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
        generateSelection(ustr, 1, k,-1,"");
    }

    public static void generateSelection(String ustr, int cs, int ts, int ls, String asf) {
        if(cs >= ts){
            System.out.println(asf);
            return;
        }

        for(int lc+1; i < ustr.length(); i++){
            char ch = ustr.charAt(i);
            generateSelection(ustr, cs+1, ts, i, asf+ch);
        }
    }
}