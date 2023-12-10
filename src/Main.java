import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        /* ---------------------------------------- Prosit 09 ------------------------------------------------------ */

        SocieteArrayList S = new SocieteArrayList();
        Employee e1 = new Employee(1, "Ayachi", "Meriem", "A44", 18);
        Employee e2 = new Employee(2, "Ayadi", "Zeineb", "G86", 36);
        Employee e3 = new Employee(3, "Mahmoud", "Houssem", "L63", 14);
        Employee e4 = new Employee(4, "Trad", "Ahlem", "C23", 18);

        S.ajouterEmploye(e4); //Add works
        S.ajouterEmploye(e2);
        S.ajouterEmploye(e1);
        S.ajouterEmploye(e3);
        System.out.println(S.rechercherEmploye(e1)); //True, it works
        S.displayEmploye(); //Display works
        System.out.println("\n"); //Display purposes
        S.supprimerEmploye(e1); //Delete works
        S.displayEmploye();
        System.out.println(S.rechercherEmploye("Ayadi")); //False, it works
        System.out.println("\n"); //Display purposes
        S.trierEmployeParId(); //Tri ID works
        S.displayEmploye();
        System.out.println("\n"); //Display purposes
        S.trierEmployeParNomDepartementEtGrade(); //Tri NomDepartement then Grade works
        S.displayEmploye();

    }
}