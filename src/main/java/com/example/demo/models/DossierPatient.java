package com.example.demo.models;

import java.util.List;

public class DossierPatient  {
    private int nemeroDossier;
    private Patient patient ;
    private static int nbDossier=0;
    private List<BilanOrt> bilanOrt ;//le dossier de patient contient une liste de bilans orthophoniques

    //le dossier de patient contient une liste de rendez-vous
    private List<RendezVous> rendezVous ;

    private List<Fichesuivi> fichesuivis  ; //le dossier de patient contient une liste de fiches de suivi

    public DossierPatient(Patient patient){
        nbDossier++;
        this.nemeroDossier=nbDossier;
        this.patient=patient;

    }
  public boolean ajouterBilan(BilanOrt bilan){

        return bilanOrt.add(bilan);


}
public boolean ajouterRendezVous(RendezVous rdv){

        return rendezVous.add(rdv);
}
 public boolean ajouterFiche(Fichesuivi fiche){
        return fichesuivis.add(fiche);
 }

}
