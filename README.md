Creationale: 
• Abstract Factory – Crearea de familii de obiecte inrudite sau dependente, fara a preciza clasa concreta (crearea de obiecte inrudite) 
o Interfete generice cu clase implementari specifice 
o Interfata AbstractFactory ce are metode pentru creearea fiecarui tip generic 
o Clase specifice 
o Exemplu: tipuri de masini si regiuni – Sedan Nord American, Sedan Australian 
• Builder – Crearea de obiecte complexe in mod incremental (crearea de obiecte cu campuri optionale si obligatorii) 
o Campuri obligatorii si optionale 
o Constructor doar cu campurile obligatorii in Builder, iar Product primeste Builder ca parametru si ia de acolo valorile 
o Proprietati finale si clasa finala daca nu se vrea modificarea lor vreodata (obiect imutabil) 
o Metoda de add pentru fiecare camp optional in parte in Builder 
o Metoda de build care returneaza this 
o Exemplu: pachet turistic cu multe optiuni (parcare, numar paturi, etc) 
• Factory Method – Defineste o metoda pentru crearea de obiecte din aceeasi familie (crearea de obiecte intr-o maniera usor extensibila) 
o Interfata generica implementata de clasele specific 
o Interfata FactoryMethod implementata de toate fabricile, cu metoda createInstance ce returneaza interfata generica 
o Fabrici specifice ce creeaza obiectul specific 
o Exemplu: bucatarie si preparare mancare de diferite feluri 
• Prototype – Clonarea instantelor unui prototip existent (crearea de obiecte costisitoare, la care se prefera clonarea si modificarea ulterioara a unor campuri) 
o Interfata Prototype cu metoda de clonare 
o Clasa generica cu un constructor privat pentru clonare ce primeste un parametru de tipul clasei si pune campurile in this – constructorul e folosit in metoda de clonare 
o Se creeaza un obiect cu new, dupa care urmatoarele apeleaza metoda clone si foloseste setterii sa modifice campurile necesare 
o Exemplu: campanii de marketing ce nu difera mult intre ele 
• Singleton – Crearea unei instante unice (crearea unui obiect global, unic) 
o Constructor privat 
o Metode si campuri statice 
o Camp cu numele clasei 
o Metoda getInstance (synchronized) care verifica daca instanta e nula si creeaza o instanta unica 
o Singleton.getInstance() 
o Exemplu: conexiunea la baza de date 
• Multiton (Registry Singleton) – Crearea unei instante unice, pe baza unei chei (crearea unor perechi de obiecte cu chei unice) 
o Constructor privat 
o O singura instanta per cheie 
o Camp de tip Map<Key, Multiton> 
o Exemplu: configuratii medii de dezvoltare 
• Simple Factory – Crearea de obiecte din aceeasi familie, pe baza unui tip (crearea de obiecte cu valori implicite) 
o O interfata comuna si clase concrete ce implementeaza interfata 
o Constructori privati, fiecare clasa are o metoda create ce returneaza tipul generic si apeleaza constructorul 
o Clasa Factory cu metoda getProduct care creeaza obiectele din fiecare tip, apeland metoda create din fiecare, returnand tipul generic 
• Object Pool – Obiectele sunt create anterior si sunt furnizate in momentul in care are loc o cerere 
o Clasa Object ce reprezinta un obiect reutilizabil 
o Clasa ObjectPool care e un singleton – are instanta de tip ObjectPool, metoda getInstance si constructor privat 
o Metode sincronizate de release si get Object 
o Exemplu: mai multe conexiuni la baza de date 

Structurale: 
• Adapter – Adapteaza interfata unei clase la o alta interfata (adaptarea unui comportament la altul) 
o Interfata Target ce are o metoda specifica 
o Clasa Adaptee ce are o metoda specifica, diferita fata de cea din Target 
o Clasa Adapter ce implementeaza interfata, are un camp de tip Adaptee, pe care il primeste ca parametru in constructor si in metoda specifica apeleaza metoda din Adaptee daca e nevoie, altfel face operatii specifice adapter-ului 
o Exemplu: adaugarea unei conversii la o noua moneda 
• Bridge – Decupleaza modelul abstract de implementare (despartirea unor obiecte complexe in 2 obiecte mai simple) 
o Interfata Implementor cu cateva metode specifice 
o Clase ConcreteImplementor ce implementeaza interfata 
o Clasa abstracta Abstraction cu un camp de tip Implementor si metode specifice ce le cheama pe cele din Implementor 
o Clasa RefinedAbstraction ce extinde Abstraction 
o Exemplu: obiecte de tipul cerc albastru, cerc rosu, ce trebuie despartite in 2 obiecte diferite  
• Composite – Agregarea a mai multor obiecte similare intr-o ierarhie arborescenta (familii de tipul arbore cu elemente cu fii si elemente de tip frunza) 
o Interfata Component ce are o operatie specifica 
o Clasa Leaf, de cel mai jos nivel, cu campuri proprii, ce implementeaza Component 
o Clasa Composite ce implementeaza Component si are o lista de Leaf si metode specifice de adaugare, stergere, etc 
o Exemplu: sistem de fisiere 
• Decorator – Extinde responsabilitatile unui obiect in mod dynamic (adaugarea unui nou comportament) 
o Clasa ConcreteComponent ce implementeaza interfata Component reprezinta comportamentul ce poate fi decorat 
o Clasa abstracta Decorator ce implementeaza Component si are un camp de tipul Component pe care il primeste in constructor 
o Clase concrete ce extind Decorator si au metode/campuri noi specific 
o Exemplu: sistem de notificari cu email, la care se vrea adaugare de sms si notificari push 
• Facade – Furnizeaza o interfata unica pentru interfetele unui subsistem (oferirea unei interfete utilizatorului ca sa nu vada ce se face in spate) 
o Mai multe clase Subsistem, care eventual se folosesc unele de altele si au metode specific 
o Clasa Façade care are campuri din toate clasele Subsistem si metode specifice in care apeleaza metodele din fiecare subsistem 
o Exemplu: inchiriere filme – contine subsisteme pentru catalog de filme, sistem de plati, sistem de livrare, etc.   
• Flyweight – Utilizarea partajarii pentru utilizarea eficienta a unui numar mare de obiecte (impartirea unor obiecte in 2 obiecte, unul partajat si unul concret) 
o Interfata Flyweight cu o metoda specifica 
o Clasa ConcreteFlyweight ce contine partea comuna a campurilor 
o Clasa UnsharedConcreteFlyweight ce implementeaza interfata si contine restul de campuri nepartajate si care poate fi derivata. Contine un camp de tip al interfetei ce reprezinta partea partajata 
o FlyweightFactory contine un map cheie-valoare unde valoarea este o instanta de tip al interfetei si are o metoda getKey ce cauta prin map si adauga o noua pereche daca nu exista, unde cheia e tipul din switch 
o Exemplu: caractere de acelasi tip dintr-un joc 
• Proxy – Furnizeaza o componenta vida pentru un obiect pentru a controla accesul la acesta (adaugarea unui strat de siguranta controlat) 
o Interfata Subject cu o metoda specifica 
o Clasa RealSubject ce implementeaza Subject 
o Clasa Proxy ce implementeaza Subject si are un camp de tipul RealSubject si a carui acces il controleaza printr-o metoda si prin campuri aditionale 
o Se foloseste Proxy-ul in main 
o Exemplu: controlarea accesului la un serviciu de streaming 
• Aggregate – controlarea accesului la campuri (controlarea accesului la anumite operatii) 
o Clasa ClassData ce are campuri, getteri si constructor, eventual metode specifice 
o Clasa Class ce are o lista sau doar un obiect de tip ClassData si constructor cu aceiasi parametri ca ClassData 
o Exemplu: sistem de gestionare a comenzilor intr-un magazin 

Comportamentale: 
• Chain of Responsibility – Gestioneaza tratarea unui eveniment de catre un obiect (transmitere responsabilitatii catre alt obiect care se poate ocupa de acel caz) 
o Interfata Handler cu o actiune specifica handleRequest 
o Clasa ConcreteHandler care implementeaza interfata si in metoda specifica verifica daca poate indeplini sarcina, daca nu, apeleaza metoda din urmatorul obiect de tip Handler pe care il are ca si camp 
o In main se seteaza inlantuirea 
o Exemplu: tratarea exceptiilor 
• Command – Incapsuleaza o cerere sub forma unui obiect, permitand parametrizarea acestuia (impartirea unor actiuni ca si comenzi atomice si inlantuirea lor intr-un invoker) 
o Interfata Command cu metoda specifica execute 
o Clasa Receiver cu o actiune specifica 
o ConcreteCommand implementeaza interfata, are un camp de tip Receiver si apeleaza metoda din Receiver 
o Clasa Invoker are un camp de tip Command si are metode specifice care apeleaza metoda execute din Command 
o Exemplu: comenzi de inchidere/deschidere lumina cu telecomanda ca invoker 
• Memento – Permite salvarea si restaurarea starii unui obiect (contine stari anterioare ale unui obiect) 
o Clasa Memento cu metode si campuri specifice care sunt finale pentru a nu fi modificate 
o Clasa Originator are aceleasi campuri ca si Memento, insa nu sunt finale 
o Pe langa asta, are o metoda de save/createMemento ce returneaza un obiect de tip Memento si il creeaza prin new si metoda de restore/setMemento ce primeste un obiect de tip Memento si retine campurile din Memento ca un fel de copie 
o Clasa Caretaker ce contine o stiva Stack<Memento>, cat si metode de save (ce primeste un obiect de tip Memento ca parametru) si undo (ce returneaza un obiect de tip Memento) pe stiva 
o In main, cand se da undo in Caretaker, clasa Originator preia si face restore la Memento 
o Exemplu: cand se da undo in Word 
• Observer – Defineste o relatie de tipul unul la mai multi intre obiecte, astfel incat la modificarea starii unui obiect, celelalte obiecte sa fie notificate (notificarea abonatilor de modificarea starii unui obiect) 
o Interfata Observer cu metoda de update 
o Interfata/clasa abstracta Subject ce contine o lista de observer si metode de adaugare, scoatere din lista si notificare abonati 
o Clasa ConcreteSubject ce extinde Subject 
o Clase ConcreteObserver care implementeaza Observer si fac operatii specifice 
o Exemplu: notificari trimise de aplicatii 
• State – Permite modificarea comportamentelor obiectelor la schimbarea starii acestora (stari diferite ale unui obiect) 
o Interfata State cu metoda specifica handle ce primeste un obiect de tip Context 
o Clase ConcreteState ce implementeaza interfata si dau o implementare metodei – face actiunea specifica, dupa care seteaza urmatoarea stare. 
o Clasa Context ce are un camp de tip State pe care il initializeaza sau il primeste prin constructor si o metoda ce apeleaza metoda din interfata cu this ca parametru 
o Exemplu: schimbarea starii unui lift la apasarea butonului 
• Strategy – Defineste si incapsuleaza o familie de algoritmi (alegerea unui algoritm dintre mai multi) 
o Interfata Strategy cu o metoda ce face un algoritm 
o Clase concrete ce implementeaza interfata si rezolva algoritmul 
o Exemplu: alegere algoritm livrare 
• Template Method – Incapsuleaza un algoritm ai carui pasi sunt implementatiin clase derivate (algoritmi cu set predefinit de pasi – pasi intr-o anumita ordine ce nu poate fi schimbata) 
o Clasa abstracta cu operatii atomice, o metoda abstracta ce trebuie exemplificata in clasa extensa si o metoda template finala (nu poate fi modificata) care apeleaza operatiile 
o Clasa concreta ce o extinde pe cea abstracta si da o implementare metodei abstracte 
o Exemplu: comenzile unui restaurant ce au pasi ce trebuie facuti mereu in ordine 
• Interpreter – Defineste o reprezentare a unui limbaj cu o gramatica simpla si un mecanism de interpretarea expresiilor (gramatica unui limbaj) 
o Interfata AbstractExpression cu o metoda interpret ce primeste un context ca parametru 
o Clase TerminalExpression si NonterminalExpression ce implementeaza interfata si exemplifica operatia specifica interpret 
o Cea NonterminalExpression are de regula 2 campuri de tip Expression si le foloseste pe ambele in operatie 
o Clasa Interpreter/Client ce contine un camp de tip context si construieste arborele expresiilor, parsand datele 
o Exemplu: operatii matematice 
• Iterator – Permite gestionarea accesului la elementele din cadrul unei colectii (operatii pe o structura fara a-i cunoaste continutul) 
o Interfata Iterator cu metode specifice, cum ar fi first, last, next, prev. Poate fi interfata template <T> pentru de exemplu parcurgea unor listei de obiecte ale unei clase Client 
o Interfata AggregateIterator cu metoda createIterator 
o Clasa ConcreteIterator ce implementeaza Iterator si are o lista de obiecte de tipul Client si aduce implementari pentru fiecare dintre metode 
o Clasa ConcreteAggregate ce implementeaza AggregateIterator si in metoda createIterator face cu new un obiect de tip ConcreteIterator 
o In main se creeaza lista cu elemente de tip Client, dupa care se foloseste metoda createIterator pentru a intoarce un Iterator, ce e folosit intr-un while 
o Exemplu:  
• Mediator – Defineste un obiect care incapsuleaza modulin care interactioneaza mai multe obiecte asociate (facilitarea comunicarii intre obiecte) 
o Interfata Colleague care are metode specifice 
o Clase ConcreteColleague ce contin un camp de tip mediator primit in constructor, iar toate metodele implementate sunt transmise la mediator cu this ca parametru 
o Interfata Mediator cu aproximativ aceleasi metode ca Colleague 
o Clasa ConcreteMediator ce implementeaza Mediator si primeste un Colleague ca parametru, si lui ii este pasata actiunea 
o Exemplu: comunicarea intre avioane si ATC 
• Visitor – Defineste operatii care pot fi aplicate pe elementele unei structuri neomogene (operatii diverse pe structuri care nu sunt la fel, dar care au ceva in comun) 
o Interfata Visitor cu metode de vizitare a ConcreteVisitor, cu parametri de intrare de tipul fiecarui ConcreteVisitor 
o Interfata Element cu metoda accept ce primeste un Visitor 
o Clase ConcreteElement ce implementeaza Element iar in metoda de accept fac visitor.visit(this) 
o Clase ConcreteVisitor ce implementeaza Visitor si fac o anumita operatie in fiecare metoda de tip visit implementata 
o Exemplu: analiza structurii unui arbore de fisiere 
• Null Object – Incapsuleaza absenta unui obiect prin furnizarea unei alternative care sa poata fi substituita (cand se verifica de null ca sa se opreasca o executie si se prefera returnarea unei referinte in loc de null) 
o Interfata AbstractObject cu metoda specifice 
o Clasa RealObject cu implementare reala a metodelor 
o Clasa NullObject ce arata comportamentul metodelor cand obiectul e null 
o Exemplu: sisteme de logare de tip Logger care afiseaza mesaje la consola 
• Blackboard – Mai multe subsisteme specializate combina cunostintele pentru a construi o solutie eventual partiala sau aproximativa (rezolvarea unor solutii complexe prin module specializate) 
o Interfata KnowledgeSource cu metoda specifica ce primeste un obiect de tip Blackboard ca parametru 
o Clase specifice KnowledgeLource ce adauga ceva la blackboard blackboard.addSolution 
o Clasa Blackboard ce are o lista de solutii si metode de adaugare si get (inspect si update) 
o Clasa Control ce are o lista de KnowledgeSource si o metoda de execute in care apeleaza solve de blackboard pe fiecare KnowledgeSource 
o Exemplu: identificarea autovehiculelor 
• Specification – Crearea unei specificatii capabilesa precizeze daca un obiect candidat indeplineste anumite criterii (filtrarea datelor pe anumite criterii) 
o Interfata Specification cu metode de or, and, not si isSatisfiedBy 
o Clase specifice AndSpecification, OrSpecification, NotSpecification ce au 1 sau 2 campuri de tip Specification, iar in metoda isSatifiedBy fac operatia &&, || sau !, iar in celelalte primesc o alta Specification ca parametru si fac new Specification de this si other 
o CompositeSpecification care implementeaza interfata si implementeaza metoda isSatifiedBy in functie de logica de business 
o Exemplu: cautarea obiectelor intr-o baza de date

Modele de proiectare pentru aplicatii Web: 
• Model View Controller (MVC) 
o Model – Clase cu campuri si metode 
o View – Interfata ce interactioneaza cu modelul 
o Controller – GET, POST, DELETE, etc 
• Model View Presenter (MVP) 
o Model – Clase cu campuri si metode 
o View – Interfata 
o Presenter – Legatura dintre model si view, el actualizeaza view-ul si modelul 
• Model View ViewModel (MVVM) 
o Model – Clase cu campuri si metode 
o View  – Interfata ce nu interactioneaza direct cu modelul, ci doar cu presenterul 
o ViewModel – Clasa ce face legatura dinamica intre interfata si date 
• Model View Template (MVT) 
o Model – Clase cu campuri si metode 
o View – Logica aplicatiei 
o Template – Interfata 

Modele de aplicatii pentru accesul la date: 
• Active Record – Clasa ActiveRecord, cu proprietati, getteri, setter, metode specifice si metode de creare, actualizare, stergere, cu baza de date/fisier 
• Data Mapper – Clasa DataMapper care are metode de creare, actualizare, stergere, cu baza de date/fisier pe baza unei alte clase 
• Table Data Gateway – Clasa TableGateway ce gestioneaza toate operatiile cu baza de date/fisier 
• Row Data Gateway 
• Data Access Object – foloseste DTO, are de obicei o clasa Model, o clasa DAO cu operatiile pe baza de date si eventual un DTO care transfera de la Model la DAO 
• Data Transfer Object – Clasa DTO, de obicei serializabila, ce contine campurile si listele obiectelor, fara logica de business
