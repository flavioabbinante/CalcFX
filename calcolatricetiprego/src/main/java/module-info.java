module com.example.calcolatricetiprego {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.calcolatricetiprego to javafx.fxml;
    exports com.example.calcolatricetiprego;
    exports application;
    opens application to javafx.fxml;
}