/*
 *  UCF COP3330 Fall 2021 Application Assignment 1 Solution
 *  Copyright 2021 Kimari Guthre
 */
package dialogboxes;

import baseline.TodoListGroup;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AddListDialogBox {
    private TodoListGroup todoListGroup;

    @FXML
    private Button cancelButton;

    @FXML
    private Button createItemButton;

    @FXML
    private TextField titleOfList;

    public void setTodoListGroup(TodoListGroup todoListGroup) {
        this.todoListGroup = todoListGroup;
    }

    @FXML
    void closeDialogBox() {
        //Simply close the dialog box.
        var stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }

    @FXML
    void createList() {
        //First, check to see if a title with at least 3 characters has been chosen.
        //If that's the case, call TodoListGroup.addList(title).
    }
}
