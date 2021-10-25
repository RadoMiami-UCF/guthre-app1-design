/*
 *  UCF COP3330 Fall 2021 Application Assignment 1 Solution
 *  Copyright 2021 Kimari Guthre
 */
package dialogboxes;

import baseline.TodoListGroup;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.stage.Stage;

public class DeleteListDialogBox {

    private TodoListGroup todoListGroup;

    @FXML
    private Button cancelButton;

    @FXML
    private Button deleteItemButton;

    @FXML
    private ChoiceBox<?> titleOfList;

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
    void deleteList() {
        //First, check to see if a list has been chosen.
        //If that's the case, call TodoListGroup.deleteList(listIndex).
    }
}
