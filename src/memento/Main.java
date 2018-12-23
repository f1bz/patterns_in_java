package memento;

public class Main {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        StateBackups stateBackups = new StateBackups(textEditor);

        textEditor.setText("hello");
        System.out.println(textEditor.getInfo());
        stateBackups.saveState();

        textEditor.setText("how are you");
        System.out.println(textEditor.getInfo());
        stateBackups.saveState();

        stateBackups.undo();
        System.out.println(textEditor.getInfo());

        textEditor.setText("fine");
        System.out.println(textEditor.getInfo());
        stateBackups.saveState();

        textEditor.setText("and you?");
        System.out.println(textEditor.getInfo());
        stateBackups.saveState();

        stateBackups.undo();
        System.out.println(textEditor.getInfo());

    }
}
