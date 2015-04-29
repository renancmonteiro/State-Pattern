package state;

import model.Door;

/**
 *
 * @author Renan
 */
class LockState extends State {

    public LockState(Door door) {
        super(door);
        System.out.println("The door is locked now");
    }

    @Override
    public void unlock() {
        this.door.setState(new CloseState(this.door));
    }
}
