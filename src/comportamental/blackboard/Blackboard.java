package comportamental.blackboard;

import java.util.ArrayList;
import java.util.List;

public class Blackboard {
    private List<String> solutions = new ArrayList<>();

    public void addSolution(String solution) {
        solutions.add(solution);
        System.out.println("Solution added: " + solution);
    }

    public List<String> getSolutions() {
        return solutions;
    }
}
