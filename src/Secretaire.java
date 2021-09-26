import java.util.ArrayList;

public class Secretaire extends Employe {

    ArrayList<Manager> pManagers = new ArrayList<Manager>();

    public Secretaire(Employe pEmploye) {
        super(pEmploye);
    }

    public static Secretaire createSecretaire(Personne pPersonne, float salaire) {
        Employe flag = Employe.createEmploye(pPersonne, salaire);
        Secretaire new_secretaire = null;
        if (flag != null) {
            new_secretaire = new Secretaire(flag);
        }
        return new_secretaire;
    }

    public void addManager(Manager pManager) {
        if (pManagers.size() < 5) {
            pManagers.add(pManager);
        }
    }

    // public String [] getManagersNames() {
    //     String [] res = new String[5];
    //     int pManagersSize = pManagers.size();
    //     for (int i = 0; i < pManagersSize; i++) {
    //         res[i] = pManagers.get(i).getNom();
    //     }
    //     return res;
    // }

    public void removeManager(Manager pManager) {
        pManagers.remove(pManager);
    }

    public void augmenterLeSalaire(float pourcentageAugmentation) {
        super.augmenterLeSalaire((float)(pourcentageAugmentation + (0.1*pManagers.size())));
    }


}
