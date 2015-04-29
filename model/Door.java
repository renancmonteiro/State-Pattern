package model;

import state.CloseState;
import state.State;

/**
 *
 * @author Renan
 */
public class Door {

    private State state;

    public Door() {
        this.state = new CloseState(this);
    }

    public void open() throws Exception {
        this.state.open();
    }

    public void close() throws Exception {
        this.state.close();
    }

    public void lock() throws Exception {
        this.state.lock();
    }

    public void unlock() throws Exception {
        this.state.unlock();
    }

    public void setState(State state) {
        this.state = state;
    }

}
