/*
 *  UCF COP3330 Fall 2021 Application Assignment 1 Solution
 *  Copyright 2021 Kimari Guthre
 */
package baseline;

import dialogboxes.AddItemDialogBox;
import dialogboxes.AddListDialogBox;
import dialogboxes.DeleteItemDialogBox;
import dialogboxes.DeleteListDialogBox;
import dialogboxes.SaveDialogBox;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class FXMLController {
    private static final String STYLES_CSS_URI_STRING = "styles.css";

    private TodoListGroup todoListGroup;

    @FXML
    private MenuItem addItemButton;

    @FXML
    private MenuItem addListButton;

    @FXML
    private MenuItem deleteItemButton;

    @FXML
    private MenuItem deleteListButton;

    @FXML
    private MenuItem loadButton;

    @FXML
    private MenuItem saveButton;

    public void setTodoListGroup(TodoListGroup todoListGroup) {
        this.todoListGroup = todoListGroup;
    }

    @FXML
    void openAddItemDialogBox() throws IOException {
        /*Open a dialog box containing a drop-down of valid lists, and fields for a non-null description and due date,
        a button to create the item, and another to cancel the creation.*/
        var dialogStage = new Stage();
        //Make it so that the dialog box can't be resized.
        dialogStage.setResizable(false);
        //Make it so the main window is locked while this dialog box is open.
        dialogStage.initModality(Modality.APPLICATION_MODAL);

        var loader = new FXMLLoader(Objects.requireNonNull(getClass()
                .getResource("AddItemDialogBox.fxml")));
        Parent root = loader.load();
        ((AddItemDialogBox) loader.getController()).setTodoListGroup(todoListGroup);

        var dialogScene = new Scene(root);
        dialogScene.getStylesheets().add(Objects.requireNonNull(getClass().getResource(STYLES_CSS_URI_STRING))
                .toExternalForm());

        dialogStage.setTitle("Add An Item");
        dialogStage.setScene(dialogScene);
        dialogStage.show();
    }

    @FXML
    void openAddListDialogBox() throws IOException {
        /*Open a dialog box containing a field for a title with at least 3 characters and two buttons: one to create
        the list, and another to cancel the creation.*/
        var dialogStage = new Stage();
        //Make it so that the dialog box can't be resized.
        dialogStage.setResizable(false);
        //Make it so the main window is locked while this dialog box is open.
        dialogStage.initModality(Modality.APPLICATION_MODAL);

        var loader = new FXMLLoader(Objects.requireNonNull(getClass()
                .getResource("AddListDialogBox.fxml")));
        Parent root = loader.load();
        ((AddListDialogBox) loader.getController()).setTodoListGroup(todoListGroup);

        var dialogScene = new Scene(root);
        dialogScene.getStylesheets().add(Objects.requireNonNull(getClass().getResource(STYLES_CSS_URI_STRING))
                .toExternalForm());

        dialogStage.setTitle("Add A List");
        dialogStage.setScene(dialogScene);
        dialogStage.show();
    }

    @FXML
    void openDeleteItemDialogBox() throws IOException {
        /*Open a dialog box containing two drop-downs: one to select the list the item is in, and another for the item
        to delete, in addition to two buttons: one to cancel the deletion, and another to confirm it.*/
        var dialogStage = new Stage();
        //Make it so that the dialog box can't be resized.
        dialogStage.setResizable(false);
        //Make it so the main window is locked while this dialog box is open.
        dialogStage.initModality(Modality.APPLICATION_MODAL);

        var loader = new FXMLLoader(Objects.requireNonNull(getClass()
                .getResource("DeleteItemDialogBox.fxml")));
        Parent root = loader.load();
        ((DeleteItemDialogBox) loader.getController()).setTodoListGroup(todoListGroup);

        var dialogScene = new Scene(root);
        dialogScene.getStylesheets().add(Objects.requireNonNull(getClass().getResource(STYLES_CSS_URI_STRING))
                .toExternalForm());

        dialogStage.setTitle("Delete An Item");
        dialogStage.setScene(dialogScene);
        dialogStage.show();
    }

    @FXML
    void openDeleteListDialogBox() throws IOException {
        /*Open a dialog box containing a drop-down with the list to delete, and two buttons: one to cancel the
        deletion, and another to confirm it.*/
        var dialogStage = new Stage();
        //Make it so that the dialog box can't be resized.
        dialogStage.setResizable(false);
        //Make it so the main window is locked while this dialog box is open.
        dialogStage.initModality(Modality.APPLICATION_MODAL);

        var loader = new FXMLLoader(Objects.requireNonNull(getClass()
                .getResource("DeleteListDialogBox.fxml")));
        Parent root = loader.load();
        ((DeleteListDialogBox) loader.getController()).setTodoListGroup(todoListGroup);

        var dialogScene = new Scene(root);
        dialogScene.getStylesheets().add(Objects.requireNonNull(getClass().getResource(STYLES_CSS_URI_STRING))
                .toExternalForm());

        dialogStage.setTitle("Delete A List");
        dialogStage.setScene(dialogScene);
        dialogStage.show();
    }

    @FXML
    void openLoadDialogBox() {
        //First, open a fileChooser.
        //Then, call Application.todoListGroup.readListsFromFile(filePath).
    }

    @FXML
    void openSaveDialogBox() throws IOException {
        /*Open a dialog box containing a button to choose a file through a fileChooser, a list of all the lists in the
        form of a vbox with a checkbox next to each to indicate whether to include them in the save, and finally two
        lone buttons: one to cancel the save, and one to confirm it.*/
        var dialogStage = new Stage();
        //Make it so that the dialog box can't be resized.
        dialogStage.setResizable(false);
        //Make it so the main window is locked while this dialog box is open.
        dialogStage.initModality(Modality.APPLICATION_MODAL);

        var loader = new FXMLLoader(Objects.requireNonNull(getClass()
                .getResource("SaveDialogBox.fxml")));
        Parent root = loader.load();
        ((SaveDialogBox) loader.getController()).setTodoListGroup(todoListGroup);

        var dialogScene = new Scene(root);
        dialogScene.getStylesheets().add(Objects.requireNonNull(getClass().getResource(STYLES_CSS_URI_STRING))
                .toExternalForm());

        dialogStage.setTitle("Save Lists");
        dialogStage.setScene(dialogScene);
        dialogStage.show();
    }
}
