
import java.util.ArrayList;

public class DataSet {

    private ArrayList<Integer> data = new ArrayList<Integer>()  ;
	private SortingStrategy strategy;
    private ArrayList<Integer> sortedList = new ArrayList<Integer>() ;

    public DataSet()
    {
        strategy = new BubbleSort() ;
        data.clear();
        data.add( 198 ) ;
        data.add( 56  ) ;
        data.add( 12  ) ;
        data.add( 34  ) ;
        data.add( 62  ) ;
        data.add( 99  ) ;
        data.add( 145  ) ;
        data.add( 87  ) ;
        data.add( 26  ) ;
        data.add( 37  ) ;
        data.add( 13  ) ;
        data.add( 16  ) ;        
        sortedList.addAll(data);
    }
	 
	public void doSort() {
        try {
            strategy.sort( sortedList );
            System.out.println( "List sorted with " + strategy.toString() );
        } catch ( Exception e )
        {
            System.out.println( e.toString() );
        }
	}
	 
	public void display() {
        for ( int i = 0; i < sortedList.size(); i++ )
            System.out.println( sortedList.get(i) );
	}
	 
	public void resetData() {
        sortedList.clear();
        sortedList.addAll(data);
        System.out.println( "Data Reset Done!");
	}
	 
	public void changeStrategy(SortingStrategy s) {
	    strategy = s ;
	}

    /** 
     * Extra functions added here.
     * Filter the dataset and keep evens or odds according to the filter f.
     * @param f The Filter function.
     */
    public void filterData(Filter f) {
        sortedList.clear();
        for ( int i = 0; i < data.size(); i++ ) {
            if (f.operation(data.get(i))) {
                sortedList.add(data.get(i));
            }
        }
    }
}
 
