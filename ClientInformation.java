import java.util.Scanner ;
import java.util.ArrayList;

import java.io.File;
import java.io.FileNotFoundException;
/**
 * ClientInformation will provide information from an existent file
 * - It reads the file info into an ArrayList
 * - Sort and print the list alphabetically by name
 *
 * @author Amanda Barbieri
 * @version May/17/2020
 */
public class ClientInformation{
    // instance variables
    private ArrayList<String> clientList;

    /**
     * Constructor for objects of class ClientInformation
     */
    public ClientInformation(){
        clientList = new ArrayList<>();

    }

    /* mutators */
    /**
     * It will read the information from an existent file into a ArrayList
     */
    public void setReaderToArray(){
        try{
            String client, number = null;

            File reader = new File("clientFile/clientInfo.txt");

            Scanner scn = new Scanner(reader);
            scn.useDelimiter(",");

            while(scn.hasNext()){
                number = scn.next();
                client = scn.next();

                clientList.add(client + " - " + number);
            }
            scn.close();
        }catch (FileNotFoundException exception){
            System.out.println("An error occurred.");
        }
    }    

    /**
     * Print the client list
     */
    public void printClientList(){
        for(String client : clientList){
            System.out.println(client);
        }
        System.out.println();
    }

    /**
     * Sort the ArrayList
     */
    public void setAlphabetically(){
        int first = 0;

        System.out.println("*----- Alphabetically Sorted Client List -----*");
        for(int startIndex = 0; startIndex < clientList.size() - 1; startIndex++){
            first = startIndex;

            for(int nextIndex = startIndex + 1; nextIndex < clientList.size(); nextIndex++){
                if(clientList.get(nextIndex).compareTo(clientList.get(first)) < 0){
                    first = nextIndex;
                }

                String temp = clientList.get(startIndex);
                clientList.set(startIndex, clientList.get(first));
                clientList.set(first, temp);

                /* I used the set(int index, E element) method:
                It replaces the element at the specified position in this list with
                the specified element */
            }
        }
        printClientList();
        System.out.println();
    }
}









