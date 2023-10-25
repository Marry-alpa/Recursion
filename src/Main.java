public class Main {
    public static void main(String[] args) {
        System.out.println(Recursion.rec(9));
        System.out.println("-----------------");
        System.out.println(Recursion.recRev(1));
        System.out.println("-----------------");
        //System.out.println(Recursion.stackOver("Hi"));
        System.out.println("-----------------");
        RecursionArr recArr = new RecursionArr(9);
        int i;
        for (i=1; i<9; i++){
            recArr.val[i]=i;
        }
        System.out.println(recArr.printArr(9));
        System.out.println("-----------------");
        int val [] = {1, 2, 3, 4, 5};
        int l = val.length-1;
        System.out.println(RecursionArr.sumArr(val, l));
        System.out.println("-----------------");
        System.out.println(RecursionString.printString("Hello, recursion"));
        System.out.println("-----------------");
        String str = "Reversed string";
        System.out.println(str);
        System.out.println(ReversingString.reverse(str));
    }
}
