module com.example.javafx_mycontacts {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.xml;
    requires java.base;


    opens com.example.javafx_mycontacts.model to javafx.base;
    opens com.example.javafx_mycontacts to javafx.fxml;
    exports com.example.javafx_mycontacts;
    exports com.example.javafx_mycontacts.controller;
    opens com.example.javafx_mycontacts.controller to javafx.fxml;
}