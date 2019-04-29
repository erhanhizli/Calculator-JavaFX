package sample;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import java.awt.font.TextLayout;
import javafx.event.ActionEvent;



public class Controller{

    @FXML
    Button clear=new Button();
    @FXML
    Button artıeksi=new Button();
    @FXML
    Button yuzde=new Button();
    @FXML
    Button bol=new Button();
    @FXML
    Button yedi=new Button();
    @FXML
    Button sekiz=new Button();
    @FXML
    Button dokuz=new Button();
    @FXML
    Button carp=new Button();
    @FXML
    Button dort=new Button();
    @FXML
    Button bes=new Button();
    @FXML
    Button alti=new Button();
    @FXML
    Button cikar=new Button();
    @FXML
    Button bir=new Button("1");
    @FXML
    Button iki=new Button();
    @FXML
    Button uc=new Button();
    @FXML
    Button topla=new Button();
    @FXML
    Button esittir=new Button();
    @FXML
    Button nokta=new Button();
    @FXML
    Button sıfır=new Button();
    @FXML
    TextField txtfield=new TextField();
    double x,y,opMod,result;
    static StringBuilder sb=new StringBuilder();

    public void biryaz(ActionEvent event){
        txtfield.setText(txtfield.getText()+"1");
    }
    public void ikiyaz(ActionEvent event){
        txtfield.setText(txtfield.getText()+"2");
    }
    public void ucyaz(ActionEvent event){
        txtfield.setText(txtfield.getText()+"3");
    }
    public void dortyaz(ActionEvent event){
        txtfield.setText(txtfield.getText()+"4");
    }
    public void besyaz(ActionEvent event){
        txtfield.setText(txtfield.getText()+"5");
    }
    public void altiyaz(ActionEvent event){
        txtfield.setText(txtfield.getText()+"6");
    }
    public void yediyaz(ActionEvent event){
        txtfield.setText(txtfield.getText()+"7");
    }
    public void sekizyaz(ActionEvent event){
        txtfield.setText(txtfield.getText()+"8");
    }
    public void dokuzyaz(ActionEvent event){
        txtfield.setText(txtfield.getText()+"9");
    }
    public void sıfıryaz(ActionEvent event){
        txtfield.setText(txtfield.getText()+"0");
    }
    public void btnclear(ActionEvent event) {
        txtfield.clear();
        nokta.setDisable(false);
    }



    public void btntopla(ActionEvent event){
        x=Double.valueOf(txtfield.getText());
        txtfield.clear();
        opMod=1;
        nokta.setDisable(false);
    }
    public void btncikar(ActionEvent event){
        x=Double.valueOf(txtfield.getText());
        txtfield.clear();
        opMod=2;

        nokta.setDisable(false);
    }
    public void btncarp(ActionEvent event){
        x=Double.valueOf(txtfield.getText());
        txtfield.clear();
        opMod=3;

        nokta.setDisable(false);
    }
    public void btnbol(ActionEvent event){
        x=Double.valueOf(txtfield.getText());
        txtfield.clear();
        opMod=4;
        nokta.setDisable(false);
    }
    public void btnyuzde(ActionEvent event){
        x=Double.valueOf(txtfield.getText());
        txtfield.clear();
        opMod=5;
        nokta.setDisable(false);
    }


    public void btnisaret(ActionEvent event) {

        int a=-1;
        int savedValue = Integer.parseInt(txtfield.getText());
        int r=savedValue*a;

        String str= String.valueOf(r);

        txtfield.setText(str);
    }

    public void btnvirgul(ActionEvent event){
        txtfield.setText(txtfield.getText()+".");
        nokta.setDisable(true);
    }

    public void btnequal(ActionEvent event){
        y=Double.valueOf(txtfield.getText());
        if(opMod==1)
        {
            result=x+y;
        }
        else if(opMod==2)
        {
            result=x-y;
        }
        else if(opMod==3)
        {
            result=x*y;
        }
        else if(opMod==4)
        {
            result=x/y;
        }
        else if(opMod==5)
        {
            result=x*y/100;
        }

        String strresult=String.valueOf(result);
        txtfield.setText(strresult);

        nokta.setDisable(false);
    }

}
