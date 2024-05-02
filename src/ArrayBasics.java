public class ArrayBasics {
    public static void main(String[] args) {
        String[] favNbaTeams = new String[5];
        favNbaTeams[0] = "Houston Rockets";
        favNbaTeams[1] = "Dallas Mavericks";
        favNbaTeams[2] = "Los Angeles Lakers";

        System.out.println("Estos son mis equipos favoritos de la NBA:");
        for(String i: favNbaTeams){
            System.out.println(i);
        }

//        System.out.println("Equipos favoritos:" + favNbaTeams);
    }
}
