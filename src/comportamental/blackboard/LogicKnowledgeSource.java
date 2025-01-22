package comportamental.blackboard;

public class LogicKnowledgeSource implements KnowledgeSource {
    @Override
    public void solve(Blackboard blackboard) {
        String solution = "Logic solution: If A then B";
        blackboard.addSolution(solution);
    }
}
