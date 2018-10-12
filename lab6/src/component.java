/** Interface component */
public interface component {
    /** print Description */
    String getDescription() ;
    int getCount();
    double getPrice();
    /**
     * Add child to the composite
     * @param c The component to be added
     */
    void addChild(component c);
    /**
     * Remove child from composite
     * @param c The component to be removed
     */
    void removeChild(component c);
    /**
     * Return the child at index i
     * @param i The index of the child
     */
    component getChild(int i);

    String getPrintMessage();
}
