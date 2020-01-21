/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.views;

import java.util.ArrayList;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

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
import static proyecto.views.vista_diseño_casa.changeatras;

/**
 *
 * @author cajas
 */
public class vista_caracteristicas_casa {
    Pane root = new Pane();
    
    Label l= new Label("SELECCION DE ACABADOS");
    Label casabase;
    
    Label l1= new Label("Tipo de piso: ");
    Label l2=new Label("Griferia: ");
    Label l3= new Label("Iluminación: ");
    Label l4=new Label("Baños Insonorizados: ");
    Label l5= new Label("Aislante termico: ");
    
    ComboBox piso;
    ComboBox griferia;
    ComboBox iluminacion;
    ComboBox baños;//booleanos
    ComboBox aislamiento;//booleanos
           
    
   
    Button atras = new Button("Atras");
    Button guardar=new Button("Guardar");
    HBox centro = new HBox();//2 columnas
    VBox labels = new VBox();//labels
    VBox cbs=new VBox();//, cb
    BorderPane bp = new BorderPane();

    public vista_caracteristicas_casa(String casa_base) {
        
        VBox titulos=new VBox(20);
        l.setFont(Font.font("Arial", FontWeight.NORMAL,30));
        this.casabase=new Label(casa_base);
        casabase.setFont(Font.font("Arial", FontWeight.NORMAL,25));
        titulos.getChildren().addAll(l,casabase);

        ObservableList<String> boleanos = FXCollections.observableArrayList();
        boleanos.addAll("Sí","No");
        
        this.baños=new ComboBox(boleanos);
        baños.setMinWidth(200);
        this.aislamiento=new ComboBox(boleanos);
        aislamiento.setMinWidth(200);
        
        ObservableList<String> pisos = FXCollections.observableArrayList();
        pisos.addAll("Importado","Nacional");
        this.piso=new ComboBox(pisos);
        piso.setMinWidth(200);
        this.griferia=new ComboBox(pisos);
        griferia.setMinWidth(200);
        
        ObservableList<String> luces = FXCollections.observableArrayList();
        luces.addAll("Iluminación LED", "Iluminación Tradicional");
        this.iluminacion=new ComboBox(luces);
        iluminacion.setMinWidth(200);
        
        atras.minWidth(100);
        guardar.minWidth(100);
        VBox v= new VBox();
        v.getChildren().addAll(atras,guardar);
	v.setPadding(new Insets(20));
	v.setSpacing(20.0);
        atras.setAlignment(Pos.BOTTOM_CENTER);
        guardar.setAlignment(Pos.BOTTOM_CENTER);
        v.setAlignment(Pos.BOTTOM_CENTER);
       
        atras.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent ev) {
				
				Scene sc = new Scene(new vista_diseño_casa().getRoot(),600,600);
				
				changeatras(ev,sc);
				
			}
			
	});
        
        
        labels.getChildren().addAll(l1,l2,l3,l4,l5);
        labels.setSpacing(8);
        
        cbs.getChildren().addAll(piso,griferia,iluminacion,baños,aislamiento);
        ArrayList<ComboBox> c = new ArrayList<ComboBox>();
	c.add(piso);c.add(griferia);c.add(iluminacion);c.add(baños);c.add(aislamiento);
        for(ComboBox co: c) {
			VBox.setMargin(co, new Insets(0,0,0,25));
                       
		}
        
        
        centro.getChildren().addAll(labels,cbs);
        
        bp.setTop(titulos);
        bp.setCenter(centro);
        bp.setRight(v);
        
        root.getChildren().add(bp);
        
    
    
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

    public Label getL1() {
        return l1;
    }

    public void setL1(Label l1) {
        this.l1 = l1;
    }

    public Label getL2() {
        return l2;
    }

    public void setL2(Label l2) {
        this.l2 = l2;
    }

    public Label getL3() {
        return l3;
    }

    public void setL3(Label l3) {
        this.l3 = l3;
    }

    public Label getL4() {
        return l4;
    }

    public void setL4(Label l4) {
        this.l4 = l4;
    }

    public Label getL5() {
        return l5;
    }

    public void setL5(Label l5) {
        this.l5 = l5;
    }

    public ComboBox getPiso() {
        return piso;
    }

    public void setPiso(ComboBox piso) {
        this.piso = piso;
    }

    public ComboBox getGriferia() {
        return griferia;
    }

    public void setGriferia(ComboBox griferia) {
        this.griferia = griferia;
    }

    public ComboBox getIluminacion() {
        return iluminacion;
    }

    public void setIluminacion(ComboBox iluminacion) {
        this.iluminacion = iluminacion;
    }

    public ComboBox getBaños() {
        return baños;
    }

    public void setBaños(ComboBox baños) {
        this.baños = baños;
    }

    public ComboBox getAislamiento() {
        return aislamiento;
    }

    public void setAislamiento(ComboBox aislamiento) {
        this.aislamiento = aislamiento;
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

    public VBox getLabels() {
        return labels;
    }

    public void setLabels(VBox labels) {
        this.labels = labels;
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
