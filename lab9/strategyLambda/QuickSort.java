
import java.util.ArrayList;

public class QuickSort implements SortingStrategy {

    private void sort(ArrayList<Integer> a, int lo0, int hi0) throws Exception {
        int lo = lo0;
        int hi = hi0;
        if (lo >= hi) {
            return;
        }
        else if( lo == hi - 1 ) {
            /*
             *  sort a two element list by swapping if necessary
             */
            if (a.get(lo) > a.get(hi)) {
                int T = a.get(lo);
                a.set(lo, a.get(hi));
                a.set(hi, T);
            }
            return;
        }


        /*
         *  Pick a pivot and move it out of the way
         */
        int pivot = a.get((lo + hi) / 2);
        a.set((lo + hi) / 2, a.get(hi));
        a.set(hi, pivot);

        while( lo < hi ) {
            /*
             *  Search forward from a[lo] until an element is found that
             *  is greater than the pivot or lo >= hi
             */
            while (a.get(lo) <= pivot && lo < hi) {
                lo++;
            }

            /*
             *  Search backward from a[hi] until element is found that
             *  is less than the pivot, or lo >= hi
             */
            while (pivot <= a.get(hi) && lo < hi ) {
                hi--;
            }

            /*
             *  Swap elements a[lo] and a[hi]
             */
            if( lo < hi ) {
                int T = a.get(lo);
                a.set(lo, a.get(hi));
                a.set(hi, T);
            }

        }

        /*
         *  Put the median in the "center" of the list
         */
        a.set(hi0, a.get(hi));
        a.set(hi, pivot);

        /*
         *  Recursive calls, elements a[lo0] to a[lo-1] are less than or
         *  equal to pivot, elements a[hi+1] to a[hi0] are greater than
         *  pivot.
         */
        sort(a, lo0, lo-1);
        sort(a, hi+1, hi0);
    }

    public void sort(ArrayList<Integer> a) throws Exception {
        sort(a, 0, a.size()-1);
    }
}


 
