package Kn;

public class CamelCase {



    public static String camelCase(String input){
        String resut="";
        for(int i=0;i<input.length();i++){
            {
                Character ch=input.charAt(i);
                if(!Character.isUpperCase(ch)){
                    resut+=ch;
                }else{
                    resut+=" ";
                    resut+=ch;
                }
            }
        }
        return resut;
    }

    public static void main(String[] args){

        String resut="identifier";
        System.out.println(camelCase(resut));
    }
}
