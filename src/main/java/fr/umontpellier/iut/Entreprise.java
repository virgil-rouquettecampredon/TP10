package fr.umontpellier.iut;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeSet;

public class Entreprise {
    private Collection<Employe> lePersonnel;

    public Entreprise(){
        this.lePersonnel = new ArrayList<>();
    }

    public void embaucher(Employe e, LocalDate dateEmbauche){
        lePersonnel.add(e);
        e.setDateEmbauche(dateEmbauche);
    }
    public void licencier(Employe e){
        lePersonnel.remove(e);
    }

    @Override
    public String toString() {
        return "Entreprise{" +
                "lePersonnel=" + lePersonnel +
                '}';
    }
    public Collection<Employe> getEmployes() {
        TreeSet<Employe> t = new TreeSet<>();
        for (Employe e : lePersonnel) {
            t.add(e);
        }
        return t;
    }
}
