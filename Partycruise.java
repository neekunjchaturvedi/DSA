public class Partycruise {
    public static void main(String[] args) {
        int e[]={7,0,5,1,3};
        int l[]={1,2,1,3,4};
        int count=0;
        int max=0;
        for(int i=0;i<e.length;i++){
            count+=e[i]-l[i];
            if(count>max){
                max=count;
            }
        }
        System.out.println(max);
    }
}
