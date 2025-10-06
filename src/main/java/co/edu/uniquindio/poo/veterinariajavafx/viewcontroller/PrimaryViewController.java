package co.edu.uniquindio.poo.veterinariajavafx.viewcontroller;


import javafx.fxml.FXML;
import javafx.scene.control.Button;


import java.net.URL;
import java.util.ResourceBundle;


public class PrimaryViewController {
    @FXML
    private ResourceBundle resources;


    App app;
    @FXML
    private URL location;


    @FXML
    private Button primaryButton;


    @FXML
    void onOpenCrudCliente() {
        app.openCrudCliente();
    }


    public void setApp(App app) {
        this.app = app;
    }


    @FXML
    void initialize() {


    }
}
