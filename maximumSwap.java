import java.util.*;

class Main {
    public static void main(String[] args) {
        System.out.println(maximumSwap(2025));
    }
  
    public static int maximumSwap(int num) {
        char A[] = Integer.toString(num).toCharArray();
        char ans[] = Arrays.copyOf(A, A.length);
        for(int i = 0; i < A.length; i++) {
            for(int j = i + 1; j < A.length; j++) {
                char tmp = A[i];
                    A[i] = A[j];
                    A[j] = tmp;
                for(int k = 0; k < A.length; k++) {
                     if(A[k] != ans[k]) {
                        if(A[k] > ans[k]) {
                            ans = Arrays.copyOf(A, A.length);
                        }
                        break;
                    }
                }
                A[j] = A[i];
                A[i] = tmp;
            }
        }
        return Integer.valueOf(new String(ans));
    } // 2736 9973 2025
}