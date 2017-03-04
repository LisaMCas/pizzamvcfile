package pizzamvc;

/**
 * A class that represents a single pizza order.
 *
 * @author John Phillips
 */
public class PizzaOrder {

    private String email;
    private String size;
    private String toppings;
    private String crust;

    public PizzaOrder() {
        email = "";
        size = "";
        toppings = null;
        crust = null;
    }

    public PizzaOrder(String email, String size, String toppings, String crust) {
        this.email = email;
        this.size = size;
        this.toppings = toppings;
        this.crust = crust;
    }

    public String getToppings() {
        return toppings;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    public String getCrust() {
        return crust;
    }

    public void setCrust(String crust) {
        this.crust = crust;
    }  
    
    @Override
    public String toString() {
        return "PizzaOrder{" + "email=" + email + ", size=" + size
                + ", toppings=" + toppings + ", crust=" + crust + '}';
    }
}
