public class Twodiff{
    public static void main(String[] args) {
        int []a={12,3,14,56,77,13};
        int num=13;
        int diff=2;
        int count=0;
        for(int i=0;i<a.length;i++){
            if(Math.abs(num-a[i])<=diff){
                count++;
            }
        }
        System.out.println(count);
    }
}