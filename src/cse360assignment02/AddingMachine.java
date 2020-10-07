/**
 * CSE 360 Assignment 02
 * Created 07 Oct 2020
 * Creater Linda Lau
 */

package cse360assignment02;

public class AddingMachine{
    private int total;
    private String history;

    /**
     * This method constructs a new object and initializes the private variables of the object.
     * Does not take any parameters or return anything.
     */
    public AddingMachine() {
        total = 0;
        history = "" + total;
    }

    /**
     * This method allows the user to view the value of the private variable "total".
     * @return int: total
     */
    public int getTotal(){
        return total;
    }

    /**
     * This method adds a given value to the current value of total and stores the sum in total and
     * "records" the operation by concatenating the operation to String variable "history".
     * @param value
     * Does not return anything.
     */
    public void add (int value){
        total += value;
        history += " + " + value;
    }

    /**
     * This method subtracts a given value to the current value of total and stores the difference in total and
     * "records" the operation by concatenating the operation to String variable "history".
     * @param value
     * Does not return anything.
     */
    public void subtract (int value){
        total -= value;
        history += " - " + value;
    }

    /**
     * This method allows the user to view the value stored in the private string variable "history".
     * @return String: history
     */
    public String toString(){
        return history;
    }

    /**
     * This method "clears" the object or "resets" the object by reinitializing variables total and history.
     * Does not take in any parameters nor returns anything.
     */
    public void clear(){
        total = 0;
        history = "" + total;
    }
}