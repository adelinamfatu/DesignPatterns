package comportamental.blackboard;

import java.util.ArrayList;
import java.util.List;

public class Control {
    private List<KnowledgeSource> knowledgeSources = new ArrayList<>();

    public void addKnowledgeSource(KnowledgeSource knowledgeSource) {
        knowledgeSources.add(knowledgeSource);
    }

    public void execute(Blackboard blackboard) {
        for (KnowledgeSource ks : knowledgeSources) {
            ks.solve(blackboard);
        }
    }
}
