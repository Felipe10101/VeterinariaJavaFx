package co.edu.uniquindio.poo.veterinariajavafx.viewcontroller;

import co.edu.uniquindio.poo.veterinariajavafx.App;
import co.edu.uniquindio.poo.veterinariajavafx.controller.MascotaController;
import co.edu.uniquindio.poo.veterinariajavafx.model.Mascota;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;


import java.net.URL;
import java.util.ResourceBundle;

public class MascotaViewController {
    MascotaController mascotaController;
    ObservableList<Mascota> listMascotas = FXCollections.observableArrayList();
    Mascota selectedMascota;


    @FXML
    private ResourceBundle resources;


    @FXML
    private URL location;


    @FXML
    private TextField txtNombre;


    @FXML
    private Button btnLimpiar;


    @FXML
    private TableView<Mascota> tblListMascota;


    @FXML
    private Button btnEliminar;


    @FXML
    private Button btnActualizarMascota;


    @FXML
    private TableColumn<Mascota, String> tbcNombre;


    @FXML
    private TextField txtApellido;


    @FXML
    private TableColumn<Mascota, String> tbcApellido;


    @FXML
    private Button btbAgregarMascota;


    @FXML
    private TableColumn<Mascota, String> tbcId;


    @FXML
    private TextField txtId;
    private App app;


    @FXML
    void onAgregarMascota() {
        agregarMascota();
    }


    @FXML
    void onActualizarMascota() {
        actualizarMascota();
    }


    @FXML
    void onLimpiar() {
        limpiarSeleccion();
    }


    @FXML
    void onEliminar() {
        eliminarMascota();
    }


    @FXML
    void initialize() {
        this.app=app;
        mascotaController = new MascotaController(app.veterinaria);
        initView();
    }


    private void initView() {
        // Traer los datos del mascota a la tabla
        initDataBinding();


        // Obtiene la lista
        obtenerMascotas();


        // Limpiar la tabla
        tblListMascota.getItems().clear();


        // Agregar los elementos a la tabla
        tblListMascota.setItems(listMascotas);


        // Seleccionar elemento de la tabla
        listenerSelection();
    }


    private void initDataBinding() {
        tbcId.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getId()));
        tbcNombre.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getNombre()));
        tbcApellido.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getApellido()));
        // Usamos SimpleObjectProperty para manejar Double y Integer correctamente
    }


    private void obtenerMascotas() {
        listMascotas.addAll(mascotaController.obtenerListaMascotas());
    }


    private void listenerSelection() {
        tblListMascota.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            selectedMascota = newSelection;
            mostrarInformacionMascota(selectedMascota);
        });
    }


    private void mostrarInformacionMascota(Mascota mascota) {
        if (mascota != null) {
            txtId.setText(mascota.getId());
            txtNombre.setText(mascota.getNombre());
        }
    }


    private void agregarMascota() {
        Mascota mascota = buildMascota();
        if (mascotaController.crearMascota(mascota)) {
            listMascotas.add(mascota);
            limpiarCamposMascota();
        }
    }
    
    private Mascota buildMascota() {
        String id = txtId.getText();
        String nombre = txtNombre.getText();
        String raza = txtRaza.getText();
        int edadMeses = Integer.parseInt(txtEdad.getText());
        double peso = Double.parseDouble(txtPeso.getText());
        Propietario propietario = cbPropietario.getValue();

        String tipo = cbEspecie.getValue(); // ejemplo: "Perro", "Gato", "Ave", "Reptil"
        Mascota mascota = null;

        switch (tipo) {
            case "Perro":
                boolean necesidadPaseos = chkPaseo.isSelected();
                String tamanio = cbTamanio.getValue();
                int nivelAdiestramiento = Integer.parseInt(txtNivelAdiestramiento.getText());
                mascota = new Perro(id, nombre, raza, edadMeses, peso, propietario, tamanio, nivelAdiestramiento, necesidadPaseos);
                break;

            case "Gato":
                boolean esIndoor = chkIndoor.isSelected();
                double cantidadHorasSuenio = Double.parseDouble(txtHorasSueno.getText());
                int nivelIndependencia = Integer.parseInt(txtNivelIndependencia.getText());
                mascota = new Gato(id, nombre, raza, edadMeses, peso, propietario, esIndoor, cantidadHorasSuenio, nivelIndependencia);
                break;

            case "Ave":
                String tipoPlumaje = txtPlumaje.getText();
                boolean capacidadVuelo = chkVuelo.isSelected();
                int cantidadSonidos = Integer.parseInt(txtSonidos.getText());
                mascota = new Ave(id, nombre, raza, edadMeses, peso, propietario, tipoPlumaje, capacidadVuelo, cantidadSonidos);
                break;

            case "Reptil":
                String habitat = cbHabitat.getValue();
                double temperaturaOptima = Double.parseDouble(txtTemperatura.getText());
                String nivelPeligro = cbPeligrosidad.getValue();
                mascota = new Reptil(id, nombre, raza, edadMeses, peso, propietario, habitat, temperaturaOptima, nivelPeligro);
                break;
        }

        return mascota;
    }


    private void eliminarMascota() {
        if (mascotaController.eliminarMascota(txtId.getText())) {
            listMascotas.remove(selectedMascota);
            limpiarCamposMascota();
            limpiarSeleccion();
        }
    }


    private void actualizarMascota() {


        if (selectedMascota != null &&
                mascotaController.actualizarMascota(selectedMascota.getId(), buildMascota())) {


            int index = listMascotas.indexOf(selectedMascota);
            if (index >= 0) {
                listMascotas.set(index, buildMascota());
            }


            tblListMascota.refresh();
            limpiarSeleccion();
            limpiarCamposMascota();
        }
    }


    private void limpiarSeleccion() {
        tblListMascota.getSelectionModel().clearSelection();
        limpiarCamposMascota();
    }


    private void limpiarCamposMascota() {
        txtId.clear();
        txtNombre.clear();
        txtApellido.clear();
    }


    public void setApp(App app) {
        this.app = app;
    }
}
