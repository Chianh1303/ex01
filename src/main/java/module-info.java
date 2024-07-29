module org.example.thuchanh2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.thuchanh2 to javafx.fxml;
    exports org.example.thuchanh2;
}