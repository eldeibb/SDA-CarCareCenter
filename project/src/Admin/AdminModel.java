package Admin;

public class AdminModel {
    String Name, ID;
    AdminController admin;

    public AdminModel(AdminController admin) {
        this.admin = admin;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
}
