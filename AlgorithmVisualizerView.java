import javafx.scene.layout.StackPane;
import javafx.scene.shape.Rectangle;

public class AlgorithmVisualizerView {
    private StackPane root;
    private Rectangle[] rectangles;

    public AlgorithmVisualizerView(Rectangle[] rectangles) {
        this.rectangles = rectangles;
        initializeUI();
    }

    private void initializeUI() {
        root = new StackPane();
        root.getChildren().addAll(rectangles);
    }

    public StackPane getRoot() {
        return root;
    }
}
