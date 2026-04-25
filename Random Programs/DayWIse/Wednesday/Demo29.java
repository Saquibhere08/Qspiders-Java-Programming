package Friday;
import java.util.Scanner;
public class Demo29 {
    public static void mai(String [] arg){
        boolean bool=false;
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int sq=0;

        for(int i=1;i<=n;i++){
            int res=i*i;
            if(res==n){
                bool=true;
                sq=i;
                break;
            }

        }
        if(bool=true){
            System.out.println(sq+" is the square of "+n);
        }
        else
            System.out.println(sq+" not a square root of "+n);
    }
}
//not completed.