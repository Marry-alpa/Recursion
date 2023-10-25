public class RecursionArr {
    int val[];
    StringBuilder sb = new StringBuilder();

    RecursionArr(int i) {
        val = new int[i];
    }

    String printArr(int i) {
        if (i == 0) {
            return " ";
        }else {
            printArr(i-1);
        }
        String output = val[i-1]+ "\n";
        sb.append(output);
        return sb.toString();
    }
    public static int sumArr(int[] val, int i) {
        if (i == 0) {
            return val[0];
        } else {
            return val[i]+sumArr(val, i-1);
        }
    }
}


