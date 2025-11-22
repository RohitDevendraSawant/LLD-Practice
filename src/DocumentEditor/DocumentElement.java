package DocumentEditor;

interface DocumentElement {
    public String render();
}

class TextElement implements DocumentElement {
    private String text;

    public TextElement(String text) {
        this.text = text;
    }

    @Override
    public String render() {
        return text;
    }
}

class ImageElement implements DocumentElement {
    private final String imagePath;

    public ImageElement(String imagePath){
        this.imagePath = imagePath;
    }

    @Override
    public String render() {
        return imagePath;
    }
}

class TabSpaceElement implements DocumentElement {
    @Override
    public String render() {
        return "\t\t";
    }
}

class LineSpaceElement implements DocumentElement {
    @Override
    public String render() {
        return "\n\n";
    }
}