import java.util.ArrayList;

public class Oddevenposition {
    public static void main(String[] args) {
        int []a={3,2,1,7,5,4};
        ArrayList<Integer> even=new ArrayList<>();
        ArrayList<Integer> odd=new ArrayList<>();
        if(a.length<=3){
            System.out.println(0);
        }else{
            even.add(a[0]);
            for(int i=1;i<a.length;i++){
                if(i%2==0){
                    even.add(a[i]);
                }else{
                    odd.add(a[i]);
                }
            }
            int seclar=Integer.MIN_VALUE;
            int max=even.get(0);
            int secsma=Integer.MAX_VALUE;
            int min=odd.get(0);
            for(int i:even){
                if(i>max){
                    seclar=max;
                    max=i;
                }else if(i!=max && i>seclar){
                    seclar=i;
                }
            }
            for(int i:odd){
                if(i<min){
                    secsma=min;
                    min=i;
                }else if(i!=min && i<secsma){
                    secsma=i;
                }
            }
            System.out.println(seclar+secsma); 
        }
    }
}
