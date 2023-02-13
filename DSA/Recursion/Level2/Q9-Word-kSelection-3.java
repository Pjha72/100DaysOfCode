import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferReader br = new BufferReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int k = Interger.parseInt(br.readLine());

        HashMap<Character, Interger> unique = new HashMap<>();
        String ustr = "";
        for(Char ch : str.toCharArray()){
            if(unique.contains(ch) == false){
                unique.put(ch,1);
                ustr+=ch;
            }
            else{
                unique.put(ch,unique.get(ch)+1);
            }
        }
        generateSelection3(ustr, fmap, 0,"",k);
    }

    public static void generateSelection3(String ustr, HashMap<Character, Interger> fmap, int idx, String asf, int k) {
        if(k < 0){
            return;
        }
        
        if(idx == ustr.length()){
            if(k==0)
                System.out.println(asf);
            return;
        }
        
        char ch = ustr.charAt(i);

        // for(int i = fmap.get(ch); i>=0; i--){
        //     String s = "";
        //     for(int j=0;j<i;j++){
        //         s+=ch;
        //     }
        //     generateSelection3(ustr,fmap,idx+1,asf+s,k-i);
        // }

        if(fmap.get(ch) > 0){
            fmap.put(ch,fmap.get(ch) - 1);
            generateSelection3(ustr,fmap,idx,asf+ch,k-1);
            fmap.put(ch,fmap.get(ch) + 1);
        }
        
        generateSelection3(ustr,fmap,idx+1,asf,k);
    }
}