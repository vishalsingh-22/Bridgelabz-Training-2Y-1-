package Recursion.Strings;

public class RemoveLetter {
    public static void main(String[] args) {
        String name = "banana";
        int index = 0;
        System.out.println(remove(name,index));

    }
    public static String remove(String name,int index){
        if(index==name.length()){
            return " ";
        }
        String small = remove(name,index+1);
        char ch=name.charAt(index);
        if(ch != 'a'){
            return ch+small;
        }else
        {
            return small;
        }

    }
}
