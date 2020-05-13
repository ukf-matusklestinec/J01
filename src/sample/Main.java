package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.scene.effect.Glow;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.MoveTo;
import javafx.stage.Stage;

import static java.awt.Color.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
    Group root = new Group();


        Line Yrden = new Line(150,400,250,400 );
        Yrden.setStroke(Color.PURPLE);

        root.getChildren().add(Yrden);

        Line Yrden1 = new Line(250,400,210,445 );
        Yrden1.setStroke(Color.PURPLE);
        root.getChildren().add(Yrden1);

        Line Yrden2 = new Line(150,400,250,500 );
        Yrden2.setStroke(Color.PURPLE);
        root.getChildren().add(Yrden2);

        Line Yrden3 = new Line(250,500,150,500 );
        Yrden3.setStroke(Color.PURPLE);
        root.getChildren().add(Yrden3);

        Line Yrden4 = new Line(150,500,183,465 );
        Yrden4.setStroke(Color.PURPLE);
        root.getChildren().add(Yrden4);



        Line Quen = new Line(275,400,375,400);
        Quen.setStroke(Color.YELLOW);
        root.getChildren().add(Quen);

        Line Quen1 = new Line(375,400,355,430);
        Quen1.setStroke(Color.YELLOW);
        root.getChildren().add(Quen1);

        Line Quen2 = new Line(355,430,320,430);
        Quen2.setStroke(Color.YELLOW);
        root.getChildren().add(Quen2);

        Line Quen3 = new Line(275,400,325,500);
        Quen3.setStroke(Color.YELLOW);
        root.getChildren().add(Quen3);

        Line Quen4 = new Line(325,500,325,500);
        Quen4.setStroke(Color.YELLOW);
        root.getChildren().add(Quen4);

        Line Quen5 = new Line(325,500,345,450);
        Quen5.setStroke(Color.YELLOW);
        root.getChildren().add(Quen5);


        Line Igni = new Line(425,400,375,500);
        Igni.setStroke(Color.RED);
        root.getChildren().add(Igni);

        Line Igni1 = new Line(375,500,477,500);
        Igni1.setStroke(Color.RED);
        root.getChildren().add(Igni1);

        Line Igni2 = new Line(477,500,450,450);
        Igni2.setStroke(Color.RED);
        root.getChildren().add(Igni2);


        Line Axii = new Line(500,400,600,400);
        Axii.setStroke(Color.GREEN);
        root.getChildren().add(Axii);

        Line Axii1 = new Line(500,400,550,500);
        Axii1.setStroke(Color.GREEN);
        root.getChildren().add(Axii1);

        Line Axii2 = new Line(550,500,590,425);
        Axii2.setStroke(Color.GREEN);
        root.getChildren().add(Axii2);

        Line Aard = new Line(640,445,665,400);
        Aard.setStroke(Color.LIGHTBLUE);
        root.getChildren().add(Aard);

        Line Aard1 = new Line(665,400,725,500);
        Aard1.setStroke(Color.LIGHTBLUE);
        root.getChildren().add(Aard1);

        Line Aard2 = new Line(725,500,610,500);
        Aard2.setStroke(Color.LIGHTBLUE);
        root.getChildren().add(Aard2);

        Line Aard3 = new Line(610,500,625,475);
        Aard3.setStroke(Color.LIGHTBLUE);
        root.getChildren().add(Aard3);

        Line Aard4 = new Line(625,475,663,475);
        Aard4.setStroke(Color.LIGHTBLUE);

        root.getChildren().add(Aard4);


        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 1000, 1000,Color.BLACK));

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
