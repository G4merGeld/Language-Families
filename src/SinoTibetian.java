public class SinoTibetian extends Language{

    public SinoTibetian(String name, int numSpeakers) {
        super(name, numSpeakers, "Asia", "subject-object-verb");
        if(this.name.contains("Chinese") || this.name.contains("chinese")){ //chinese sinotibetian languages have different wordorder
            this.wordOrder = "subject-verb-object";
        }
    }


}
