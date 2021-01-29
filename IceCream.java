
/**
 * Ice cream class holds information about ice creams and each one has 3 characteristics:
 - name
 - size 
 - topping 
 
 * @author Amanda Barbieri
 * @version May/16/2020
 */
public class IceCream extends Product implements Quality{
    // instance variables
    private boolean topping;
    private String expDate;
    
    /**
     * Constructor for objects of class IceCream
     */
    public IceCream(String productName, String iceCreamSize, boolean addTopping){
        super(productName, iceCreamSize);
        topping = addTopping;
        expDate = null;
    }
    
    /**
     * Set the shelf life of the product
     * This is a must have method implemented from the Quality interface class
     */
    public void setExpirationDate(String date){
        expDate = date;
    }
    /**
     * Set if the ice cream will contain a topping
     */
    public void setTopping(boolean addTopping){
        topping = addTopping;
    }
    /**
     * Retrieves if the ice cream has topping added
     */
    public boolean addTopping(){
        return topping;
    }
    /**
     * Overrides the toString original method
     */
    @Override
    public String toString(){
        String selected = "No";
        if(topping == true){
            selected = "Yes";
        }
        return super.toString() + " - Extra topping: " + selected;
    }
}
