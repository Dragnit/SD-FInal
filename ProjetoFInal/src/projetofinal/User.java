package projetofinal;

/**
 * @author Guilherme Rodrigues e Rodrigo Pereira
 */

public class User {
    private String name;
    private String id;
    private String folder;
    
    public User() {}
    
    public User(String aName, String aId, String aFolder) {       
        name = aName;
        id = aId;
        folder = aFolder;
    }
    

    //getters e setters
    
    public String getName() {
        return name;
    }
    
    public String getId() {
        return id;
    }
    
    public String getFolder() {
        return folder;
    }
    
     public void setName(String aName) {
        name = aName;
    }
    
    public void setId(String aId) {
        id = aId;
    }
    
    public void setFolder(String aFolder) {
        folder = aFolder;
    }
}
