/*
 * 
 *    Copyright MBCRAFT di Marco Bagnaresi - © 2015
 *    All rights reserved - Tutti i diritti riservati
 * 
 *    Mail : info [ at ] mbcraft [ dot ] it 
 *    Web : http://www.mbcraft.it
 * 
 */

package it.mbcraft.libraries.ui.common;

import java.util.Stack;
import javafx.stage.Stage;

/**
 * This class represents the stack of windows of the current application.
 * It is used to show windows stacked on top of each other.
 * 
 * @author Marco Bagnaresi <marco.bagnaresi@gmail.com>
 */
public class WindowStack {
    
    private static final Stack<Stage> windowStack = new Stack();
    
    /**
     * Pushes a window on top of the window stack.
     * 
     * @param st The stage representing the window to push.
     */
    public static void push(Stage st) {
        windowStack.push(st);
    }
    
    /**
     * Removes the topmost window from the window stack.
     */
    public static void pop() {
        windowStack.pop();
    }
    
    /**
     * Gets the top window from the window stack.
     * 
     * @return The topmost window as a Stage instance
     */
    public static Stage top() {
        return windowStack.peek();
    }
    
    /**
     * Returns the root Stage window from the window stack.
     * 
     * @return The Stage instance of the root window in this window stack.
     */
    public static Stage getRoot() {
        return windowStack.firstElement();
    }
}
