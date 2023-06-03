import java.io.*;
import java.util.LinkedList;
import java.util.List;


// block size 280
// record size 28


public class Main {

    public final static double BLOCK_SIZE = 280;
    public final static double RECORD_SIZE = 28;
    public final static double BLOCK_RECORDS = Math.ceil(BLOCK_SIZE/RECORD_SIZE);
    public final static double size = 30_000; // number of records



    public static void main(String[] args) {
        LinkedList<Integer> records = new LinkedList<>();
        LinkedList<Integer> indexes = new LinkedList<>(); // Primary index

        BufferedReader in;

        try {

            in= new BufferedReader (new InputStreamReader (new FileInputStream ("records.txt")));
            if(in.ready()){
                records.add(Integer.parseInt(in.readLine()));
                int firstRecord = records.getFirst();
                indexes.add(firstRecord);
            }
            int counter = 1;

            while(in.ready()){
                records.add(Integer.parseInt(in.readLine()));
                if (counter % 10 == 0){
                    indexes.add(records.getLast());
                }
                counter++;
            }

            records.forEach(System.out::println);
            indexes.forEach(System.out::println);

            in.close();

        }
        catch(IOException e){
            System.out.println(e);
        }


        

    }
}