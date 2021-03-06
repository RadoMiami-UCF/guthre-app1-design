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

public class DeleteItemDialogBox {

    private TodoListGroup todoListGroup;

    @FXML
    private Button cancelButton;

    @FXML
    private ChoiceBox<?> itemChoiceBox;

    @FXML
    private ChoiceBox<?> listChoiceBox;

    @FXML
    private Button removeItemButton;

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
    void removeItem() {
        //First, check to see if both an item and list has been chosen.
        //If that's the case, call TodoListGroup.deleteItemFromList(listIndex, itemIndex).
    }
}

