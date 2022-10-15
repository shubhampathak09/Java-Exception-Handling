package Kn;

import java.util.ArrayList;

public class WildCard {

    public static ArrayList<String>arr=new ArrayList();

    public static void wildCardGenerator(String input,int index,String result){
    if(result.length()==input.length()){
        arr.add(result);
        System.out.println(result);
        return;
    }
    if(input.charAt(index)!='?'){
        result+=input.charAt(index);
        wildCardGenerator(input,index+1,result);
    }else {
        String res1=result;
        String res2=result;
        res1 +='0';
        res2+='1';
        wildCardGenerator(input,index+1,res1);
        wildCardGenerator(input,index+1,res2);
    }
    }

    public static void main(String[] args){
        String inp="10?1";
        String res="";
        int index=0;
        wildCardGenerator(inp,index,res);


    }
}
