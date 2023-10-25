public class RecursionString {
    public static String printString(String str){
        String res = "";
        if (str.isEmpty()){
            return "";
        } else{
            char first = str.charAt(0);
            String next = printString(str.substring(1));
            if(str.length()==1){
                return first+"";
            }else {
                return res = first+next;
            }
        }
    }
}

