
import java.util.ArrayList;

public class BubbleSort implements SortingStrategy {

    public void sort(ArrayList<Integer> a) throws Exception {
        for (int i = a.size(); --i>=0; ) {
            boolean flipped = false;
            for (int j = 0; j<i; j++) {
                if (a.get(j) > a.get(j+1)) {
                    int T = a.get(j);
                    a.set(j, a.get(j+1));
                    a.set(j+1, T);
                    flipped = true;
                }
            }
            if (!flipped) {
                return;
            }
        }
    }
}

