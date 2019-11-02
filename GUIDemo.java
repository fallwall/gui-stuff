import javafx.application.Application;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import java.time.format.DateTimeFormatter;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Scanner;

public class GUIDemo extends Application {

    /**
     * This main routine allows this class to be run as an application.  This is 
     * required for running Java FX programs in some versions of Java, but should
     * not be necessary in more recent versions.
     */
    public static void main(String[] args) {
        launch(args);
    }

    //-----------------------------------------------------------------------------------


    /**
     * This constructor adds several GUI components to the panel and sets
     * itself up to listen for action events from some of them.
     */
    public void start(Stage stage) {
        
        GridPane root = new GridPane();
            // I will put the transcript area in the right half of the
            // pane. The left half will be occupied by a grid of 4 rows
            // and two columns. Each row contains a component and
            // a label for that component.
        
        root.setHgap(8);
        root.setVgap(10);
        root.setPadding(new Insets(5,5,5,5));

        TextArea transcript = new TextArea();
        transcript.setEditable(true);
        transcript.setPrefRowCount(7);
        transcript.setPrefColumnCount(20);
        root.add(transcript, 2, 0, 1, 4);

        Label lab = new Label("TRY ME");
        root.add(lab, 0, 0);
        Button b = new Button("Click Me!");
        b.setOnAction( e -> transcript.appendText("Button was clicked\n\n") );
        root.add(b, 1, 0);

        // reuse variables

        lab = new Label("Checkbox:");
        root.add(lab, 0, 1);
        CheckBox c = new CheckBox("Click THE BOX!");
        c.setOnAction( e -> transcript.appendText("Checkbox was toggled\n\n") );
        root.add(c, 1, 1);

        lab = new Label("Text Field:");
        root.add(lab, 0, 2);
        TextField t = new TextField("Type here!");
        t.setPrefColumnCount(10);
        t.setOnAction( e -> transcript.appendText(
                              "Pressed return in TextField\nwith contents:  " + t.getText() + "\n\n") );
        root.add(t, 1, 2);

        lab = new Label("Pop-up Menu:");
        root.add(lab, 0, 3);
        ComboBox<String> combobox = new ComboBox<>();
        combobox.getItems().addAll("First Option", "Second Option", "Third Option", "Fourth Option");
        combobox.setValue("First Option");
        combobox.setOnAction( e -> transcript.appendText("Selected " + 
                                       combobox.getValue() + " from menu\n\n") );
        root.add(combobox, 1, 3);
        root.setStyle("-fx-border-width: 3px; -fx-border-color: lightpink");
        
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("SOME GUI STUFF");
        stage.show();
        stage.setResizable(true);
    }

}

public class Stopwatch {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss a");

        // Starting time:
        System.out.print("Enter to start stopwatch.");
        String start = input.nextLine();
        LocalDateTime currentTime = LocalDateTime.now();
        String currentTimeS = currentTime.format(formatter);
        System.out.println( "Stopwatch started @ " + currentTimeS );

        // Ending time:
        System.out.print("Enter to stop stopwatch.");
        String end = input.nextLine();
        LocalDateTime currentTime2 = LocalDateTime.now();
        String currentTime2S = currentTime2.format(formatter);
        System.out.println( "Stopwatch stopped @ " + currentTime2S );

        // Calculating ms difference:
        Duration diff = Duration.between(currentTime, currentTime2);
        long secDiff = diff.getSeconds();
        System.out.println( secDiff + (secDiff > 1 ? " SECONDS PASSED BY." : " SECOND PASSED BY."));
    }


}