package comportamental.interpreter;

//Se dorește implementarea unui interpretator pentru evaluarea expresiilor aritmetice folosind
//design pattern-ul Interpreter. Expresiile aritmetice pot include adunări, scăderi, înmulțiri și împărțiri,
//iar ordinea operațiilor trebuie să fie respectată (paranteze, înmulțire și împărțire înainte de adunare și scădere).
//Implementați clasele necesare pentru a evalua o expresie dată, precum și arborele de sintaxă asociat.

public class Main {
    public static void main(String[] args) {
        Expression expr1 = new AddExpression(new NumberExpression(3), new NumberExpression(5));
        System.out.println("Rezultatul expresiei 3 + 5 este: " + expr1.interpret());

        Expression expr2 = new SubtractExpression(new NumberExpression(10), new NumberExpression(4));
        System.out.println("Rezultatul expresiei 10 - 4 este: " + expr2.interpret());
    }
}
