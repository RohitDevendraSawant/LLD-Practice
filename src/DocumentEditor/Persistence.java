package DocumentEditor;

import java.util.ArrayList;

interface Persistence {
    public void save(String document);
}

class FileStorage implements Persistence {
    @Override
    public void save(String document){
        System.out.println("File saved");
    }
}

class DbStorage implements Persistence {
    @Override
    public void save(String document){
        System.out.println("Saved in DB");
    }
}