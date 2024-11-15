package com.example.calculator;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Simple Calculator");

        // Set up the grid layout for the calculator UI
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(20, 20, 20, 20));

        // Number 1 input field
        Label label1 = new Label("Number 1:");
        grid.add(label1, 0, 0);
        TextField num1Field = new TextField();
        grid.add(num1Field, 1, 0);

        // Number 2 input field
        Label label2 = new Label("Number 2:");
        grid.add(label2, 0, 1);
        TextField num2Field = new TextField();
        grid.add(num2Field, 1, 1);

        // Result label and field
        Label resultLabel = new Label("Result:");
        grid.add(resultLabel, 0, 2);
        TextField resultField = new TextField();
        resultField.setEditable(false);
        grid.add(resultField, 1, 2);

        // Buttons for operations
        Button addButton = new Button("+");
        Button subButton = new Button("-");
        Button mulButton = new Button("*");
        Button divButton = new Button("/");

        // Buttons layout
        grid.add(addButton, 0, 3);
        grid.add(subButton, 1, 3);
        grid.add(mulButton, 0, 4);
        grid.add(divButton, 1, 4);

        // Event handling for buttons
        addButton.setOnAction(e -> calculate(num1Field, num2Field, resultField, "+"));
        subButton.setOnAction(e -> calculate(num1Field, num2Field, resultField, "-"));
        mulButton.setOnAction(e -> calculate(num1Field, num2Field, resultField, "*"));
        divButton.setOnAction(e -> calculate(num1Field, num2Field, resultField, "/"));

        // Set the scene and show the window
        Scene scene = new Scene(grid, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void calculate(TextField num1Field, TextField num2Field, TextField resultField, String operator) {
        try {
            double num1 = Double.parseDouble(num1Field.getText());
            double num2 = Double.parseDouble(num2Field.getText());
            double result;

            switch (operator) {
                case "+" -> result = num1 + num2;
                case "-" -> result = num1 - num2;
                case "*" -> result = num1 * num2;
                case "/" -> {
                    if (num2 == 0) {
                        resultField.setText("Cannot divide by 0");
                        return;
                    }
                    result = num1 / num2;
                }
                default -> throw new IllegalStateException("Unexpected value: " + operator);
            }
            resultField.setText(String.valueOf(result));
        } catch (NumberFormatException e) {
            resultField.setText("Invalid input");
        }
    }

    // Main method to launch the JavaFX application
    public static void main(String[] args) {
        launch(args); // This launches the start method
    }
}
