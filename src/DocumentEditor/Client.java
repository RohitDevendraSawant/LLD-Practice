package DocumentEditor;

public class Client {
    public static void main() {
        Document doc = new Document();
        Persistence storage = new FileStorage();

        DocumentEditor editor = new DocumentEditor(doc, storage);

        editor.addTabSpace();
        editor.addText("Title here");
        editor.addNewLine();
        editor.addText("Lets start the doc");
        editor.addNewLine();
        editor.addImage("./tmp");

        System.out.println(editor.render());
    }
}
