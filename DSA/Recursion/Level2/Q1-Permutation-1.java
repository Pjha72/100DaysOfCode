import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferReader br = new BufferReader(new InputStreamReader(System.in));
        int nboxes = Integer.parseInt(br.readLine());
        int ritems = Integer.parseInt(br.readLine());
        printPermutation(new int[nboxes], 1, ritems);

    }

    public static void printPermutation(int[] boxes, int ci, int ti) {
        if(ci > ti){
            for(int i=0;i<boxes.length;i++){
                System.out.println(boxes[i]);
            }
            System.out.println();
            return;
        }

        for(int i=0;i<boxes.length;i++){
            if(boxes[i]==0){
                boxes[i] = ci;
                printPermutation(boxes, ci+1,ti);
                boxes[i] = 0;
            }
        }
    }
}