import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

// import java.util.Random;

public class AlgorithmVisualizerModel {
    private static final int ARRAY_SIZE = 50;
    // private static final int MAX_VALUE = 500;

    private int[] arr;
    private Rectangle[] rectangles;
    private Timeline animationTimeline;
    private boolean sortingInProgress = false;

    public AlgorithmVisualizerModel() {
        arr = new int[ARRAY_SIZE];
        rectangles = new Rectangle[ARRAY_SIZE];
        animationTimeline = createAnimationTimeline();
        initializeRectangles();
    }

    private Timeline createAnimationTimeline() {
        return new Timeline(
            new KeyFrame(Duration.millis(50), e -> {
                if (sortingInProgress) {
                    // Call sorting step logic and update visualization here
                    // Example: insertionSortStep();
                    // updateVisuals();
                }
            })
        );
    }

    public void startSorting() {
        if (!sortingInProgress) {
            sortingInProgress = true;
            // Shuffle array and start animation
            shuffleArray();
            animationTimeline.play();
        }
    }

    // Add sorting step methods (insertionSortStep(), selectionSortStep(), etc.)

    public Rectangle[] getRectangles() {
        return rectangles;
    }

    private void shuffleArray() {
        // Shuffle the array
    }

    private void initializeRectangles() {
        // Initialize rectangles and their initial heights/colors
    }
}
