package steam.microcatalogue.Entities;

import javax.persistence.*;

@Entity
public class Catalogue {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(unique=true)
    private String nomJeu;
    private String dateJeu;
    private String nomF;

    public long getId() {
        return id;
    }

    public String getNomJeu() {
        return nomJeu;
    }

    public void setNomJeu(String nomJeu) {
        this.nomJeu = nomJeu;
    }

    public String getDateJeu() {
        return dateJeu;
    }

    public void setDateJeu(String dateJeu) {
        this.dateJeu = dateJeu;
    }

    public String getNomF() {
        return nomF;
    }

    public void setNomF(String nomF) {
        this.nomF = nomF;
    }
}
