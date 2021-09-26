import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Employe extends Personne {

    private float salaire;
    private LocalDate dateEmbauche;

    protected Employe(Personne pPersonne, float salaire) {
        super(pPersonne.getNom(),pPersonne.getPrenom(),pPersonne.getDateNaissance(),pPersonne.getAdresse());
        this.salaire = salaire;
        dateEmbauche = LocalDate.now();
    }

    protected Employe(Employe pEmploye) {
        super(pEmploye.getNom(),pEmploye.getPrenom(),pEmploye.getDateNaissance(),pEmploye.getAdresse());
        this.salaire = pEmploye.salaire;
        dateEmbauche = LocalDate.now();
    }

    public static Employe createEmploye(Personne pPersonne, float salaire) {
        // Verification age //
        Employe result;
        LocalDate currentDate = LocalDate.now();
        LocalDate dateNaissanceMinimale = currentDate.minus(16,ChronoUnit.YEARS);
        LocalDate dateNaissanceMaximale = currentDate.minus(65,ChronoUnit.YEARS);
        if (pPersonne.getDateNaissance().isBefore(dateNaissanceMinimale) || pPersonne.getDateNaissance().isEqual(dateNaissanceMinimale) && pPersonne.getDateNaissance().isAfter(dateNaissanceMaximale) || pPersonne.getDateNaissance().isEqual(dateNaissanceMaximale)) {
            result = new Employe(pPersonne, salaire);
        } else {
            result = null;
        }
        return result;
    }

    public float getSalaire() {
        return salaire;
    }

    public void augmenterLeSalaire(float pourcentageAugmentation) {
        if (pourcentageAugmentation > 0) {
            this.salaire *= ((pourcentageAugmentation / 100) + 1);
        }
    }

    public int calculAnnuite() {
        LocalDate currentDate = LocalDate.now();
        return (dateEmbauche.getYear() - currentDate.getYear()) + 1;
    }
}
