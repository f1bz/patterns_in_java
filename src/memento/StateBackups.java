package memento;

import java.util.Stack;

public class StateBackups {
    private TextEditor textEditor;
    private Stack<Memento> history = new Stack<>();

    public StateBackups(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    public void saveState(){
        history.push(textEditor.save());
    }

    public void undo(){
        history.pop();
        textEditor.load(history.peek());
    }
}
