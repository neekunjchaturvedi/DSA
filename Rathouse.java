import java.util.ArrayList;
import java.util.Scanner;

public class Rathouse {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int r=s.nextInt();
        int unit=s.nextInt();
        int check=r*unit;
        int n=s.nextInt();
        int sum=0;
        if(n==0){
            System.out.println(0);
        }else{
            ArrayList <Integer> arr=new ArrayList<>();
            for(int i=0;i<n;i++){
                arr.add(s.nextInt());
            }
            for(int i=0;i<n;i++){
                sum+=arr.get(i);
                if(sum>check){
                    System.out.println(i);
                    break;
                }else if(i==n-1 && sum<check){
                    System.out.println(0);
                    break;
                }
            }
        }
        s.close();
    }
}
