package proyecto.views;

import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class vista_diseno_casa {
	Pane root = new Pane();
	Button cielo = new Button("Casa Cielo");
	Button paraiso = new Button("Casa Paraiso");
	Button oasis = new Button("Casa Oasis");
	Button atras = new Button("Atras");
	HBox hb = new HBox();
	VBox vb = new VBox();
	BorderPane bp = new BorderPane();
	

	vista_diseno_casa(){
		hb.setPadding(new Insets(35, 32, 35, 32));
		Text titulo1 = new Text("Diseño de Casa");
		titulo1.setFont(Font.font("Arial", FontWeight.NORMAL,30));
		Text titulo = new Text("Escoja una casa:");
		titulo.setFont(Font.font("Arial", FontWeight.NORMAL,20));
		vb.getChildren().add(titulo);
		
                hb.getChildren().add(cielo);
		hb.getChildren().add(paraiso);
		hb.getChildren().add(oasis);
		ArrayList<Button> buts = new ArrayList<Button>();
		buts.add(cielo);buts.add(paraiso);buts.add(oasis);
		for(Button a: buts) {
			HBox.setMargin(a, new Insets(0,0,0,25));
                        
		}
		VBox.setMargin(titulo, new Insets(20,0,0,20));
		VBox.setMargin(hb, new Insets(20,0,0,0));
		vb.getChildren().add(hb);
		VBox v= new VBox();
		v.getChildren().add(atras);
		v.setPadding(new Insets(20));
		v.setSpacing(20.0);
		VBox.setMargin(atras, new Insets(500,100,300,160));
		atras.setAlignment(Pos.BOTTOM_CENTER);
		atras.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent ev) {
				
				Scene sc = new Scene(new main_scene().getRoot());
				
				changeatras(ev,sc);
				
			}
			
		});
                
                cielo.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent ev) {
				
				Scene sc = new Scene(new vista_caracteristicas_casa("Modelo base : Cielo").getRoot(),600,600);
				
				changeatras(ev,sc);
				
			}
			
		});
                paraiso.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent ev) {
				
				Scene sc = new Scene(new vista_caracteristicas_casa("Modelo base : Paraiso").getRoot(),600,600);
				
				changeatras(ev,sc);
				
			}
			
		});
                oasis.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent ev) {
				
				Scene sc = new Scene(new vista_caracteristicas_casa("Modelo base : Oasis").getRoot(),600,600);
				
				changeatras(ev,sc);
				
			}
			
		});
                
                
		bp.setTop(titulo1);
		bp.setCenter(vb);
		bp.setRight(v);
		//cielo.setAlignment(Pos.BASELINE_CENTER);
		root.getChildren().add(bp);
	}
	public Pane getRoot() {
        return root;
    }
	
	
	static void changeatras(Event e, Scene sc) {
		Stage window =(Stage)((Node) e.getSource()).getScene().getWindow();
		window.setScene(sc);
	}
}
