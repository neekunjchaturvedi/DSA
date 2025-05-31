public class XOR {
    public static void main(String[] args) {
        // Scanner s=new Scanner(System.in);
        String s="1A1B0C1";
        char a=s.charAt(0);
        int check=Character.getNumericValue(a);
        for(int i=1;i<s.length()-1;i+=2){
            char c=s.charAt(i);
            char c2=s.charAt(i+1);
            if(c=='A'){
                check=check & Character.getNumericValue(c2);
            }else if(c=='B'){
                check=check | Character.getNumericValue(c2);
            }else{
                check=check ^ Character.getNumericValue(c2);
            }
        }
        System.out.println(check);
         
    }
}
