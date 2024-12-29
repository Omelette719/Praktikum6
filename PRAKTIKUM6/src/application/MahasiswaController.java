package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class MahasiswaController {
    @FXML
    private TableView<Mahasiswa> tableView;
    @FXML
    private TableColumn<Mahasiswa, String> nimColumn;
    @FXML
    private TableColumn<Mahasiswa, String> namaColumn;

    public void initialize() {
        nimColumn.setCellValueFactory(new PropertyValueFactory<>("nim"));
        namaColumn.setCellValueFactory(new PropertyValueFactory<>("nama"));

        tableView.setItems(getMahasiswaData());
    }

    private ObservableList<Mahasiswa> getMahasiswaData() {
        return FXCollections.observableArrayList(
            new Mahasiswa(1, "Azwin", "2310817310012"),
            new Mahasiswa(2, "Burhan", "1237999277636"),
            new Mahasiswa(3, "Karina", "12412374266518"),
            new Mahasiswa(4, "Agus", "1242545772662"),
            new Mahasiswa(5, "Budiman", "11223344556677"),
            new Mahasiswa(6, "Anis", "224466778899"),
            new Mahasiswa(7, "Toriq", "334455667788"),
            new Mahasiswa(8, "Dewi", "445566778899"),
            new Mahasiswa(9, "Eko", "556677881199"),
            new Mahasiswa(10, "Fahri", "667788224433")
        );
    }
}

