public class StringConcatenationAndObjectCreation {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";
        String str3 = str1+str2;

        boolean flag = (str3 == str1);
        
        System.out.println("Is str3 pointing to the same object as str1? " + flag);
    }
}
