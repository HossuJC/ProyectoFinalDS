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
public class MenuAdministrador {
    Pane root = new Pane();
    
    Label l= new Label("MENU ADMINISTRADOR");
    //tabla de clientes
    
    Button empleados = new Button("CRUD Empleados");
    Button clientes =new Button("CRUD Clientes");
    Button atras=new Button("Salir");
    HBox centro = new HBox();//2 columnas
    
    VBox cbs=new VBox();//, cb
    BorderPane bp = new BorderPane();
    
    public MenuAdministrador(){
        VBox titulos=new VBox(20);
        l.setFont(Font.font("Arial", FontWeight.NORMAL,30));
        l.setAlignment(Pos.BOTTOM_CENTER);
        titulos.getChildren().addAll(l);
        titulos.setAlignment(Pos.BOTTOM_CENTER);
       
        atras.minWidth(200);
        empleados.minWidth(200);
        clientes.minWidth(200);
        
        VBox v= new VBox();
        v.getChildren().addAll(empleados,clientes,atras);
	v.setPadding(new Insets(20));
	v.setSpacing(20.0);
        atras.setAlignment(Pos.BOTTOM_CENTER);
        empleados.setAlignment(Pos.BOTTOM_CENTER);
        v.setAlignment(Pos.BOTTOM_CENTER);
       
        atras.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent ev) {
				
				Scene sc = new Scene(new main_scene().getRoot());
				
				changeatras(ev,sc);
				
			}
			
	});
        empleados.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent ev) {
				//CRUD empleados
				Scene sc = new Scene(new vista_diseno_casa().getRoot(),600,600);
				
				changeatras(ev,sc);
				
			}
			
	});
        clientes.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent ev) {
				// CUD CLIENTES
				Scene sc = new Scene(new CRUD_Cliente().getRoot(),600,600);
				
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
    
}
