package is.vidmot;

import Vinnsla.Reiknivel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.TextField;


public class ReiknivelController {

    private Reiknivel reiknivel;
    @FXML
    public void initialize(){
        reiknivel = new Reiknivel();
    }
    @FXML
    private TextField fxUttak;

    public void inntakTalaActionPerformed(ActionEvent actionEvent) {
        int tala = Integer.parseInt(((Node)actionEvent.getSource()).getId());
        fxUttak.setText(String.valueOf(reiknivel.setTala(tala)));
    }
    public void hreinsaHandler(ActionEvent actionEvent){
        reiknivel.hreinsa();
        fxUttak.setText("");
    }
    public void jafntogHandler(ActionEvent actionEvent){
        fxUttak.setText(reiknivel.jafntOg());
    }
    public void virkiHandler(ActionEvent actionEvent){
        reiknivel.setVirki(Integer.parseInt(((Node)actionEvent.getSource()).getId()));
    }
}