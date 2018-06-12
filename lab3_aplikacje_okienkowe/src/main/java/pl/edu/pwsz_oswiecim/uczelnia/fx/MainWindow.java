package pl.edu.pwsz_oswiecim.uczelnia.fx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import javax.swing.*;

public class MainWindow extends Application {

    private static final String USERNAME = "root";

    private static final String PASSWORD = "root123";

    private TextField usernameTextField = new TextField();

    private PasswordField passwordField = new PasswordField();

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"Moja pierwsza aplikacja okienkowa");
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("moja pierwsza aplikacja okienkowa");
;
        Button myFirstButton = new Button("Witam");
        myFirstButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                JOptionPane.showMessageDialog(null,"Witam, to jest mój pierwszy przycisk.");
                }
            });

        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets( 15, 15, 15, 15));

        gridPane.add(myFirstButton, 0, 0);


        Button loginButton = new Button("Zaloguj");
        loginButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                login();
            }
        });
        gridPane.add(loginButton, 1, 0);



        gridPane.add(usernameTextField, 1, 1);
        gridPane.add(passwordField, 1, 3);

        primaryStage.setScene(new Scene(gridPane, 500, 500));


        primaryStage.show();
    }

    private void login (){
        String usernameText = usernameTextField.getText();
        String passwordText = passwordField.getText();

        if (USERNAME.equals(usernameText) && PASSWORD.equals(passwordText)) {

            JOptionPane.showMessageDialog(null,"Logowanie pomyślne");
        } else {

            JOptionPane.showMessageDialog(null,"Niewłaściwe dane logowania");
        }

    }
}
