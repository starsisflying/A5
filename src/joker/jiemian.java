package joker;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class jiemian extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        AnchorPane anchorPane=new AnchorPane();
        Button button=new Button("开始");
        Text t=new Text();
        t.setText("螺母数组");
        TextField readField=new TextField();
        readField.setText("6,8,1,2,9,3,7");
        Text t2=new Text();
        t2.setText("螺钉数组");
        TextField readField2=new TextField();
        readField2.setText("9,3,7,1,6,2,8");
        TextArea outarea=new TextArea();
        readField.setPrefWidth(150);
        readField2.setPrefWidth(150);
        outarea.setPrefWidth(400);
        button.setOnMouseClicked(event -> {
            main.dothis(readField.getText(),readField2.getText());
            outarea.appendText(String.valueOf(main.append));
        });
        anchorPane.getChildren().addAll(button,readField,readField2,outarea,t,t2);
        AnchorPane.setTopAnchor(button,50.0);
        AnchorPane.setLeftAnchor(button,220.0);
        AnchorPane.setTopAnchor(t,9.0);
        AnchorPane.setTopAnchor(t2,9.0);
        AnchorPane.setTopAnchor(readField,5.0);
        AnchorPane.setTopAnchor(readField2,5.0);
        AnchorPane.setLeftAnchor(t2,20.0);
        AnchorPane.setLeftAnchor(t,270.0);
        AnchorPane.setLeftAnchor(readField,335.0);
        AnchorPane.setLeftAnchor(readField2,85.0);
        AnchorPane.setTopAnchor(outarea,100.0);
        AnchorPane.setLeftAnchor(outarea,45.0);
        Scene scene=new Scene(anchorPane);
        primaryStage.setScene(scene);
        primaryStage.setWidth(500);
        primaryStage.setHeight(500);
        primaryStage.setResizable(false);
        primaryStage.setTitle("A5");
        primaryStage.show();
    }
}
