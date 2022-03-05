import java.util.*;

public class backtracking {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.print("Enter string ");
        String str = scn.next();
        Permutation_string(str, 0, str.length()-1);

    }

    public static void Permutation_string(String str, int left, int right) {

        // base case
        if (right == left) {
            System.out.println(str);
        }
        else{
            for (int i = left; i <= right; i++) {
            // do
            str = swap(str, left, i);
            // recursive case
            Permutation_string(str, left+1, right);
            // undo
            str = swap(str, left, i);

        }
    }

    }

    public static String swap(String str, int left, int i) {
        char t;
        char[] charA = str.toCharArray();
        t = charA[left];
        charA[left] = charA[i];
        charA[i] = t;
        return String.valueOf(charA);

    }

}
