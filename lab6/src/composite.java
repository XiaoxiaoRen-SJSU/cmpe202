import java.util.ArrayList;

public class composite implements component {

    protected ArrayList<component> components = new ArrayList<component>()  ;
    private int count;

    public composite () {
        count = 0;
    }

    public String getDescription() {
        return null;
    }

    public int getCount() {
        return this.count;
    }

    public double getPrice() {
        return 0;
    }

    public String getPrintMessage() {
        return null;
    }

    public void addChild(component c) {
        components.add( c ) ;
        if (c.getDescription().equals("LBB")) {
            count++;
        }
    }

    public void removeChild(component c) {
        components.remove(c) ;
    }

    public component getChild(int i) {
        return components.get( i ) ;
    }

    public ArrayList<component> getComponents() {
        return components;
    }
}
