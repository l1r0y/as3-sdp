package Assignment3.Memento;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        Caretaker caretaker = new Caretaker();

        editor.setText("Version 1");
        caretaker.save(editor);

        editor.setText("Version 2");
        caretaker.save(editor);

        editor.setText("Version 3");
        System.out.println("Current Text: " + editor.getText());

        caretaker.undo(editor);
        System.out.println("After Undo: " + editor.getText());

        caretaker.undo(editor);
        System.out.println("After Undo: " + editor.getText());
    }
}