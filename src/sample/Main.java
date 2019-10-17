import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class main {
    public static void main(String[] args){
        ArrayList<String> list1=new ArrayList<>();
        File file1= new File("student.txt");
        Scanner scan = null;
        int time=0;
        try{
            scan= new Scanner(file1);
            while(scan.hasNext()){
                if(scan.hasNextInt())
                    list1.add(scan.);
                else
                    scan.next();
            }
        }
        catch(FileNotFoundException f){
            System.out.println("student.txt is not found.");
        }




    }