import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferReader br = new BufferReader(new InputStreamReader(System.in));
        int nboxes = Integer.parseInt(br.readLine());
        int ritems = Integer.parseInt(br.readLine());
        printCombination(1, nboxes, 0, ritems, "");

    }

    public static void printCombination(int cb, int tb, int ssf, int ts, String asf) {
        if(cb > tb){
            if(ssf == ts)
                System.out.println(asf);
            return;
        }
        printCombination(cb+1, tb, ssf+1, ts, asf+"i");
        printCombination(cb+1, tb, ssf, ts, asf+"-");
    }
}