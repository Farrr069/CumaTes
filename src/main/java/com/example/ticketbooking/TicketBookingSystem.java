

package com.example.ticketbooking;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class TicketBookingSystem extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Ticket Booking System");

        // Create UI components
        Label movieLabel = new Label("Select Movie:");
        ComboBox<String> movieComboBox = new ComboBox<>();
        movieComboBox.getItems().addAll("Movie 1", "Movie 2", "Movie 3"); // Add your movie options

        Label ticketsLabel = new Label("Number of Tickets:");
        Spinner<Integer> ticketsSpinner = new Spinner<>(1, 10, 1);

        Label nameLabel = new Label("Name:");
        TextField nameField = new TextField();

        Label emailLabel = new Label("Email:");
        TextField emailField = new TextField();

        Button bookButton = new Button("Book Tickets");
        bookButton.setOnAction(e -> bookTickets(movieComboBox.getValue(), ticketsSpinner.getValue(), nameField.getText(), emailField.getText()));

        // Create layout
        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(20, 20, 20, 20));

        gridPane.add(movieLabel, 0, 0);
        gridPane.add(movieComboBox, 1, 0);
        gridPane.add(ticketsLabel, 0, 1);
        gridPane.add(ticketsSpinner, 1, 1);
        gridPane.add(nameLabel, 0, 2);
        gridPane.add(nameField, 1, 2);
        gridPane.add(emailLabel, 0, 3);
        gridPane.add(emailField, 1, 3);
        gridPane.add(bookButton, 1, 4);

        // Create scene
        Scene scene = new Scene(gridPane, 400, 200);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void bookTickets(String movie, int numTickets, String name, String email) {
        // Perform booking logic here
        // You can display a confirmation message or perform other actions based on the user input
        System.out.println("Booking Details:");
        System.out.println("Movie: " + movie);
        System.out.println("Number of Tickets: " + numTickets);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Tickets booked successfully!");
}
}
