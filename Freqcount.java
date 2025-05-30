import java.util.HashMap;

public class Freqcount {
    public static void main(String[] args) {
        HashMap <Character,Integer> freq=new HashMap<>();
        char a[]={'a','a','a','a','a','a','b','b','b','b','f'};
        for(char i:a){
            if(freq.containsKey(i)){
                freq.put(i,freq.get(i)+1);
            }else{
                freq.put(i,1);
            }
        }
        for(char i:a){
            int check=freq.get(i);
            if(check%2!=0){
                System.out.println(i);
                break;
            }
        }

    }
}
