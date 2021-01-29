
/**
 * This interface can be implemented into the product's child classes.
 * It contains a method which every connected class will have to apply
 *
 * @author Amanda Barbieri
 * @version May/17/2020
 */
public interface Quality{
    /**
     * Expiration date must to be set for each product
     */
    abstract void setExpirationDate(String date);
        
}
