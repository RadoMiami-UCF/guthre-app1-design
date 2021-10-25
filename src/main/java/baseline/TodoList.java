/*
 *  UCF COP3330 Fall 2021 Application Assignment 1 Solution
 *  Copyright 2021 Kimari Guthre
 */
package baseline;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;

class TodoList implements Serializable {
    @Serial
    private static final long serialVersionUID = 1;
    private String title;
    private ArrayList<ListItem> listOfItems;

    TodoList(String title) {
        //If title is less than 3 characters, add spaces to the end, so it's at least 3 characters.
        //Otherwise, do nothing.
        //Then, set this.title to title.
    }

    void addItem(String description, Calendar dueDate) {
        //Adds an item with the required parameters to the end of the list.
    }

    void addItem(String description, Calendar dueDate, String contents) {
        //Adds an item with the parameters to the end of the list. Used for loading from a file.
    }

    void deleteItem(int index) {
        //Removes the item at index from the list.
    }

    void setTitleOfList(String title) {
        //If title is less than 3 characters, add spaces to the end, so it's at least 3 characters.
        //Otherwise, do nothing.
        //Then, set this.title to title.
    }

    String getTitleOfList() {
        //Returns title (used for displaying the correct name of the list on the GUI.)
        return "";
    }

    void setDescriptionForItem(int itemIndex, String description) {
        //Calls listOfItems.get(itemIndex).setDescription(description).
    }

    void setDueDateForItem(int itemIndex, Calendar dueDate) {
        //Calls listOfItems.get(itemIndex).setDueDate(dueDate).
    }

    void setContentsOfItem(int itemIndex, String contents) {
        //Calls listOfItems.get(itemIndex).setContentsOfItem(contents).
    }

    String getDescriptionOfItem(int itemIndex) {
        //Returns listOfItems.get(itemIndex).getDescription().
        return "";
    }

    Calendar getDueDateOfItem(int itemIndex) {
        //Return listOfItems.get(itemIndex).getDueDate().
        return new Calendar.Builder().setDate(1, 1, 1).build();
    }

    String getContentsOfItem(int itemIndex) {
        //Returns listOfItems.get(itemIndex).getContents().
        return "";
    }
}
