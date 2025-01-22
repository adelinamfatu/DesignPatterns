package comportamental.chain_of_responsability;

//Imaginați-vă un sistem de gestionare a cererilor într-o companie. Cererile pot fi procesate de diferite departamente,
//în funcție de natura lor: departamentul IT, departamentul de resurse umane (HR) sau departamentul financiar.
//Dacă un departament nu poate procesa cererea, aceasta este transmisă mai departe către următorul departament.
//Vom folosi design pattern-ul Chain of Responsibility pentru a implementa acest flux.

public class Main {
    public static void main(String[] args) {
        Handler itHandler = new ITDepartment();
        Handler hrHandler = new HRDepartment();
        Handler financeHandler = new FinanceDepartment();

        //Construire lant de responsabilitate
        itHandler.setNextHandler(hrHandler);
        hrHandler.setNextHandler(financeHandler);

        //Initiere cereri
        System.out.println("Cerere: IT Support");
        itHandler.handleRequest("IT Support");

        System.out.println("\nCerere: HR Issue");
        itHandler.handleRequest("HR Issue");

        System.out.println("\nCerere: Finance Request");
        itHandler.handleRequest("Finance Request");

        System.out.println("\nCerere: Unknown Request");
        itHandler.handleRequest("Unknown Request");
    }
}
