// src/RemoteControl.java
public class RemoteControl {
    private Command slot;
    public void setCommand(Command command) {
        this.slot = command;
    }
    public void pressButton() {
        if (slot != null) slot.execute();
    }
    public void pressUndo() {
        if (slot != null) slot.undo();
    }
}
