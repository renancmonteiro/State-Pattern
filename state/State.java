package state;

import model.Door;

/**
 *
 * @author Renan
 */
public abstract class State {

    final Door door;

    public State(Door door) {
        this.door = door;
    }

    public void open() throws Exception {
        throw new Exception("impossible to perform this operation from this state");
    }

    public void close() throws Exception {
        throw new Exception("impossible to perform this operation from this state");
    }

    public void lock() throws Exception {
        throw new Exception("impossible to perform this operation from this state");
    }

    public void unlock() throws Exception {
        throw new Exception("impossible to perform this operation from this state");
    }
}
