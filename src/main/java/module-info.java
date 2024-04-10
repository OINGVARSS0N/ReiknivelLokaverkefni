module com.example.reiknivel1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens is.vidmot to javafx.fxml;
    exports is.vidmot;
}