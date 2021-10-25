/*
 *  UCF COP3330 Fall 2021 Application Assignment 1 Solution
 *  Copyright 2021 Kimari Guthre
 */
package baseline;

import java.io.Serial;
import java.io.Serializable;
import java.util.Calendar;

class ListItem implements Serializable {
    @Serial
    private static final long serialVersionUID = 1;
    private String description;
    private Calendar dueDate;
    private String contents;

    ListItem(String description, Calendar dueDate) {
        /*Set this.description to description (which should be non-null), and this.dueDate to dueDate (which also
        should be non-null).*/
    }

    ListItem(String description, Calendar dueDate, String contents) {
        //First, set this.contents to contents.
        //Then, use this(description, dueDate).
        //This method is mainly used for loading from a file.
    }

    void setDescription(String description) {
        //If description isn't empty, change this.description to description.
    }

    void setDueDate(Calendar dueDate) {
        //Changes this.dueDate to dueDate.
    }

    void setContentsOfItem(String contents) {
        //Changes this.contents to contents.
    }

    String getDescription() {
        //Returns description.
        return "";
    }

    Calendar getDueDate() {
        //Returns dueDate.
        return new Calendar.Builder().setDate(1, 1, 1).build();
    }

    String getContents() {
        //Returns contents.
        return "";
    }
}
