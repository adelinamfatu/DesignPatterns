package comportamental.blackboard;

public class MathKnowledgeSource implements KnowledgeSource {
    @Override
    public void solve(Blackboard blackboard) {
        String solution = "Math solution: 2 + 2 = 4";
        blackboard.addSolution(solution);
    }
}
