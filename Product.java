
/**
 * This is a parent class and also abstract
 * Product class provides methods for the following classes:
 * - Drinks
 * - IceCream
 *
 * @author Amanda Barbieri
 * @version May/16/2020
 */
public abstract class Product{
    // instance variables
    private String product;  //the name of the product
    private String size;     //the size of the product
    
    /**
     * Constructor for objects of class Product
     */
    public Product(String productName, String productSize){
        product = productName;
        size = productSize;   
    }
    
    /* mutators */
    
     /**
     * Define the type of the product; its name
     */
    public void setName(String productName){
        product = productName;
    }
    /**
     * Define the size of the product
     */
    public void setSize(String productSize){
        size = productSize;
    }
    /**
     * Print the product information
     */
    public void printProductInfo(){
        System.out.println(this);
    }
    
    /* accessors */
    
    /**
     * Retrieve the product size
     */
    public String getSize(){
        return size;
    }
    /**
     * Retrieve the product type/name
     */
    public String getName(){
        return product;
    }
    /**
     * Overrides the toString original method
     */
    @Override
    public String toString(){
        return 
        product + " - Size: " + size;
    }
}
