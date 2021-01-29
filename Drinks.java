
/**
 * Drinks class holds information about drinks
 * each drink has 3 characteristics:
 * - name
 * - size 
 * - refill or not (when a drink is not selected as a refill, it is then selected as a bottle)
 * 
 * @author Amanda Barbieri
 * @version May/16/2020
 */
public class Drinks extends Product implements Quality{
    // instance variables
    private boolean refill;
    private String expDate;
    
    /**
     * Constructor for objects of class Drinks
     */
    public Drinks(String productName, String drinkSize, boolean isRefill){
        super(productName, drinkSize);       
        refill = isRefill;
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
     * Set the option if the drink being sold is refill or a new bottle
     */
    public void setRefill(boolean isRefill){
        refill = isRefill;
    }
    /**
     * Retrieves if the drink is a refill or a new bottle
     */
    public boolean isRefill(){
        return refill;
    }
    /**
     * Overrides the toString original method
     */
    @Override
    public String toString(){
        String selected = "Bottle";
        if(refill == true){
            selected = "Refill";
        }
        return super.toString() + " - Type: " + selected;
    }    
}
