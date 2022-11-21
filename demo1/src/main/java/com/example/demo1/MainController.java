package com.example.demo1;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MainController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button vxod;

    @FXML
    protected void RegClick() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("tabl_book.fxml"));
        Stage wind = (Stage) vxod.getScene().getWindow();
        wind.setScene(new Scene(root));
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
    private Button Avtor;
    @FXML
    protected void Clik_Avtor() throws IOException{
        Parent root1 = FXMLLoader.load(getClass().getResource("table_avtor"));
        Stage wind1 = (Stage) Avtor.getScene().getWindow();
        wind1.setScene(new Scene(root1));}

    @FXML
    private Button Book;
    @FXML
    protected void Clik_Book() throws IOException{
        Parent root1 = FXMLLoader.load(getClass().getResource("table_book"));
        Stage wind1 = (Stage) Book.getScene().getWindow();
        wind1.setScene(new Scene(root1));}

    @FXML
    private Button Client;
    @FXML
    protected void Clik_Client() throws IOException{
        Parent root1 = FXMLLoader.load(getClass().getResource("table_book"));
        Stage wind1 = (Stage) Client.getScene().getWindow();
        wind1.setScene(new Scene(root1));}

    @FXML
    private Button Ganre;
    @FXML
    protected void Clik_Ganre() throws IOException{
        Parent root1 = FXMLLoader.load(getClass().getResource("table_book"));
        Stage wind1 = (Stage) Ganre.getScene().getWindow();
        wind1.setScene(new Scene(root1));}

    @FXML
    private Button Orders;
    @FXML
    protected void Clik_Orders() throws IOException{
        Parent root1 = FXMLLoader.load(getClass().getResource("table_book"));
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
    }}
