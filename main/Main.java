package main;

import java.util.logging.Level;
import java.util.logging.Logger;
import model.Door;

/**
 *
 * @author Renan
 */
public class Main {

    public static void main(String[] args) {
        try {
            Door door = new Door();
            door.open();
            door.close();
            door.lock();
            door.unlock();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

}
