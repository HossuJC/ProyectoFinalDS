/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.views;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/**
 *
 * @author cajas
 */
public class Cliente_Diseños {//Falta implementar tabla con reportes del cliente logeado
    Pane root = new Pane();
    
    Label l= new Label("Diseños Previos");
    
    Button Enviar = new Button("Enviar Reporte ");
    Button atras = new Button("atras");
    
    HBox centro = new HBox();//2 columnas
    
    VBox cbs=new VBox();//, cb
    BorderPane bp = new BorderPane();
    public Cliente_Diseños(){
        VBox titulos=new VBox(20);
        l.setFont(Font.font("Arial", FontWeight.NORMAL,30));
        l.setAlignment(Pos.BOTTOM_CENTER);
        titulos.getChildren().addAll(l);
        titulos.setAlignment(Pos.BOTTOM_CENTER);
       
        atras.minWidth(200);
        Enviar.minWidth(200);
        VBox v= new VBox();
        v.getChildren().addAll(Enviar,atras);
	v.setPadding(new Insets(20));
	v.setSpacing(20.0);
        atras.setAlignment(Pos.BOTTOM_CENTER);
        Enviar.setAlignment(Pos.BOTTOM_CENTER);
        v.setAlignment(Pos.BOTTOM_CENTER);
        
       atras.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent ev) {
				
				Scene sc = new Scene(new MenuCliente().getRoot(),600,600);
				
				changeatras(ev,sc);
				
			}
			
	});
       Enviar.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent ev) {
				//Envia el reporte selecionado en la tabla
				//Scene sc = new Scene(new MenuCliente().getRoot(),600,600);
				
				//changeatras(ev,sc);
				
			}
			
	});
        
        
       
        centro.getChildren().addAll(v);
        
        bp.setTop(titulos);
        bp.setCenter(centro);
        //bp.setRight(v);
        
        root.getChildren().add(bp);
    }
    static void changeatras(Event e, Scene sc) {
		Stage window =(Stage)((Node) e.getSource()).getScene().getWindow();
		window.setScene(sc);
	}

    public Pane getRoot() {
        return root;
    }

    public void setRoot(Pane root) {
        this.root = root;
    }

    public Label getL() {
        return l;
    }

    public void setL(Label l) {
        this.l = l;
    }

    public Button getEnviar() {
        return Enviar;
    }

    public void setEnviar(Button Enviar) {
        this.Enviar = Enviar;
    }

    public Button getAtras() {
        return atras;
    }

    public void setAtras(Button atras) {
        this.atras = atras;
    }

    public HBox getCentro() {
        return centro;
    }

    public void setCentro(HBox centro) {
        this.centro = centro;
    }

    public VBox getCbs() {
        return cbs;
    }

    public void setCbs(VBox cbs) {
        this.cbs = cbs;
    }

    public BorderPane getBp() {
        return bp;
    }

    public void setBp(BorderPane bp) {
        this.bp = bp;
    }
    
}
