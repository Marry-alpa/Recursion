public class Recursion {
    public static String rec(int n){
        if(n==1){
            return "1";
        }
        return rec(n-1)+" "+n;
    }
    public static String recRev(int m){
        if (m==9){
            return "9";
        }
        return recRev(m+1)+" " +m;
    }
    public static String stackOver(String str){
        return stackOver(str);
    }
}

