package state;

import model.Door;

/**
 *
 * @author Renan
 */
public class CloseState extends State {

    public CloseState(Door door) {
        super(door);
        System.out.println("The door is closed now");
    }

    @Override
    public void open() {
        this.door.setState(new OpenState(door));
    }

    @Override
    public void lock() {
        this.door.setState(new LockState(door));
    }
}
