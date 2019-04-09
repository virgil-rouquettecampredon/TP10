package fr.umontpellier.iut;

import java.time.LocalDate;

public class Employe {
    private String numeroSecuriteSocial;
    private String nom;
    private String prenom;
    private int echelon;
    private double nbHeure;
    private double base;
    private LocalDate dateEmbauche;

    public Employe(String numeroSecuriteSocial, String nom, String prenom, int echelon, double nbHeure, double base) {
        this.numeroSecuriteSocial = numeroSecuriteSocial;
        this.nom = nom;
        this.prenom = prenom;
        this.echelon = echelon;
        this.nbHeure = nbHeure;
        this.base = base;
    }

    public static class EmployeBuilder {
        private String numeroSecuriteSocial;
        private String nom;
        private String prenom;
        private int echelon;
        private double nbHeure;
        private double base;

        public EmployeBuilder setNumeroSecuriteSocial(String numeroSecuriteSocial) {
            this.numeroSecuriteSocial = numeroSecuriteSocial;
            return this;
        }

        public EmployeBuilder setNom(String nom) {
            this.nom = nom;
            return this;
        }

        public EmployeBuilder setPrenom(String prenom) {
            this.prenom = prenom;
            return this;
        }

        public EmployeBuilder setEchelon(int echelon) {
            this.echelon = echelon;
            return this;
        }

        public EmployeBuilder setNbHeure(double nbHeure) {
            this.nbHeure = nbHeure;
            return this;
        }

        public EmployeBuilder setBase(double base) {
            this.base = base;
            return this;
        }

        public Employe createEmploye() {
            return new fr.umontpellier.iut.EmployeBuilder().setNumeroSecuriteSocial(numeroSecuriteSocial).setNom(nom).setPrenom(prenom).setEchelon(echelon).setNbHeure(nbHeure).setBase(base).createEmploye();
        }
    }

    public LocalDate getDateEmbauche() {
        return dateEmbauche;
    }

    public void setDateEmbauche(LocalDate dateEmbauche) {
        this.dateEmbauche = dateEmbauche;
    }

    public int getEchelon() {
        return echelon;
    }

    public double getBase() {
        return base;
    }

    public double calculerSalaireBrut(){
        return(this.base * this.nbHeure + 100);
    }

    public double calculerSalaireNet(){
        return(this.calculerSalaireBrut()*0.8);
    }

    @Override
    public String toString() {
        return "Employe{" +
                "Numero securite social :'" + this.numeroSecuriteSocial + '\'' +
                ", nom :'" + this.nom + '\'' +
                ", prenom :'" + this.prenom + '\'' +
                ", echelon :" + this.echelon +
                ", Salaire brut :" + this.calculerSalaireBrut() +
                ", Salaire net :" + this.calculerSalaireNet() +
                '}';
    }

    public double getNbHeure() {
        return nbHeure;
    }
}
