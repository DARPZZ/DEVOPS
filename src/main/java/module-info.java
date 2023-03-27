module com.example.devops {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.devops to javafx.fxml;
    exports com.example.devops;
}