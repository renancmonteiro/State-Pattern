package state;

import model.Door;

/**
 *
 * @author Renan
 */
class OpenState extends State {

    public OpenState(Door door) {
        super(door);
        System.out.println("The door is open now");
    }

    @Override
    public void close() {
        this.door.setState(new CloseState(this.door));
    }

}
