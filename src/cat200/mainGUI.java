package cat200;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.sql.*;

public class mainGUI {
    public TextField userField;
    public PasswordField passField;
    public Button exitButton;

    public void exitProgram(){
        Stage stage = (Stage) exitButton.getScene().getWindow();
        stage.close();
    }

    public void loginProgram(){
        //set Oracle SQL connection
        try{
            String host="jdbc:oracle:thin:@localhost:1521:XE";
            String user=userField.getText();
            String pass=passField.getText();
            Connection con= DriverManager.getConnection(host, user, pass);
            //declaration of sql statement
            Statement stat= con.createStatement();
            //////////////////////////////////////proceed to main interface
        }catch(SQLException e){
            //no suitable driver for ORACLE SQL
            if(e.getErrorCode()==0){
                Alert alert= new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error Dialog");
                alert.setHeaderText("ERROR 101: Connection error");
                alert.setContentText("Opps, looks like the connection to Oracle SQL fail !");
                alert.showAndWait();
            }
            //invalid credential
            else if(e.getErrorCode()==1017){
                Alert alert= new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error Dialog");
                alert.setHeaderText("ERROR 201: Wrong credential error");
                alert.setContentText("Opps, looks like there is invalid username/password !");
                alert.showAndWait();
            }
            System.out.println(e.getMessage()); //testing new error purpose
            System.out.println(e.getErrorCode());   //testing new error purpose
        }
    }


}