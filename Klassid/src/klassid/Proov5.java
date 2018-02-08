package klassid;
import java.io.*;
public class Proov5 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new FileReader("fail.txt"));
        String rida=br.readLine();
        while(rida!=null){
            System.out.println(rida);
            rida=br.readLine();
            
        }
        br.close();
    }
    
}
