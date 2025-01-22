package comportamental.blackboard;

//Implementează un sistem de rezolvare a problemelor într-o aplicație de tip Blackboard.
//În acest sistem, diverse module specializate (denumite KnowledgeSources) sunt utilizate pentru a
//rezolva părți ale unei probleme. Controlul sistemului va fi realizat de o entitate responsabilă cu selectarea
//și coordonarea acestor module. Sistemul va încorpora o librărie de cunoștințe care va permite modulelor să adauge
//și să actualizeze informații pe un tablou (blackboard) comun.

public class Main {
    public static void main(String[] args) {
        //Crearea tabloului de soluții
        Blackboard blackboard = new Blackboard();

        //Crearea modulelor de cunoștințe
        KnowledgeSource mathModule = new MathKnowledgeSource();
        KnowledgeSource logicModule = new LogicKnowledgeSource();

        //Crearea controlerului și adăugarea modulelor
        Control control = new Control();
        control.addKnowledgeSource(mathModule);
        control.addKnowledgeSource(logicModule);

        //Executarea controlului care va apela modulele pentru a adăuga soluții
        control.execute(blackboard);

        //Afișarea soluțiilor adăugate
        System.out.println("All solutions:");
        for (String solution : blackboard.getSolutions()) {
            System.out.println(solution);
        }
    }
}
