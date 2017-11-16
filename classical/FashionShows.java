// Problem URL : http://www.spoj.com/problems/FASHION/

import java.util.Scanner;

class FashionShows {

    static int a[] = new int[1000];
    static int b[] = new int[1000];
    static int c[] = new int[1000];

    public static void main(String[] args) {
        int t, n, sum;
        Scanner s = new Scanner(System.in);
        t = s.nextInt();
        for (int count = 0; count < t; count++) {
            sum = 0;
            n = s.nextInt();
            for (int i = 0; i < n; i++) {
                a[i] = s.nextInt();
            }
            merge_sort(0, n - 1, a);

            for (int i = 0; i < n; i++) {
                c[i] = s.nextInt();
            }
            merge_sort(0, n - 1, c);

            for (int i = 0; i < n; i++) {
                sum += a[i] * c[i];
            }
            System.out.println(sum);
        }

    }

    public static void merge_sort(int low, int high, int a[]) {
        int mid;
        if (low < high) {
            mid = (low + high) / 2;
            merge_sort(low, mid, a);
            merge_sort(mid + 1, high, a);
            merge(low, mid, high, a);
        }
    }

    public static void merge(int low, int mid, int high, int a[]) {
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
