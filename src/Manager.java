public class Manager extends Employe {

    Secretaire pSecretaire;

    public Manager(Employe pEmploye, Secretaire pSecretaire) {
        super(pEmploye);
        this.pSecretaire = pSecretaire;
    }

    public static Manager createManager(Personne pPersonne, float salaire, Secretaire pSecretaire) {
        Employe flag = Employe.createEmploye(pPersonne, salaire);
        Manager new_manager = null;
        if (flag != null) {
            new_manager = new Manager(flag, pSecretaire);
        }
        return new_manager;
    }

    public void setSecretaire(Secretaire pSecretaire) {
        this.pSecretaire = pSecretaire;
    }

    public void augmenterLeSalaire(float pourcentageAugmentation) {
        super.augmenterLeSalaire((float) (pourcentageAugmentation + (0.5*calculAnnuite())));
    }

}
