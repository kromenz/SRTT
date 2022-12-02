import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

public class Repository implements Serializable{

    private static Repository repo = null;

    private Map<String, Users> users = new HashMap<>();
    private Map<String, Admin> admins = new HashMap<>();
    //private Map<String, Users> users = new HashMap<>();


}
