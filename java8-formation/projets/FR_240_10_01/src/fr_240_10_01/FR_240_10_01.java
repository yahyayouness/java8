/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr_240_10_01;

import javafx.application.Application;
import javafx.embed.swing.SwingNode;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javax.swing.JButton;
import javax.swing.SwingUtilities;

/**
 *
 * @author fabien
 */
public class FR_240_10_01 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        final SwingNode btn = new SwingNode();
        
        creerContenu(btn);
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    private void creerContenu(SwingNode btn) {
        SwingUtilities.invokeLater(() -> {
            btn.setContent(new JButton("Cliquez sur moi ! "));
        });
    }
    
}
