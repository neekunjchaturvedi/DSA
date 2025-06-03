import java.util.ArrayList;

public class Movezeroes {
    public static void main(String[] args) {
        int a[]={1,2,3,0,2,0,4,0,13};
        int count=0;
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i:a){
            if(i==0){
                count++;
            }else{
                arr.add(i);
            }
        }
        for(int i=0;i<count;i++){
            arr.add(0);
        }
        for(int i=0;i<arr.size();i++){
             System.out.println(arr.get(i));
        }
       
    }
}
