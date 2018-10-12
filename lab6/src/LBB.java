import java.lang.*;

public class LBB extends composite {

    private String description;
    private double price;
    private int count;

    /** constructor */
    public LBB(String d, double p, int c) {
        this.description = d;
        this.price = p;
        this.count = c;
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

    public String getPrintMessage() {
        String value;
        StringBuffer buf = new StringBuffer();
        for (component obj  : components)
        {
            buf.append(obj.getDescription());
            buf.append("\n");
        }
        value = buf.toString();
        return value;
    }
}
