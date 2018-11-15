
public class Tester {

    public static void main( String[] args)
    {
        DataSet dataset = new DataSet() ; // defaults to BubbleSort
        dataset.display();
        dataset.doSort();
        dataset.display();
        dataset.resetData();
        dataset.filterEvens();  // Add function here.
        dataset.display();
        dataset.changeStrategy( new MergeSort() );
        dataset.doSort();
        dataset.display();
        dataset.resetData();
        dataset.filterOdds();   // Add function here
        dataset.display();
        dataset.changeStrategy( new QuickSort() );
        dataset.doSort();
        dataset.display();
    }
 
}
 
