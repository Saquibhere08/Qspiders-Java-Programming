package Pattern.HallowPattern;

public class Demo12 {
    public static void main(String[] args) {
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                //if(i==0 || i==4 || j==0 || j==4 || i==2 || j==2)
                if(i%2!=0 && j%2!=0)
                {
                    System.out.print("  ");
                
                }
                else
                {
                    System.out.print("@  ");
                }
            }
            System.out.println();
        }
    }
}
