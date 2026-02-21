package com.tuorg.riskmanager.ui;

import com.tuorg.riskmanager.service.GreetingService;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class MainView {

    private final GreetingService service = new GreetingService();
    private final VBox root = new VBox(12);

    public MainView() {
        root.setPadding(new Insets(18));

        Label title = new Label("Risk Manager");
        title.setStyle("-fx-font-size: 20px; -fx-font-weight: bold;");

        Label hint = new Label("Introduce tu número:");
        TextField numberField = new TextField();
        numberField.setPromptText("Ej: 12345");

        Button button = new Button("Greet");
        Label result = new Label();
        result.setWrapText(true);

        button.setOnAction(e -> {
            String value = numberField.getText().trim();
            if (value.isEmpty()) {
                result.setText("Escribe algo primero.");
                return;
            }
            result.setText(service.greet(value));
        });

        // Enter también ejecuta
        numberField.setOnAction(e -> button.fire());

        root.getChildren().addAll(title, hint, numberField, button, result);
    }

    public Parent getRoot() {
        return root;
    }
}