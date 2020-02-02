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
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
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
public class CRUD_Cliente {
    Pane root = new Pane();
    
    Label l= new Label("CRUD Cliente");
    //tabla de clientes
    
    Button agregar = new Button("Agregar");
    Button modificar =new Button("Modificar");
    Button buscar=new Button("Buscar por Cedula");
    Button atras=new Button("Salir");
    HBox centro = new HBox();//2 columnas
    
    VBox tabla=new VBox();//tabla en este panel
    VBox labels=new VBox(13);
    VBox areas=new VBox(5);
    HBox centro1=new HBox(10);
    BorderPane bp = new BorderPane();
    
    public CRUD_Cliente(){
        VBox titulos=new VBox(20);
        l.setFont(Font.font("Arial", FontWeight.NORMAL,30));
        l.setAlignment(Pos.BOTTOM_CENTER);
        titulos.getChildren().addAll(l);
        titulos.setAlignment(Pos.BOTTOM_CENTER);
       
        atras.minWidth(200);
        agregar.minWidth(200);
        modificar.minWidth(200);
        
        VBox v= new VBox();
        v.getChildren().addAll(agregar,modificar,atras);
	v.setPadding(new Insets(20));
	v.setSpacing(20.0);
        atras.setAlignment(Pos.BOTTOM_CENTER);
        agregar.setAlignment(Pos.BOTTOM_CENTER);
        v.setAlignment(Pos.BOTTOM_CENTER);
       
        //Centro
        Label l1=new Label("Nombre:");
        Label l2=new Label("Apellido:");
        Label l3=new Label("Cedula:");
        Label l4=new Label("Pasaporte:");
        Label l5=new Label("Correo:");
        Label l6=new Label("Direccion:");
        Label l7=new Label("Empresa: ");
        Label l8=new Label("Teleefono:");
        Label l9=new Label("Estado civil: ");
        Label l10=new Label("Cargo: ");
        Label l11=new Label("Numero hijos: ");
        labels.getChildren().addAll(l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11);
        
        TextField nombre=new TextField();
        TextField apellido=new TextField();
        TextField cedula=new TextField();
        TextField pasaporte=new TextField();
        TextField correo=new TextField();
        TextField direccion=new TextField();
        TextField empresa=new TextField();
        TextField telefono=new TextField();
        TextField estado=new TextField();
        TextField cargo=new TextField();
        TextField hijos=new TextField();
        
        areas.getChildren().addAll(nombre,apellido,cedula,pasaporte,correo,direccion,empresa,telefono,estado,cargo,hijos);
        
        
        centro1.getChildren().addAll(tabla,labels,areas);
        //
        atras.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent ev) {
				
				Scene sc = new Scene(new MenuAdministrador().getRoot());
				
				changeatras(ev,sc);
				
			}
			
	});
        agregar.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent ev) {
				//toma los valores de los textArea y los guarda en la base
				//Scene sc = new Scene(new vista_diseno_casa().getRoot(),600,600);
				
				//changeatras(ev,sc);
				
			}
			
	});
        modificar.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent ev) {
                            //Toma los valores de los textAArea, actualiza la tabla y la base de datos
				//Scene sc = new Scene(new Cliente_Diseños().getRoot(),600,600);
				
				//changeatras(ev,sc);
				
			}
			
	});
        buscar.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent ev) {
                            //Toma los valores del text Area, hace la busqueda por query actualiza la tabla
				//Scene sc = new Scene(new Cliente_Diseños().getRoot(),600,600);
				
				//changeatras(ev,sc);
				
			}
			
	});
        TextField busqueda=new TextField();
        busqueda.setAlignment(Pos.CENTER);
        busqueda.setMaxWidth(200);
        HBox hbb=new HBox(10);
        hbb.getChildren().addAll(busqueda,buscar);
        hbb.setAlignment(Pos.CENTER);
        centro.getChildren().addAll(v);
        
        bp.setTop(titulos);
        bp.setRight(centro);
        bp.setCenter(centro1);
        bp.setBottom(hbb);
        
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

    public Button getAgregar() {
        return agregar;
    }

    public void setAgregar(Button agregar) {
        this.agregar = agregar;
    }

    public Button getModificar() {
        return modificar;
    }

    public void setModificar(Button modificar) {
        this.modificar = modificar;
    }

    public Button getBuscar() {
        return buscar;
    }

    public void setBuscar(Button buscar) {
        this.buscar = buscar;
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

    public VBox getTabla() {
        return tabla;
    }

    public void setTabla(VBox tabla) {
        this.tabla = tabla;
    }

    public VBox getLabels() {
        return labels;
    }

    public void setLabels(VBox labels) {
        this.labels = labels;
    }

    public VBox getAreas() {
        return areas;
    }

    public void setAreas(VBox areas) {
        this.areas = areas;
    }

    public HBox getCentro1() {
        return centro1;
    }

    public void setCentro1(HBox centro1) {
        this.centro1 = centro1;
    }

    public BorderPane getBp() {
        return bp;
    }

    public void setBp(BorderPane bp) {
        this.bp = bp;
    }
    
    
}
