public class ReversingString {
    public static String reverse(String str){
        String right;
        String left;
        int l = str.length();
        if (l<=1){
            return str;
        }
        left = str.substring(0, l/2);
        right = str.substring(l/2, l);
        return reverse(right)+ reverse(left);
    }
}
