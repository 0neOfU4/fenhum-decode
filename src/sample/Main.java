package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("费纳姆密码解密 by 0neOfU4");
        primaryStage.setScene(new Scene(root, 410, 310));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
