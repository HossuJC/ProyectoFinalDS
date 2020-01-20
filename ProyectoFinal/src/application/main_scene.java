package application;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class main_scene extends Application implements EventHandler<ActionEvent>{

	Button admin;
	Button vendedor;
	Button client;
	Button diseño;
	VBox panel1;
	BorderPane bp;
	login_vendedor lv;
	login_cliente lc;
	login_admin la;
	
	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		
		
	}
	public BorderPane mainScene() {
		
		admin= new Button();
		vendedor = new Button();
		client = new Button();
		Image i = new Image("application/casadiseño.png");
		ImageView im = new ImageView(i);
		admin.setText("ADMINISTRADOR");
		client.setText("CLIENTE");
		
		vendedor.setText("VENDEDOR");
		ArrayList<Button> buts = new ArrayList<Button>();
		buts.add(admin); buts.add(client); buts.add(vendedor);
		panel1 = new VBox();
		panel1.setPadding(new Insets(10));
		panel1.setSpacing(10);
		Text titulo = new Text("Inicio Sesión");
		titulo.setFont(Font.font("Arial", FontWeight.NORMAL,20));
		panel1.getChildren().add(titulo);
		for (Button v: buts) {
			VBox.setMargin(v, new Insets(0,0,0,8));
			panel1.getChildren().add(v);
		}
		BorderPane bp = new BorderPane();
		bp.setRight(panel1);
		Text txt = new Text("My Home S.A.");
		txt.setFont(Font.font("Arial", FontWeight.NORMAL,40));
		HBox hb = new HBox();
		hb.setPadding(new Insets(15, 12, 15, 350));
		hb.setStyle("-fx-background-color: #7fffd4;");
		hb.getChildren().add(txt);
		txt.setTextAlignment(TextAlignment.CENTER);
		bp.setTop(hb);
		VBox func = new VBox();
		Text titulo2 = new Text("Opciones:");
		titulo2.setFont(Font.font("Arial", FontWeight.NORMAL,20));
		func.setPadding(new Insets(15,25,15,25));
		func.setSpacing(10);
		func.getChildren().add(titulo2);
		Button diseño = new Button("Diseñar Casa");
		func.getChildren().add(diseño);
		bp.setLeft(func);
		bp.setCenter(im);
		client.setOnAction(this);
		admin.setOnAction(this);
		vendedor.setOnAction(this);
		return bp;
	}
	@Override
	public void handle(ActionEvent ev) {
		Stage window = new Stage();
		Scene scene1;
		// TODO Auto-generated method stub
		if(ev.getSource()==client) {
			System.out.println("Hola soy el cliente");
			lc = new login_cliente();
			GridPane gp = lc.login();
			
			scene1 = new Scene(gp,500,500);
			window.setScene(scene1);
			window.show();
			
		}
		else if(ev.getSource()==vendedor) {
			System.out.println("Soy el vendedor");
			lv = new login_vendedor();
			GridPane gp = lv.login();
			
			scene1 = new Scene(gp,500,500);
			window.setScene(scene1);
			window.show();
			
			
		}
		else if(ev.getSource()==admin) {
			System.out.println("Soy el admin");
			la = new login_admin();
			GridPane gp = la.login();
			
			scene1 = new Scene(gp,500,500);
			window.setScene(scene1);
			window.show();
			
		}
	}

}
