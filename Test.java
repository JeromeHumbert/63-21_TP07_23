public class Test {


    private static void chargerDonneesEtudiants(String path){
        // A développer
    }

    private static void chargerDonneesNotes(String path){
        // A développer
    }

    private static void afficheMoyenneEtudiant(){
        // A développer
    }

    private static void afficheNoteEtudiant(Etudiant e){
        // A développer
    }

    private static void afficheMoyenneParMatiere(){
        // A développer

    }

    public static void main(String[] args) {
        String localDir = System.getProperty("user.dir");
        if(System.getProperty("os.name").contains("Windows")){
            chargerDonneesEtudiants(localDir + "\\src\\etudiants.csv");
            chargerDonneesNotes(localDir + "\\src\\notes.csv");
        }else{
            chargerDonneesEtudiants(localDir + "/src/etudiants.csv");
            chargerDonneesNotes(localDir + "/src/notes.csv");
        }

        afficheMoyenneEtudiant();
        System.out.println();
        afficheNoteEtudiant(new Etudiant("Cerizo","Cecilia"));
        System.out.println();
        afficheMoyenneParMatiere();
    }
}
