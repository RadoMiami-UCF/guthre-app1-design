/*
 *  UCF COP3330 Fall 2021 Application Assignment 1 Solution
 *  Copyright 2021 Kimari Guthre
 */
package baseline;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Calendar;

public class TodoListGroup {
    private ArrayList<TodoList> listOfLists;

    public void writeListsToFile(Path pathToFile, boolean[] listsToWrite) {
        //First, create a FileOutputStream to pathToFile.
        //Then, create a ObjectOutputStream to the FileOutputStream.
        //Then, iterate through each list in listOfLists.
        //If listsToWrite[index] is true, then call objectOutputStream.writeObject(listOfLists.get([index])).
        //Then, call objectOutputStream.flush().
        //Finally, call objectOutputStream.close().
    }

    public void readListsFromFile(Path pathToFile) {
        //First, create a buffered reader for pathToFile.
        //Then, read every list in the file.
        //For each list found, create a list with the correct title and dueDate, then add the appropriate items.
    }

    public void addList(String title) {
        //Adds a list with the given title to listOfLists by calling listOfLists.add(new TodoList(title)).
    }

    public void deleteList(int index) {
        //Deletes the list at index in listOfLists by calling listOfLists.remove(index).
    }

    public void setTitleOfList(int index, String title) {
        //Calls listOfLists.get(index).setTitleOfList(title).
    }

    public String getTitleOfList(int index) {
        //Returns listOfLists.get(index).getTitleOfList().
        //These return functions are for proper UI drawing.
        return "";
    }

    public void addItemToList(int listIndex, String description, Calendar dueDate) {
        //Calls listOfLists.get(listIndex).addItem(description, dueDate).
    }

    public void deleteItemFromList(int listIndex, int itemIndex) {
        //Calls listOfLists.get(listIndex).deleteItem(itemIndex).
    }

    public void setDescriptionForItem(int listIndex, int itemIndex, String description) {
        //Calls listOfLists.get(listIndex).setDescriptionForItem(itemIndex, dueDate).
    }

    public void setDueDateForItem(int listIndex, int itemIndex, Calendar dueDate) {
        //Calls listOfLists.get(listIndex).setDueDateForItem(itemIndex, dueDate).
    }

    public void setContentsOfItem(int listIndex, int itemIndex, String contents) {
        //Calls listOfLists.get(listIndex).setContentsOfItem(itemIndex, contents).
    }

    public String getDescriptionOfItem(int listIndex, int itemIndex) {
        //Returns listOfLists.get(listIndex).getDescriptionOfItem(itemIndex).
        return "";
    }

    public Calendar getDueDateOfItem(int listIndex, int itemIndex) {
        //Returns listOfLists.get(listIndex).getDueDateOfItem(itemIndex).
        return new Calendar.Builder().setDate(1, 1, 1).build();
    }

    public String getContentsOfItem(int listIndex, int itemIndex) {
        //Returns listOfLists.get(listIndex).getContentsOfItem(itemIndex).
        return "";
    }
}
