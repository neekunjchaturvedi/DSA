public class PasswordValidation {
    public static void main(String[] args) {
        String a="Abc@123";
        int num=0;
        boolean t=false;
        if(a.length()<4){
            System.out.println(0);
        }else{
            for(int i=0;i<a.length();i++){
                char c=a.charAt(i);
                if(c=='/' || c==' '){
                    t=false;
                    break;
                }else if(c>='A' && c<='Z'){
                    t=true;
                }else if(c>='0' && c<='1'){
                    num++;
                }
            }
            if(num>0 && t){
                System.out.println(1);
            }
        }
    }
}
