package np.edu.scst.classnobject;
public class MarvelChar {
    public static void main(String[] args) {
        Marvel ironMan = new Marvel();
        ironMan.characterName= " Tony Stark";
        ironMan.avengers();
        System.out.println("Name:"+  ironMan.characterName);
        Marvel captainAmerica = new Marvel();
        captainAmerica.characterName= "SteveRogers";
        captainAmerica.avengers();
        System.out.println("Name"+ captainAmerica.characterName);
    }
    
}
