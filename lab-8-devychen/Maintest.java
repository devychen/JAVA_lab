import java.util.Arrays;
public class Maintest {
        public static void main(String[] args) {
            Object[] a1 ={"A","B","C"};
            Object[] a2 ={"D","E","F"} ;
            String objectToSearch = "F";
            System.out.println(Arrays.toString(ArrayUtils.reverseArray(a1)));
            System.out.println(Arrays.toString(ArrayUtils.concatArrays(a1, a2)));
            System.out.println(ArrayUtils.searchArrayForAnObject(a1, objectToSearch));
    }
}
