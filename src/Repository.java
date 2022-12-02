import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Repository implements Serializable{

    private static Repository repo = null;

    private Map<String, Users> users = new HashMap<>();
    private Map<String, Admin> admins = new HashMap<>();
    //private Map<String, Users> users = new HashMap<>();

    public Repository(){};
    public Map<String, Users> getUsers() {return users;}
    public Map<String, Admin> getAdmins() {return admins;}

    public void serialize(String filename){ /*Converter os objetos em bytes*/

        try{
            FileOutputStream fileOut = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(this);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in " + filename + "\n");
        } catch(IOException ex) {
            System.out.println("ErrorSerialize: " + ex.getMessage());
        }
    }

    public static void deserialize(String filename){/*Converter os bytes em  objetos*/

        try{
            FileInputStream fileIn = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            repo = (Repository) in.readObject();
            in.close();
            fileIn.close();
        } catch(IOException ex){
            System.out.println("ErrorDeserialize: " + ex.getMessage());
        } catch(ClassNotFoundException ex){
            System.out.println("Repository class not found. " + ex.getMessage());
        }
    }
}
