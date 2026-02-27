public class StringCreationNewKeyword {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");

        boolean flag = (str1 == str2);
        boolean flag2 = str1.equals(str2);
        
        System.out.println("Using == : " + flag);
        System.out.println("Using .equals() : " + flag2);
    }
}
