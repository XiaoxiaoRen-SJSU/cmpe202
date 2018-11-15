
public class Tester {

    public static void main( String[] args)
    {
        // Lambda Expression.
        Filter evens = (a) -> (a % 2) == 0;     
        Filter odds  = (a) -> (a % 2) != 0; 

        DataSet dataset = new DataSet() ; // defaults to BubbleSort
        dataset.display();
        dataset.doSort();
        dataset.display();
        dataset.resetData();
        dataset.filterData(evens);  // Add function here.
        dataset.display();
        dataset.changeStrategy( new MergeSort() );
        dataset.doSort();
        dataset.display();
        dataset.resetData();
        dataset.filterData(odds);   // Add function here
        dataset.display();
        dataset.changeStrategy( new QuickSort() );
        dataset.doSort();
        dataset.display();
    }
 
}
 
