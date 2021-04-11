import java.util.Random;
import java.util.Scanner;

public class MadLibsGame {
    public static Scanner scan = new Scanner(System.in);
    Random randomNumber = new Random();
    private String story;
    
    //fields for story
    private String noun1;
    private String noun2;
    private String noun3;

    private String adjective1;
    private String adjective2;
    private String adjective3;

    private String verb1;
    private String verb2;
    private String verb3;

    private String adverb1;
    private String adverb2;
    
    //getters and setters for fields
    public String getNoun1() {
        return noun1;
    }
    public void setNoun1(String noun1) {
        this.noun1 = noun1;
    }

    public String getNoun2() {
        return noun2;
    }
    public void setNoun2(String noun2) {
        this.noun2 = noun2;
    }

    public String getNoun3() {
        return noun3;
    }
    public void setNoun3(String noun3) {
        this.noun3 = noun3;
    }

    public String getAdjective1() {
        return adjective1;
    }
    public void setAdjective1(String adjective1) {
        this.adjective1 = adjective1;
    }

    public String getAdjective2() {
        return adjective2;
    }
    public void setAdjective2(String adjective2) {
        this.adjective2 = adjective2;
    }

    public String getAdjective3() {
        return adjective3;
    }
    public void setAdjective3(String adjective3) {
        this.adjective3 = adjective3;
    }

    public String getVerb1() {
        return verb1;
    }
    public void setVerb1(String verb1) {
        this.verb1 = verb1;
    }

    public String getVerb2() {
        return verb2;
    }
    public void setVerb2(String verb2) {
        this.verb2 = verb2;
    }

    public String getVerb3() {
        return verb3;
    }
    public void setVerb3(String verb3) {
        this.verb3 = verb3;
    }

    public String getAdverb1() {
        return adverb1;
    }
    public void setAdverb1(String adverb1) {
        this.adverb1 = adverb1;
    }

    public String getAdverb2() {
        return adverb2;
    }
    public void setAdverb2(String adverb2) {
        this.adverb2 = adverb2;
    }

    //methods that give instructions and inputs from player
    public void enterAdjective1 () {
        System.out.println("Please enter an adjective!");
        setAdjective1(scan.nextLine());
    }
    public void enterNoun1 () {
        System.out.println("I need a noun!");
        setNoun1(scan.nextLine());
    }
    public void enterAdjective2 () {
        System.out.println("Please enter another adjective!");
        setAdjective2(scan.nextLine());
    }
    public void enterAdjective3 () {
        System.out.println("One more adjective!");
        setAdjective3(scan.nextLine());
    }
    public void enterNoun2 () {
        System.out.println("I need another noun!");
        setNoun2(scan.nextLine());
    }
    public void enterNoun3 () {
        System.out.println("Another noun...!   umm.. Pleaase?");
        setNoun3(scan.nextLine());
    }
    public void enterVerb1 () {
        System.out.println("This time a Verb.");
        setVerb1(scan.nextLine());
    }
    public void enterVerb2 () {
        System.out.println("This is getting long isn't it, another verb please..");
        setVerb2(scan.nextLine());
    }
    public void enterVerb3 () {
        System.out.println("A verb, ...again!");
        setVerb3(scan.nextLine());
    }
    public void enterAdverb1() {
        System.out.println("And last an adverb this time!");
        setAdverb1(scan.nextLine());
    }
    public void enterAdverb2() {
        System.out.println("Oh well still one left. Another adverb please!");
        setAdverb2(scan.nextLine());
    }
    
    
    public void createStory() {//creating two stories, out of which one is randomly chosen
        int storyNumber = Math.abs(randomNumber.nextInt()) % 2;
        if(storyNumber == 0) {
            story = "Today I went to the zoo. I saw a(n) " +
                    getAdjective1() + " " + getNoun1() + " jumping up and down in its tree.\n" +
                    "He " + getVerb1() + " " + getAdverb1() +
                    " through the large tunnel that led to its " + getAdjective2() + " " + getNoun2() +
                    ".\nI got some peanuts and passed them through the cage to a gigantic gray " +
                    getNoun3() + " towering above my head. Feeding that animal made me hungry.\n" +
                    "I went to get a " + getAdjective3() + " scoop of ice cream. It filled my stomach. " +
                    "Afterwards I had to " + getVerb2() + " " + getAdverb2() + " to catch our bus.\n" +
                    "When I got home I "+ getVerb3() + " my mom for a " + getAdjective3() +
                    " day at the zoo. ";
        } else {
            story = "I walk through the color jungle. I take out my " + getAdjective1() +
                    " canteen. There's a " + getAdjective2() + " parrot with a " + getAdjective3() + " " +
                    getNoun1() + " in his mouth right there in front of me in the " +
                    getAdjective1() + " trees!\nI gaze at his " + getAdjective3() +" "+
                    getNoun2() + ".\nA sudden sound awakes me from my daydream! A panther’s " +
                    getVerb1() + " in front of my head!\nI " + getVerb2() + " his " +
                    getAdjective2() + " breath. I remember I have a packet of " + getNoun3() +
                    " that makes go into a deep slumber!\nI " + getVerb3() +
                    " it away from me in front of the " + getNoun2() + ". Yes he's eating it!\nI"
                    + getVerb2() + " away through the " + getAdjective3() +
                    " jungle. I meet my parents at the tent. Phew! It’s been an exciting day in the jungle. ";
        }
        setStory(story);
    }
    //getter and setters for story
    public void setStory(String story) {
        this.story = story;
    }
    public String getStory() {
        return this.story;
    }
    
    public void startGame() {//calls the user for input
        System.out.println("Welcome to My Mad Libs game! Lets Start!!");
        enterAdjective1();
        enterAdjective2();
        enterAdjective3();
        enterNoun1();
        enterNoun2();
        enterNoun3();
        enterVerb1();
        enterVerb2();
        enterVerb3();
        enterAdverb1();
        enterAdverb2();
        createStory();
        
    }
    public static void main(String[] args) {
	// write your code here
        MadLibsGame game = new MadLibsGame();
        game.startGame();
        System.out.println(game.getStory());
        scan.close(); //end program
    }
}
