// Problem URL : http://www.spoj.com/problems/STAMPS/
import java.util.Scanner;

class Stamps {

    static int a[] = new int[1000];
    static int n;
    static int b[] = new int[1000];

    public static void main(String[] args) {
        int t, i, sum, max, req, c;

        Scanner s = new Scanner(System.in);
        t = s.nextInt();
        for (int count = 0; count < t; count++) {
            req = s.nextInt();
            n = s.nextInt();
            for (i = 0; i < n; i++) {
                a[i] = s.nextInt();
            }
            merge_sort(0, n - 1);

            c = 0;
            sum = 0;
            while (sum < req && n > 0) {
                sum += a[n - 1];
                n--;
                c++;
            }
            System.out.println("Scenario #" + (count + 1) + ":");
            if (sum < req) {
                System.out.println("impossible");
            } else {
                System.out.println(c);
            }
            System.out.println();

        }

    }

    public static void merge_sort(int low, int high) {
        int mid;
        if (low < high) {
            mid = (low + high) / 2;
            merge_sort(low, mid);
            merge_sort(mid + 1, high);
            merge(low, mid, high);
        }
    }

    public static void merge(int low, int mid, int high) {
        int h, i, j, k;

        h = low;
        i = low;
        j = mid + 1;

        while ((h <= mid) && (j <= high)) {
            if (a[h] <= a[j]) {
                b[i] = a[h];
                h++;
            } else {
                b[i] = a[j];
                j++;
            }
            i++;
        }

        if (h > mid) {
            for (k = j; k <= high; k++) {
                b[i] = a[k];
                i++;
            }
        } else {
            for (k = h; k <= mid; k++) {
                b[i] = a[k];
                i++;
            }
        }
        for (k = low; k <= high; k++) {
            a[k] = b[k];
        }

    }

}
