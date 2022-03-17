using micro_fournisseur.Models;

namespace micro_fournisseur.Services
{
    public interface IFournisseurService
    {
        public Fournisseur InscrireFournisseur(Fournisseur fournisseur);
        public void ConnexionFournisseur(string NomFournisseur, string MdpFournisseur);
        public void DeconnexionFournisseur(string NomFournisseur, string MdpFournisseur);
        public Jeu AjouterJeu(Jeu jeu);
        public Jeu ? GetJeuById(string id);
        public List<Jeu> GetJeuxFournisseur(string NomFournisseur);
        public FournisseurDTO ? GetFournisseurById(string id);
        public List<FournisseurDTO> GetFournisseurs();
    }
}