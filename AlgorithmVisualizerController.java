import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
// import javafx.scene.shape.Rectangle;

public class AlgorithmVisualizerController {
    private AlgorithmVisualizerModel model;
    private AlgorithmVisualizerView view;

    public AlgorithmVisualizerController() {
        model = new AlgorithmVisualizerModel();
        view = new AlgorithmVisualizerView(model.getRectangles());
    }

    public StackPane getRoot() {
        HBox controls = new HBox(10);

        Button startButton = new Button("Start Sorting");
        startButton.setOnAction(event -> model.startSorting());

        // Add other buttons and controls

        controls.getChildren().addAll(startButton);

        StackPane root = new StackPane();
        root.getChildren().addAll(view.getRoot(), controls);

        return root;
    }
}
