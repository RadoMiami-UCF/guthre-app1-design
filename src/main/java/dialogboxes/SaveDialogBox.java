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

import java.io.File;

public class SaveDialogBox {
    private File file;

    @FXML
    private Button cancelButton;

    @FXML
    private Button chooseFileButton;

    @FXML
    private TextField filePathDisplay;

    @FXML
    private Button saveListsButton;

    private TodoListGroup todoListGroup;

    public void setTodoListGroup(TodoListGroup todoListGroup) {
        this.todoListGroup = todoListGroup;
    }

    @FXML
    void chooseFile() {
        //Load the correct file into file through a fileChooser.
        //Then, load the string representation of that file into filePathDisplay for display.
    }

    @FXML
    void closeDialogBox() {
        //Simply close the dialog box.
        var stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }

    @FXML
    void saveListsToFile() {
        //Check if file is not null.
        /*If a file isn't null, call TodoListGroup.writeListsToFile(pathToFile, listsToWrite), where the former is
        the path from file, and the latter is an array of the checkboxes.*/
    }
}
