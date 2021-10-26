module com.slavamashkov.javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.slavamashkov.javafx to javafx.fxml;
    exports com.slavamashkov.javafx;
}