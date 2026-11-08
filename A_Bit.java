import java.io.*;
// import java.util.*;

public class A_Bit{
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int x=0;
        

        for(int i=0;i<n;i++){
            String s = br.readLine();
            char first = s.charAt(0);
            char last = s.charAt(s.length()-1);
            if(first == '+' || first =='-'){
                if(first == '+')
                    ++x;
                else --x;
            }else{
                if(last == '+')
                    x++;
                else
                    x--;
            }
        }
        System.out.println(x);
    
    

    }
} 