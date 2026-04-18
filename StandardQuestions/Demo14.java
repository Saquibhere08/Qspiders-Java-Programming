//package standard;
import java.util.Scaner;
public class Demo14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter");
        int num=nextInt();
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                sum=sum+i;
            }
        }
    }
    System.out.println(sum);

    if(sum==num){
        System.out.println(num+" is a Perferct Number");
    }else{
        System.out.println(num+ "is not a Perfect number");
    }
}
