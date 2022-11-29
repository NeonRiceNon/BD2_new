package com.example.demo1;

import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.TableView;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.util.Callback;

public class MainController {
    Stage mainwindow;
    static private ObservableList<Object> data;
    static private String name;

    //ДОБАВЛЕНИЕ
    @FXML
    public void showDialogAvtor(ActionEvent actionEvent) {
        try {
            Stage dialog = new Stage();
            dialog.initOwner(mainwindow);
            dialog.initModality(Modality.APPLICATION_MODAL);
            Parent root = FXMLLoader.load(getClass().getResource("win_dob_avtor.fxml"));
            dialog.setScene(new Scene(root));
            dialog.showAndWait();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @FXML
    public void showDialogBook(ActionEvent actionEvent) {
        try {
            Stage dialog = new Stage();
            dialog.initOwner(mainwindow);
            dialog.initModality(Modality.APPLICATION_MODAL);
            Parent root = FXMLLoader.load(getClass().getResource("win_dob_book.fxml"));
            dialog.setScene(new Scene(root));
            dialog.showAndWait();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @FXML
    public void showDialogCli(ActionEvent actionEvent) {
        try {
            Stage dialog = new Stage();
            dialog.initOwner(mainwindow);
            dialog.initModality(Modality.APPLICATION_MODAL);
            Parent root = FXMLLoader.load(getClass().getResource("win_dob_cli.fxml"));
            dialog.setScene(new Scene(root));
            dialog.showAndWait();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @FXML
    public void showDialogGan(ActionEvent actionEvent) {
        try {
            Stage dialog = new Stage();
            dialog.initOwner(mainwindow);
            dialog.initModality(Modality.APPLICATION_MODAL);
            Parent root = FXMLLoader.load(getClass().getResource("win_dob_gan.fxml"));
            dialog.setScene(new Scene(root));
            dialog.showAndWait();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @FXML
    public void showDialogOr(ActionEvent actionEvent) {
        try {
            Stage dialog = new Stage();
            dialog.initOwner(mainwindow);
            dialog.initModality(Modality.APPLICATION_MODAL);
            Parent root = FXMLLoader.load(getClass().getResource("win_dob_or.fxml"));
            dialog.setScene(new Scene(root));
            dialog.showAndWait();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    //ИЗМЕНЕНИЕ
    @FXML
    public void IzmenDialogBook(ActionEvent actionEvent) {
        try {
            Stage dialog = new Stage();
            dialog.initOwner(mainwindow);
            dialog.initModality(Modality.APPLICATION_MODAL);
            Parent root = FXMLLoader.load(getClass().getResource("win_izmen_book.fxml"));
            dialog.setScene(new Scene(root));
            dialog.showAndWait();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @FXML
    public void IzmenDialogCli(ActionEvent actionEvent) {
        try {
            Stage dialog = new Stage();
            dialog.initOwner(mainwindow);
            dialog.initModality(Modality.APPLICATION_MODAL);
            Parent root = FXMLLoader.load(getClass().getResource("win_izmen_cli.fxml"));
            dialog.setScene(new Scene(root));
            dialog.showAndWait();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @FXML
    public void IzmenDialogAv(ActionEvent actionEvent) {
        try {
            Stage dialog = new Stage();
            dialog.initOwner(mainwindow);
            dialog.initModality(Modality.APPLICATION_MODAL);
            Parent root = FXMLLoader.load(getClass().getResource("win_izmen_avtor.fxml"));
            dialog.setScene(new Scene(root));
            dialog.showAndWait();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @FXML
    public void IzmenDialogGan(ActionEvent actionEvent) {
        try {
            Stage dialog = new Stage();
            dialog.initOwner(mainwindow);
            dialog.initModality(Modality.APPLICATION_MODAL);
            Parent root = FXMLLoader.load(getClass().getResource("win_izmen_gan.fxml"));
            dialog.setScene(new Scene(root));
            dialog.showAndWait();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @FXML
    public void IzmenDialogOr(ActionEvent actionEvent) {
        try {
            Stage dialog = new Stage();
            dialog.initOwner(mainwindow);
            dialog.initModality(Modality.APPLICATION_MODAL);
            Parent root = FXMLLoader.load(getClass().getResource("win_izmen_or.fxml"));
            dialog.setScene(new Scene(root));
            dialog.showAndWait();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    //УДАЛИТЬ
    @FXML
    public void DeleteDialog(ActionEvent actionEvent) {
        try {
            Stage dialog = new Stage();
            dialog.initOwner(mainwindow);
            dialog.initModality(Modality.APPLICATION_MODAL);
            Parent root = FXMLLoader.load(getClass().getResource("win_del.fxml"));
            dialog.setScene(new Scene(root));
            dialog.showAndWait();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @FXML
    private ResourceBundle resources;
    @FXML
    private URL location;
    @FXML
    private Button dobavit;

    @FXML
    private Button vxod;
    /*@FXML
    private TextField login_text;
    @FXML
    private TextField pass_text;
    @FXML
    private Label err;*/

    @FXML
    protected void RegClick() throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("def_form.fxml"));
        mainwindow = (Stage) vxod.getScene().getWindow();
        mainwindow.setScene(new Scene(root));

    }
        /*mainwindow = (Stage) vxod.getScene().getWindow();
        mainwindow.setScene(new Scene(root));*/

    @FXML
    private Button CreatAkk;

    @FXML
    protected void Butt_CreatAkk() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("reg_form.fxml"));
        Stage wind = (Stage) CreatAkk.getScene().getWindow();
        wind.setScene(new Scene(root));
    }

    @FXML
    private Button naz;

    @FXML
    protected void Butt_Naz() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("def_form.fxml"));
        Stage wind = (Stage) naz.getScene().getWindow();
        wind.setScene(new Scene(root));
    }

    @FXML
    private Button Avtor;

    @FXML
    protected void Clik_Avtor() throws IOException {
        MainController.name = "Авторы";
        MainController.data = FXCollections.observableArrayList();
        Parent root1 = FXMLLoader.load(getClass().getResource("tabl_av.fxml"));
        mainwindow = (Stage) Avtor.getScene().getWindow();
        mainwindow.setScene(new Scene(root1));
    }

    @FXML
    private Button Book;

    @FXML
    protected void Clik_Book() throws IOException {
        MainController.name = "Книги";
        MainController.data = FXCollections.observableArrayList();
        Parent root1 = FXMLLoader.load(getClass().getResource("tabl_book.fxml"));
        mainwindow = (Stage) Book.getScene().getWindow();
        mainwindow.setScene(new Scene(root1));
    }

    @FXML
    private Button Client;

    @FXML
    protected void Clik_Client() throws IOException {
        MainController.name = "Клиенты";
        MainController.data = FXCollections.observableArrayList();
        Parent root1 = FXMLLoader.load(getClass().getResource("tabl_cli.fxml"));
        mainwindow = (Stage) Client.getScene().getWindow();
        mainwindow.setScene(new Scene(root1));
    }

    @FXML
    private Button Ganre;

    @FXML
    protected void Clik_Ganre() throws IOException {
        MainController.name = "Жанры";
        MainController.data = FXCollections.observableArrayList();
        Parent root1 = FXMLLoader.load(getClass().getResource("tabl_gan.fxml"));
        mainwindow = (Stage) Ganre.getScene().getWindow();
        mainwindow.setScene(new Scene(root1));
    }

    @FXML
    private Button Orders;

    @FXML
    protected void Clik_Orders() throws IOException {
        MainController.name = "Заказы";
        MainController.data = FXCollections.observableArrayList();
        Parent root1 = FXMLLoader.load(getClass().getResource("tabl_or.fxml"));
        mainwindow = (Stage) Orders.getScene().getWindow();
        mainwindow.setScene(new Scene(root1));
    }

    @FXML
    private TableView tabl_avt;
    @FXML
    private TableView tabl_book;
    @FXML
    private TableView tabl_cli;
    @FXML
    private TableView tabl_gan;
    @FXML
    private TableView tabl_or;
    @FXML
    protected void initialize() {
        if (MainController.name == "Авторы") {
            try {
                Connect con = new Connect();
                con.Connect();
                ResultSet rs = con.gettable("SELECT * FROM public.\"Author\";");

                for (int i = 0; i < rs.getMetaData().getColumnCount(); i++) {
                    //We are using non property style for making dynamic table
                    final int j = i;
                    TableColumn col = new TableColumn(rs.getMetaData().getColumnName(i + 1));
                    col.setCellValueFactory(new Callback<CellDataFeatures<ObservableList, String>, ObservableValue<String>>() {
                        public ObservableValue<String> call(CellDataFeatures<ObservableList, String> param) {
                            return new SimpleStringProperty(param.getValue().get(j).toString());
                        }
                    });
                    tabl_avt.getColumns().addAll(col);
                }

                while (rs.next()) {
                    ObservableList<String> row = FXCollections.observableArrayList();
                    for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
                        row.add(rs.getString(i));
                    }
                    MainController.data.add(row);
                }
                tabl_avt.setItems(MainController.data);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (MainController.name == "Книги") {
            try {
                Connect con = new Connect();
                con.Connect();
                ResultSet rs = con.gettable("SELECT * FROM public.\"Books\";");

                for (int i = 0; i < rs.getMetaData().getColumnCount(); i++) {
                    //We are using non property style for making dynamic table
                    final int j = i;
                    TableColumn col = new TableColumn(rs.getMetaData().getColumnName(i + 1));
                    col.setCellValueFactory(new Callback<CellDataFeatures<ObservableList, String>, ObservableValue<String>>() {
                        public ObservableValue<String> call(CellDataFeatures<ObservableList, String> param) {
                            return new SimpleStringProperty(param.getValue().get(j).toString());
                        }
                    });
                    tabl_book.getColumns().addAll(col);
                }

                while (rs.next()) {
                    ObservableList<String> row = FXCollections.observableArrayList();
                    for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
                        row.add(rs.getString(i));
                    }
                    MainController.data.add(row);
                }
                tabl_book.setItems(MainController.data);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        if (MainController.name == "Клиенты") {
            try {
                Connect con = new Connect();
                con.Connect();
                ResultSet rs = con.gettable("SELECT * FROM public.\"Client\";");

                for (int i = 0; i < rs.getMetaData().getColumnCount(); i++) {
                    //We are using non property style for making dynamic table
                    final int j = i;
                    TableColumn col = new TableColumn(rs.getMetaData().getColumnName(i + 1));
                    col.setCellValueFactory(new Callback<CellDataFeatures<ObservableList, String>, ObservableValue<String>>() {
                        public ObservableValue<String> call(CellDataFeatures<ObservableList, String> param) {
                            return new SimpleStringProperty(param.getValue().get(j).toString());
                        }
                    });
                    tabl_cli.getColumns().addAll(col);
                }
                while (rs.next()) {
                    ObservableList<String> row = FXCollections.observableArrayList();
                    for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
                        row.add(rs.getString(i));
                    }
                    MainController.data.add(row);
                }
                tabl_cli.setItems(MainController.data);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (MainController.name == "Жанры") {
            try {
                Connect con = new Connect();
                con.Connect();
                ResultSet rs = con.gettable("SELECT * FROM public.\"Genre\";");

                for (int i = 0; i < rs.getMetaData().getColumnCount(); i++) {
                    //We are using non property style for making dynamic table
                    final int j = i;
                    TableColumn col = new TableColumn(rs.getMetaData().getColumnName(i + 1));
                    col.setCellValueFactory(new Callback<CellDataFeatures<ObservableList, String>, ObservableValue<String>>() {
                        public ObservableValue<String> call(CellDataFeatures<ObservableList, String> param) {
                            return new SimpleStringProperty(param.getValue().get(j).toString());
                        }
                    });
                    tabl_gan.getColumns().addAll(col);
                }
                while (rs.next()) {
                    ObservableList<String> row = FXCollections.observableArrayList();
                    for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
                        row.add(rs.getString(i));
                    }
                    MainController.data.add(row);
                }
                tabl_gan.setItems(MainController.data);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (MainController.name == "Заказы") {
            try {
                Connect con = new Connect();
                con.Connect();
                ResultSet rs = con.gettable("SELECT * FROM public.\"Orders\";");

                for (int i = 0; i < rs.getMetaData().getColumnCount(); i++) {
                    //We are using non property style for making dynamic table
                    final int j = i;
                    TableColumn col = new TableColumn(rs.getMetaData().getColumnName(i + 1));
                    col.setCellValueFactory(new Callback<CellDataFeatures<ObservableList, String>, ObservableValue<String>>() {
                        public ObservableValue<String> call(CellDataFeatures<ObservableList, String> param) {
                            return new SimpleStringProperty(param.getValue().get(j).toString());
                        }
                    });
                    tabl_or.getColumns().addAll(col);
                }
                while (rs.next()) {
                    ObservableList<String> row = FXCollections.observableArrayList();
                    for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
                        row.add(rs.getString(i));
                    }
                    MainController.data.add(row);
                }
                tabl_or.setItems(MainController.data);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }




        public void setAvtor (Button avtor){
            Avtor = avtor;
        }
        public void setClient (Button client){
            Client = client;
        }
        public void setBook (Button book){
            Book = book;
        }
        public void setGanre (Button ganre){
            Ganre = ganre;
        }
        public void setOrders (Button orders){
            Orders = orders;
        }
        public void setNaz (Button naz){
            this.naz = naz;
        }
    }



