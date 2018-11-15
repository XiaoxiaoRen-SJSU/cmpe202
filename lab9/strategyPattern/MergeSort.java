
import java.util.ArrayList;

public class MergeSort implements SortingStrategy {

    private void sort(ArrayList<Integer> a, int lo0, int hi0) throws Exception {
        int lo = lo0;
        int hi = hi0;

        if (lo >= hi) {
            return;
        }
        int mid = (lo + hi) / 2;

        /*
         *  Partition the list into two lists and sort them recursively
         */
        sort(a, lo, mid);
        sort(a, mid + 1, hi);

        /*
         *  Merge the two sorted lists
         */
        int end_lo = mid;
        int start_hi = mid + 1;
        while ((lo <= end_lo) && (start_hi <= hi)) {
            if (a.get(lo) < a.get(start_hi)) {
                lo++;
            } else {
                /*
                 *  a[lo] >= a[start_hi]
                 *  The next element comes from the second list,
                 *  move the a[start_hi] element into the next
                 *  position and shuffle all the other elements up.
                 */
                int T = a.get(start_hi);
                for (int k = start_hi - 1; k >= lo; k--) {
                    a.set(k+1, a.get(k));
                }
                a.set(lo, T);
                lo++;
                end_lo++;
                start_hi++;
            }
        }
    }

    public void sort(ArrayList<Integer> a)  throws Exception {
        sort(a, 0, a.size()-1);
    }
}

