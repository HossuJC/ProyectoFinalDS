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
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
/**
 *
 * @author cajas
 */
public class MenuCliente {
    Pane root = new Pane();
    
    Label l= new Label("MENU CLIENTE");
    
    
    Button diseñar = new Button("Diseñar Nueva Casa");
    Button diseños =new Button("Ver Diseños Anteriores");
    Button atras=new Button("Salir");
    HBox centro = new HBox();//2 columnas
    
    VBox cbs=new VBox();//, cb
    BorderPane bp = new BorderPane();
    
    public MenuCliente(){
        VBox titulos=new VBox(20);
        l.setFont(Font.font("Arial", FontWeight.NORMAL,30));
        l.setAlignment(Pos.BOTTOM_CENTER);
        titulos.getChildren().addAll(l);
        titulos.setAlignment(Pos.BOTTOM_CENTER);
       
        atras.minWidth(200);
        diseñar.minWidth(200);
        diseños.minWidth(200);
        
        VBox v= new VBox();
        v.getChildren().addAll(diseñar,diseños,atras);
	v.setPadding(new Insets(20));
	v.setSpacing(20.0);
        atras.setAlignment(Pos.BOTTOM_CENTER);
        diseñar.setAlignment(Pos.BOTTOM_CENTER);
        v.setAlignment(Pos.BOTTOM_CENTER);
       
        atras.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent ev) {
				
				Scene sc = new Scene(new main_scene().getRoot());
				
				changeatras(ev,sc);
				
			}
			
	});
        diseñar.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent ev) {
				
				Scene sc = new Scene(new vista_diseno_casa().getRoot(),600,600);
				
				changeatras(ev,sc);
				
			}
			
	});
        diseños.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent ev) {
				//no implementado
				Scene sc = new Scene(new Cliente_Diseños().getRoot(),600,600);
				
				changeatras(ev,sc);
				
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

    public Label getL() {
        return l;
    }

    public Button getDiseñar() {
        return diseñar;
    }

    public Button getDiseños() {
        return diseños;
    }

    public Button getAtras() {
        return atras;
    }

    public HBox getCentro() {
        return centro;
    }

    public VBox getCbs() {
        return cbs;
    }

    public BorderPane getBp() {
        return bp;
    }
    
}
