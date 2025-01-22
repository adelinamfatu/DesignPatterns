package comportamental.null_object;

//Într-un sistem de Gestionare a Utilizatorilor dintr-o aplicație, putem avea utilizatori activi și utilizatori inactivi (nuli).
//Când un utilizator inactiv sau nul este întâlnit, în loc să returnăm un obiect nul (care ar putea duce la erori),
//utilizăm un obiect special de tip NullObject care implementează aceleași metode ca un obiect valid,
//dar cu un comportament care nu face nicio acțiune. Acest pattern ajută la evitarea verificărilor de tip null și
//face codul mai curat.

public class Main {
    public static void main(String[] args) {
        //Creăm un utilizator real și unul nul
        User realUser = new RealUser("JohnDoe");
        User nullUser = new NullUser();

        //Creăm servicii pentru fiecare utilizator
        UserService realUserService = new UserService(realUser);
        UserService nullUserService = new UserService(nullUser);

        //Executăm acțiuni pentru fiecare utilizator
        System.out.println("Real user action:");
        realUserService.executeAction();  //Va efectua acțiunea

        System.out.println("Null user action:");
        nullUserService.executeAction();  //Nu va efectua nicio acțiune
    }
}
