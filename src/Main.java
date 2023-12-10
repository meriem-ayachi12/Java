import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        /* ---------------------------------------- Prosit 09 ------------------------------------------------------ */

        /*SocieteArrayList S = new SocieteArrayList();
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
        S.displayEmploye();*/

        /* ---------------------------------------- Prosit 10 ------------------------------------------------------ */

        /*DepartementHashSet D = new DepartementHashSet();

        D.ajouterDepartement(new Departement(3, "J24", 15));
        D.ajouterDepartement(new Departement(2, "J23", 15));
        D.ajouterDepartement(new Departement(1, "J22", 15));
        D.displayDepartement(); //It works
        System.out.println(D.rechercherDepartement("J24"));
        System.out.println(D.trierDepartementById()); */

        /* ---------------------------------------- Prosit 11 ------------------------------------------------------ */

        AffectationHashMap depHashset = new AffectationHashMap();
        Departement dep1 = new Departement(41,"1",0);
        Departement dep2 = new Departement(62,"2",0);

        Employee e1 = new Employee(1, "Ayachi", "Meriem", "A44", 18);
        Employee e2 = new Employee(2, "Ayadi", "Zeineb", "G86", 36);
        Employee e3 = new Employee(3, "Mahmoud", "Houssem", "L63", 14);
        Employee e4 = new Employee(4, "Trad", "Ahlem", "C23", 18);

        depHashset.ajouterEmployeDepartement(e1,dep1);
        depHashset.ajouterEmployeDepartement(e2,dep2);
        depHashset.ajouterEmployeDepartement(e3,dep2);
        depHashset.ajouterEmployeDepartement(e4,dep1);

        depHashset.afficherEmployesEtDepartements();
        System.out.println("-------------------------");
        depHashset.afficherDepartements();
        System.out.println("-------------------------");
        depHashset.afficherEmployes();
        System.out.println("-------------------------");
        System.out.println(depHashset.rechercherEmploye(e1));
        System.out.println(depHashset.rechercherDepartement(dep1));
        System.out.println("-------------------------");
        System.out.println(depHashset.trierMap());
        System.out.println("-------------------------");
        System.out.println("-------------------------");
        depHashset.supprimerEmploye(e1);
        depHashset.afficherEmployesEtDepartements();
        System.out.println(depHashset.rechercherEmploye(e1));
        System.out.println("-------------------------");
        depHashset.supprimerEmployeEtDepartement(e2,dep1);
        depHashset.afficherEmployesEtDepartements();
        System.out.println("-------------------------");
        depHashset.supprimerEmployeEtDepartement(e2,dep2);
        depHashset.afficherEmployesEtDepartements();
        System.out.println("-------------------------");
        depHashset.supprimerEmploye(e4);
        depHashset.afficherEmployesEtDepartements();
        System.out.println(depHashset.rechercherDepartement(dep1));
    }
}