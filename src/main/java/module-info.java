module co.edu.uniquindio.poo.veterinariajavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.poo.veterinariajavafx to javafx.fxml;
    exports co.edu.uniquindio.poo.veterinariajavafx;
}