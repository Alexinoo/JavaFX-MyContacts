module com.example.javafx_mycontacts {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafx_mycontacts to javafx.fxml;
    exports com.example.javafx_mycontacts;
}