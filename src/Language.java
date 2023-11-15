public class Language { //parent class
    protected String name;
    protected int numSpeakers;
    protected String regionsSpoken;
    protected String wordOrder;

    public Language(String name, int numSpeakers, String regionsSpoken, String wordOrder){
        this.name = name;
        this.numSpeakers = numSpeakers;
        this.regionsSpoken = regionsSpoken;
        this.wordOrder = wordOrder;
    }



    public void getInfo(){
        System.out.println(this.name + " is spoken by " + this.numSpeakers + " mainly in " + this.regionsSpoken + ".");
        System.out.println("The language follows the word order: " + this.wordOrder);
    }
    public static void main(String[] args) {
        //Language deutsch = new Language("Deutsch", 1000, "Schweiz", "SVO");
        //deutsch.getInfo();
    }
}
