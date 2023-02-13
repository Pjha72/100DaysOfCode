import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferReader br = new BufferReader(new InputStreamReader(System.in));
        int nboxes = Integer.parseInt(br.readLine());
        int ritems = Integer.parseInt(br.readLine());
        printPermutation2(1, nboxes, new int[ritems], 0, ritems, "");

    }

    public static void printPermutation2(int cb, int tb, int[] items, int ssf, int ts, String asf) {
        if(cb > tb){
            if(ssf == ts)
                System.out.println(asf);
            return;
        }
        
        for(int i=0;i<ts;i++){
            if(items[i] == 0){
                items[i] = 1;
                printPermutation2(cb+1,tb, items, ssf+1,asf+(i+1));
                items[i] = 0;
            }
        }
        printPermutation2(cb+1, tb, items, ssf, ts, asf+"0");
    }
}