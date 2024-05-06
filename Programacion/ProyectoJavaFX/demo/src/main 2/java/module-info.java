module escartii {
    requires javafx.controls;
    requires javafx.fxml;

    opens escartii to javafx.fxml;
    exports escartii;
}
