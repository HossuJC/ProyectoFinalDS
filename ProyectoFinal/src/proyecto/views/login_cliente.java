package proyecto.views;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class login_cliente {

	
	
	public GridPane login() {
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
		return log;
		
	}

}
