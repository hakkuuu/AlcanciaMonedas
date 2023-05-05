module com.alcancia.alcancia20231 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.alcancia.alcancia20231 to javafx.fxml;
    exports com.alcancia.alcancia20231;
}