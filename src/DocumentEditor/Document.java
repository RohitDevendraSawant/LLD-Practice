package DocumentEditor;

import java.util.ArrayList;

public class Document {
    ArrayList<DocumentElement> docElements = new ArrayList<>();
    private String document = "";

    public void addElement(DocumentElement element){
        docElements.add(element);
    }

    public String renderDocument(){
        for (DocumentElement ele: docElements)
            document = document + ele.render();
        return document.toString();
    }
}
