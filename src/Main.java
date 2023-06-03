

// block size 280
// record size 28

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public final static double BLOCK_SIZE = 280;
    public final static double RECORD_SIZE = 28;
    public final static double BLOCK_RECORDS = Math.ceil(BLOCK_SIZE/RECORD_SIZE);
    public final static double size = 30_000; // number of records



    public static void main(String[] args) {
        List<Integer> records = new LinkedList<>();
        List<Integer> indexes = new LinkedList<>(); // Primary index
        BufferedReader in;

        try{
            in= new BufferedReader (new InputStreamReader(new FileInputStream("records.txt")));
            while(in.ready()){
                records.add(Integer.parseInt(in.readLine()));
            }

        }
        catch(IOException e){
            System.out.println(e);
        }


        

    }
}