import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SampleClass {

    public static void main(String[] Args){

        System.out.println("Hello World");
        String str="This is a test for a test string";
        String[] strArry=str.split("\\s");
        HashMap<String,Integer> hmp=new HashMap<String,Integer>();
        for(int i=strArry.length-1;i>=0;i--) {
            System.out.print(strArry[i]+ " ");
        }
        System.out.println();
        for(String i:strArry){
                hmp.put(i,hmp.getOrDefault(i,0)+1);
        }
        hmp.forEach((k,v)-> System.out.println(k+" :Key, "+v+" :Value"));



    }
}
