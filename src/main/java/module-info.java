module co.edu.uniquindio.poo.veterinariajavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.poo.veterinariajavafx to javafx.fxml;
    exports co.edu.uniquindio.poo.veterinariajavafx;


    exports co.edu.uniquindio.poo.veterinariajavafx.viewcontroller;
    opens co.edu.uniquindio.poo.veterinariajavafx.viewcontroller to javafx.fxml;

    exports co.edu.uniquindio.poo.veterinariajavafx.model;
    opens co.edu.uniquindio.poo.veterinariajavafx.model to javafx.fxml;

    exports co.edu.uniquindio.poo.veterinariajavafx.controller;
    opens co.edu.uniquindio.poo.veterinariajavafx.controller to javafx.fxml;



    


}