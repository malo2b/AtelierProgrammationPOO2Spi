public class App {
    public static void main(String[] args) throws Exception {
        Personne personne1 = new Personne("Girard", "Malo", 29, 11, 2001, 204, "Lotissement Bevinco", "20620", "Biguglia");
        Personne personne2 = new Personne("Jean-pierre", "Thomas", 21, 03, 2001, 221, "Lotissement Bevinco", "20620", "Biguglia");

        // System.out.println(Personne.getNbrPersonnes());
        // System.out.println(Personne.plusAgee(personne2,personne1));
        // System.out.println(personne2.plusAgeeQue(personne1));
        // System.out.println(personne1.equals(malo));
        Employe francois = Employe.createEmploye(new Personne("Focardi", "Francois", 29, 05, 2001, 52, "rue Saint Bouazza", "20200", "Lieu dit la zone"), 18000);
        Manager malo = Manager.createManager(new Personne("Girard", "Malo", 29, 11, 2001, 204, "Lotissement Bevinco", "20620", "Biguglia"), 18000,null);
        System.out.println(francois.getSalaire());
        System.out.println(malo.getSalaire());
        francois.augmenterLeSalaire(10);
        malo.augmenterLeSalaire(10);
        System.out.println(francois.getSalaire());
        System.out.println(malo.getSalaire());
    }
}
