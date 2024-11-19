module org.example.flyweight {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.flyweight to javafx.fxml;
    exports org.example.flyweight;
}