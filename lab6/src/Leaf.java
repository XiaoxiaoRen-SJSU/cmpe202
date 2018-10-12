public class Leaf implements component {

    private String description;
    private double price;
    private int count;

    public Leaf() {

    }

    /** Contructor */
    public Leaf ( String d, int c, double p )
    {
        this.description = d;
        this.count = c ;
        this.price = p;
    }

    public String getDescription() {
        return this.description;
    }

    public double getPrice() {
        return this.price;
    }

    public int getCount() {
        return this.count;
    }

    /**
     * Add child to the composite (Not use)
     * @param c The component to be added
     */
    public void addChild(component c) {

    }
    /**
     * Remove child from composite (Not use)
     * @param c The component to be removed
     */
    public void removeChild(component c) {

    }
    /**
     * Return the child at index i (Not use)
     * @param i The index of the child
     */
    public component getChild(int i) {
        return null;
    }

    public String getPrintMessage() {
        return null;
    }
}
