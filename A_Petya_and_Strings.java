import java.io.*;
//import java.util.*;

public class A_Petya_and_Strings{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String first = br.readLine().toLowerCase();
        String second= br.readLine().toLowerCase();
       int n=first.length();
       int i=0,j=0; 
       int ans=0;

        while(i<n && j<n && first.charAt(i) == second.charAt(j)){
            i++;
            j++;
        }
        if(i<n && j<n && first.charAt(i) < second.charAt(j)){
            ans=-1;
        }else if(i<n && j<n && first.charAt(i)>second.charAt(j)){
            ans=1;
        }
    

    System.out.println(ans);
}
}