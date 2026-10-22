package Recursion.Strings;

public class Traverse {
    public static void main(String[] args) {
        String name = "Madam";
        int index = 0;
        print(name,index);

    }
    public static void print(String name, int index){
        if(index == name.length()) {
            return;

        }
    print(name, index+1);
    System.out.println(name.charAt(index));
    }
}
