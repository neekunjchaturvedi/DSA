public class Divisibilitydiff {
    public static void main(String[] args) {
        int n=4;
        int m=20;
        int div=0;
        int notdiv=0;
        for(int i=1;i<=m;i++){
            if(i%n==0){
                div+=i;
            }else{
                notdiv+=i;
            }
        }
        System.out.println(Math.abs(div-notdiv));
    }
}
