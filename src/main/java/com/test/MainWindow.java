package com.test;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainWindow extends Application
{
private Stage window;
private MenuBar menuBar;

private BorderPane mainLayout;
private VBox entryLayout;
private HBox lobbyLayout;


public static void main(String[] args)
{
    launch(args);
}

public void start (Stage primaryStage) throws Exception
{
    window = primaryStage;

    mainLayout = new BorderPane();

    prepareMenuBar();
    mainLayout.setTop(menuBar);
    BorderPane.setMargin(menuBar,new Insets(0,0,20,0));

    prepareEntryLayout();
    mainLayout.setCenter(entryLayout);

    Scene scene = new Scene(mainLayout,300,200);
    scene.getStylesheets().add(getClass().getResource("SceneStyle.css").toExternalForm());


    window.setScene(scene);
    window.show();
}

private void prepareMenuBar()
{
    menuBar = new MenuBar();
    Menu options, gameRules, info;

    options = new Menu("Opcje");
    MenuItem display = new MenuItem("Wyświetlanie");
    MenuItem connection = new MenuItem("Połączenie");
    options.getItems().addAll(display,connection);

    gameRules = new Menu("Zasady Gry");
    info = new Menu("Info");

    menuBar.getMenus().addAll(options, gameRules, info);
}

private void prepareEntryLayout()
{
    entryLayout = new VBox();
    Label nicknameLabel = new Label("Pseudonim :");
    TextField userInput = new TextField();
    Button nextScene = new Button("nextScene");

/*    Board b = new Board();
    b.createPieces();

    nextScene.setOnAction(e -> {
        mainLayout.setCenter(boardPrint(b));
    });
*/
    entryLayout.getChildren().addAll(nicknameLabel, userInput, nextScene);

}
}