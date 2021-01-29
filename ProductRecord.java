import java.util.ArrayList;

/**
 * This class contains a collection of products of various types.
 * 
 * 
 * @author Amanda Barbieri
 * @version May/16/2020
 */
public class ProductRecord{
    // instance variables
    private ArrayList<Product> iceCreamInfo;
    private ArrayList<Product> drinksInfo;

    /**
     * Constructor for objects of class ProductRecord
     */
    public ProductRecord(){
        iceCreamInfo = new ArrayList<>();
        drinksInfo = new ArrayList<>();

    }

    /**
     * Main method that will set the list of products and print it
     */
    public static void main(String [] args){
        ProductRecord recordObj = new ProductRecord();

        recordObj.setProductList();
        recordObj.printDrinksList();
        recordObj.printIceCreamList();
    }

    /* mutators */

    /**
     * Print the list of drinks
     */
    public void printDrinksList(){
        System.out.println("*----- Drinks Available -----*");
        for(Product product : drinksInfo){
            System.out.println(product); 
        }
        System.out.println();
    }

    /**
     * Print the list of Ice creams
     */
    public void printIceCreamList(){
        System.out.println("*----- Ice Creams Available -----*");
        for(Product product : iceCreamInfo){
            System.out.println(product);
        }
        System.out.println();
    }

    /**
     * Populate the lists with drinks, ice cream and their characteristics
     */
    public void setProductList(){
        drinksInfo.add(new Drinks("Coke", "Medium", false));
        drinksInfo.add(new Drinks("Monster Energy Ultra", "Small", true));
        drinksInfo.add(new Drinks("evian Natural Spring Water", "Large", true));
        drinksInfo.add(new Drinks("Bai Flavored Water, Panama Peach", "Large", false)); 

        iceCreamInfo.add(new IceCream("Chocolate", "1 Scoop", false));
        iceCreamInfo.add(new IceCream("Vanilla", "2 Scoops", true));
        iceCreamInfo.add(new IceCream("Chocolate Chip Cookie Dough", "3 Scoops", true));
        iceCreamInfo.add(new IceCream("Strawberry", "2 Scoops", false));
    }

    /* accessors */
    /**
     * Retrieve the list of ice creams
     */
    public ArrayList<Product> getIceCreamList(){
        return iceCreamInfo;
    }

    /**
     * Retrieve the list of drinks
     */
    public ArrayList<Product> getDrinksList(){
        return drinksInfo;
    }
}
