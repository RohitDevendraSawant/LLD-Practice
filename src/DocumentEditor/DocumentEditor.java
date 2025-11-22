package DocumentEditor;

public class DocumentEditor {
    private Document document;
    Persistence storage;
    private String renderedDocument = "";

    public DocumentEditor(Document document, Persistence storage) {
        this.document = document;
        this.storage = storage;
    }

    public void addText(String text){
        document.addElement(new TextElement(text));
    }

    public void addImage(String imagePath){
        document.addElement(new ImageElement(imagePath));
    }

    public void addTabSpace(){
        document.addElement(new TabSpaceElement());
    }

    public void addNewLine(){
        document.addElement((new LineSpaceElement()));
    }

    public String render(){
        if(renderedDocument.isEmpty()){
            renderedDocument = document.renderDocument();
        }

        return renderedDocument;
    }
}
