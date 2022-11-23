package com.example.demo1;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class MainController {
    Stage mainwindow;
    @FXML
    public void showDialog(ActionEvent actionEvent) {
        try {
            Stage dialog = new Stage();
            dialog.initOwner(mainwindow);
            dialog.initModality(Modality.APPLICATION_MODAL);
            Parent root = FXMLLoader.load(getClass().getResource("win_dob.fxml"));
            dialog.setScene(new Scene(root));
            dialog.showAndWait();

        }
        catch (Exception e){
            System.out.println(e);
        }}

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button dobavit;
    @FXML
    protected void Butt_dob() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("win_dob.fxml"));
        Stage wind = (Stage) dobavit.getScene().getWindow();
        wind.setScene(new Scene(root));
    }
    @FXML
    private Button vxod;

    @FXML
    protected void RegClick() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("def_form.fxml"));
        mainwindow = (Stage) vxod.getScene().getWindow();
        mainwindow.setScene(new Scene(root));
    }

    @FXML
    private Button CreatAkk;

    @FXML
    protected void Butt_CreatAkk() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("reg_form.fxml"));
        Stage wind = (Stage) CreatAkk.getScene().getWindow();
        wind.setScene(new Scene(root));
    }

    @FXML
    private Button naz;
    @FXML
    protected void Butt_Naz() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("def_form.fxml"));
        Stage wind = (Stage) naz.getScene().getWindow();
        wind.setScene(new Scene(root));
    }

    @FXML
    private Button Avtor;
    @FXML
    protected void Clik_Avtor() throws IOException{
        Parent root1 = FXMLLoader.load(getClass().getResource("tabl_av.fxml"));
        mainwindow = (Stage) Avtor.getScene().getWindow();
        mainwindow.setScene(new Scene(root1));}

    @FXML
    private Button Book;
    @FXML
    protected void Clik_Book() throws IOException{
        Parent root1 = FXMLLoader.load(getClass().getResource("tabl_book.fxml"));
        Stage wind1 = (Stage) Book.getScene().getWindow();
        wind1.setScene(new Scene(root1));}

    @FXML
    private Button Client;
    @FXML
    protected void Clik_Client() throws IOException{
        Parent root1 = FXMLLoader.load(getClass().getResource("tabl_cli.fxml"));
        Stage wind1 = (Stage) Client.getScene().getWindow();
        wind1.setScene(new Scene(root1));}

    @FXML
    private Button Ganre;
    @FXML
    protected void Clik_Ganre() throws IOException{
        Parent root1 = FXMLLoader.load(getClass().getResource("tabl_gan.fxml"));
        Stage wind1 = (Stage) Ganre.getScene().getWindow();
        wind1.setScene(new Scene(root1));}

    @FXML
    private Button Orders;
    @FXML
    protected void Clik_Orders() throws IOException{
        Parent root1 = FXMLLoader.load(getClass().getResource("tabl_or.fxml"));
        Stage wind1 = (Stage) Orders.getScene().getWindow();
        wind1.setScene(new Scene(root1));}



    public void setAvtor(Button avtor) {
        Avtor = avtor;
    }

    public void setClient(Button client) {
        Client = client;
    }

    public void setBook(Button book) {
        Book = book;
    }

    public void setGanre(Button ganre) {
        Ganre = ganre;
    }

    public void setOrders(Button orders) {
        Orders = orders;
    }

    public void setNaz(Button naz) {
        this.naz = naz;
    }


    }

