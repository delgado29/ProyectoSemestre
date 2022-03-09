module com.delgado.proytecto {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.delgado.proytecto to javafx.fxml;
    exports com.delgado.proytecto;
}