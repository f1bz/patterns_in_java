package memento;

public class TextEditor {
    private static int versionCount;

    private String text;
    private int version;


    public Memento save(){
        return new State(text,version);
    }

    public void load(Memento state){
        text = state.getGetDate();
        version = state.getVersion();
    }

    public void setText(String text){
        this.text = text;
        versionCount++;
        version = versionCount;
    }



    public String getInfo(){
        return "Amount of versions: "+versionCount+" | Current version: "+version+" | Text: "+text;
    }


    private class State implements Memento{
        private String text;
        private int version;

        public State(String text, int version) {
            this.text = text;
            this.version = version;
        }

        @Override
        public int getVersion() {
            return version;
        }

        @Override
        public String getGetDate() {
            return text;
        }
    }
}
