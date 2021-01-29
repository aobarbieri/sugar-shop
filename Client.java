import java.util.HashMap;
import java.util.Scanner ;
import java.util.Iterator;
import java.util.Set;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;

/**
 * Cliente class will hold information about a client.
 * - Frequent shoppers information are added into a HashMap
 *   Information includes the exclusive number for each client and the client full name
 * - A file can be created
 * - The client list can be added in the file

 * @author Amanda Barbieri
 * @version May/17/2020
 */
public class Client{
    // instance variables
    private HashMap<String, String> clientList;

    /**
     * Constructor for objects of class User
     */
    public Client(){
        clientList = new HashMap<>();
        setClientList();
    }

    /* mutators */
    /**
     * Set the clients to the list of frequent shoppers
     */
    public void setClientList(){
        clientList.put("0009", "Amanda Barbieri");
        clientList.put("0098", "Jarren Frank");
        clientList.put("0057", "Alyne Gallengher");
        clientList.put("0092", "Alexander Genski");
        clientList.put("0065", "Nick Mitzian");
        clientList.put("0021", "Lian Smith");
    }

    /**
     * Set a new client to the list of frequent shoppers
     */
    public void setNewClient(String clientNumber, String clientName){
        clientList.put(clientNumber, clientName);
    }

    /**
     * Print all the clients in the list
     */
    public void printClientList(){
        String cNumber = null;
        String cName = null;

        Set<String> setNumber = clientList.keySet();
        Iterator<String> iteration = setNumber.iterator();
        
        System.out.println("*----- Client List -----*");
        while(iteration.hasNext()){
            cNumber = iteration.next();
            cName = clientList.get(cNumber);
            System.out.println(cNumber + " - " + cName);
        }
        System.out.println();
    }

    /**
     * Create a new file
     */
    public void setClientsFile(){
        try{
            File fileObj = new File("clientFile/clientInfo.txt");
            if(fileObj.createNewFile()){
                System.out.println("File created: " + fileObj.getName());
                System.out.println();
            }else{
                System.out.println("File already exists.");
                System.out.println();
            }
        }catch (IOException exception){
            System.out.println("An error occurred.");
            exception.printStackTrace();
        }
    }

    /**
     * Client list will be added to the file
     */
    public void setClientsListToFile(){
        try{
            FileWriter myWriter = new FileWriter("clientFile/clientInfo.txt");

            String cNumber = null;
            String cName = null;

            Set<String> setNumber = clientList.keySet();
            Iterator<String> iteration = setNumber.iterator();

            while(iteration.hasNext()){
                cNumber = iteration.next();
                cName = clientList.get(cNumber);

                myWriter.write(cNumber + "," + cName);
                
                myWriter.write(",");
            }
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
            System.out.println();
        }catch (IOException exception){
            System.out.println("An error occurred.");
            exception.printStackTrace();
        }
    }

    /* accessors */
    /**
     * Retrieve the size of the client list
     */
    public int getClientListSize(){
        return clientList.size();
    }
}
