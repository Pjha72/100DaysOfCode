import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferReader br = new BufferReader(new InputStreamReader(System.in));
        int nboxes = Integer.parseInt(br.readLine());
        int ritems = Integer.parseInt(br.readLine());
        printCombination2(new int[nboxes], 1, ritems, -1);

    }

    public static void printCombination2(int[] boxes, int ci, int ti, int lb) {
        if(ci > ti){
            for(int i=0;i<boxes.length;i++){
                if(boxes[i]){
                    System.out.println("i");
                }
                else{
                    System.out.println("-");
                }
            }
            System.out.println();   
            return;
        }
        
        for(int i=lb+1;i<boxes.length;i++){
            if(boxes[i] == 0){
                boxes[i] = 1;
                printCombination2(boxes, ci+1, ti, i);
                boxes[i] = 0;
            }
        }
    }
}