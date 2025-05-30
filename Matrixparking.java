import java.util.Scanner;

public class Matrixparking {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int count=0;
        int max=Integer.MIN_VALUE;
        int index=0;
        int r=s.nextInt();
        int c=s.nextInt();
        int a[][]=new int [r][c];
        

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=s.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(a[i][j]==1){
                    count++;
                }
            }
            if(count>max){
                max=count;
                index=i;
                count=0;
            }else if(count==max && i==r-1){
                count=0;
                break;
            }
        }
        System.out.println(index+1);
        s.close();
        
    }
    
}
