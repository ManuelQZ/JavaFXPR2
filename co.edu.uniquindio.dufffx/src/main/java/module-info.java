module co.edu.uniquindio.duff.duffbeer {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.duff.duffbeer to javafx.fxml;
    exports co.edu.uniquindio.duff.duffbeer;
}