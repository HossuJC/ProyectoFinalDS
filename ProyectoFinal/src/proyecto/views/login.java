package proyecto.views;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class login {

	Pane root = new Pane();
	public login(String tipo) {
                Button ingresar=new Button("Ingresar");
                Button salir=new Button("Ir al menú");
            
		GridPane log = new GridPane();
		log.setAlignment(Pos.CENTER);
		log.setHgap(10);
		log.setVgap(10);
		log.setPadding(new Insets(20));
		Text msg = new Text("Bienvenido");
		msg.setFont(Font.font("Arial", FontWeight.LIGHT,20));
		log.add(msg, 0, 0);
		Label user = new Label("usuario:");
		log.add(user, 0, 1);
		TextField usname = new TextField();
		usname.setPromptText("usuario");
		log.add(usname, 1, 1);
		Label pass = new Label("contraseña:");
		log.add(pass, 0, 2);
		PasswordField pss= new PasswordField();
		pss.setPromptText("password");
		log.add(pss, 1, 2);
                log.add(ingresar,0,3);
                log.add(salir,1,3);
                ingresar.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent ev) {
                                Scene sc;
                                if(tipo.equals("Administrador")){
                                    sc = new Scene(new MenuAdministrador().getRoot(),600,600);
                                    changeatras(ev,sc);
                                }
                                else if(tipo.equals("Cliente")){
                                    sc = new Scene(new MenuCliente().getRoot(),600,600);
                                    changeatras(ev,sc);
                                }
                                else if(tipo.equals("Vendedor")){
                                    sc = new Scene(new MenuVendedor().getRoot(),600,600);
                                    changeatras(ev,sc);
                                }
				
				
			}
			
                });
                salir.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent ev) {
                                Scene sc = new Scene(new main_scene().getRoot());
				
				changeatras(ev,sc);
				
				
			}
			
                });
		root.getChildren().add(log);
		
		
	}
	
	public Pane getroot() {
		return root;
	}
        static void changeatras(Event e, Scene sc) {
		Stage window =(Stage)((Node) e.getSource()).getScene().getWindow();
		window.setScene(sc);
	}
        

}
