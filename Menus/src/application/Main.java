package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Crear la barra de menú principal
        MenuBar menuBar = new MenuBar();

        // Crear los menús principales
        Menu fileMenu = new Menu("Archivo");
        Menu editMenu = new Menu("Editar");
        Menu helpMenu = new Menu("Ayuda");

        // Crear los elementos de menú para "Archivo"
        MenuItem newFile = new MenuItem("Nuevo");
        MenuItem openFile = new MenuItem("Abrir");
        MenuItem saveFile = new MenuItem("Guardar");
        MenuItem exitApp = new MenuItem("Salir");

        // Añadir separadores y elementos de menú a "Archivo"
        fileMenu.getItems().addAll(newFile, openFile, saveFile, new SeparatorMenuItem(), exitApp);

        // Crear los elementos de menú para "Editar"
        MenuItem cut = new MenuItem("Cortar");
        MenuItem copy = new MenuItem("Copiar");
        MenuItem paste = new MenuItem("Pegar");

        // Añadir separadores y elementos de menú a "Editar"
        editMenu.getItems().addAll(cut, copy, paste);

        // Crear los elementos de menú para "Ayuda"
        MenuItem about = new MenuItem("Acerca de");

        // Añadir elementos de menú a "Ayuda"
        helpMenu.getItems().add(about);

        // Añadir los menús principales a la barra de menú
        menuBar.getMenus().addAll(fileMenu, editMenu, helpMenu);

        // Definir acciones para los elementos de menú
        newFile.setOnAction(e -> System.out.println("# Has seleccionado el botón Nuevo"));
        openFile.setOnAction(e -> System.out.println("# Has seleccionado el botón Abrir"));
        saveFile.setOnAction(e -> System.out.println("# Has seleccionado el botón Guardar"));
        exitApp.setOnAction(e -> System.out.println("# Has seleccionado el botón Salir"));
        cut.setOnAction(e -> System.out.println("# Has seleccionado el botón Cortar"));
        copy.setOnAction(e -> System.out.println("# Has seleccionado el botón Copiar"));
        paste.setOnAction(e -> System.out.println("# Has seleccionado el botón Pegar"));
        about.setOnAction(e -> System.out.println("# Has seleccionado el botón Acerca de"));

        // Crear el layout principal
        BorderPane root = new BorderPane();
        root.setTop(menuBar);

        // Crear la escena
        Scene scene = new Scene(root, 400, 300);

        // Configurar el escenario principal
        primaryStage.setTitle("Ejemplo de MenuBar en JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
