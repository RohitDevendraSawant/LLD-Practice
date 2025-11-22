package SingletonPattern;

class DbManager {
    static DbManager instance = null;
    private DbManager() {};

    static DbManager getInstance(){
        if (instance == null){
            instance = new DbManager();
        }

        return instance;
    }

    public void setConnection(){
        System.out.println("connected with db");
    }
}

public class Singleton {
    public static void main(String[] args) {
        DbManager inst = DbManager.getInstance();
        inst.setConnection();
    }
}
