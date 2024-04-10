module com.example.pruebaluis {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pruebaluis to javafx.fxml;
    exports com.example.pruebaluis;
}