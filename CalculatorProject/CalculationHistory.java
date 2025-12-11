import java.util.ArrayList;
import java.util.List;

public class CalculationHistory {

    private List<String> history = new ArrayList<>();

    public void add(String record) { history.add(record); }

    public void show() {
        if (history.isEmpty()) {
            System.out.println("History is empty!");
            return;
        }

        System.out.println("\n=== Calculation History ===");
        for (String h : history) {
            System.out.println(h);
        }
        System.out.println("===========================\n");
    }

    public void clear() {
        history.clear();
        System.out.println("History cleared successfully!");
    }
}
