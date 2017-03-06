package pizzamvc;

/**
 * A class that represents a single pizza order.
 *
 * @author Lisa Caswell
 */
public class PizzaOrder {

    private String email;
    private String size;
    private String crust;
    private String toppings;

    public PizzaOrder() {
        email = "";
        size = "";
        crust = "";
        toppings = null;
    }

    public PizzaOrder(String email, String size, String crust, String toppings) {
        this.email = email;
        this.size = size;
        this.crust = crust;
        this.toppings = toppings;
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
        this.crust = size;
    }

    @Override
    public String toString() {
        return "PizzaOrder{" + "email=" + email + ", size=" + size
                + ", crust=" + crust + ", toppings=" + toppings + '}';
    }
}