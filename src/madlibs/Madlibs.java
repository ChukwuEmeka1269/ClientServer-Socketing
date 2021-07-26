package madlibs;

import java.util.Random;
import java.util.Scanner;

public class Madlibs {

    Scanner scanner = new Scanner(System.in);
    String story;
    String name;
    String adjective1;
    String adjective2;
    String noun1;
    String noun2;
    String noun3;
    String adverb;
    String randomNumber;
    Random random = new Random();



//Setters
    public void setStory(String story) {
        this.story = story;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAdjective1(String adjective1) {
        this.adjective1 = adjective1;
    }

    public void setAdjective2(String adjective2) {
        this.adjective2 = adjective2;
    }

    public void setNoun1(String noun1) {
        this.noun1 = noun1;
    }

    public void setNoun2(String noun2) {
        this.noun2 = noun2;
    }

    public void setNoun3(String noun3) {
        this.noun3 = noun3;
    }

    public void setAdverb(String adverb) {
        this.adverb = adverb;
    }

    public void setRandomNumber() {
        int num = Math.abs(random.nextInt()) % 100;
        int[] numberHolder = new int[3];
        for(int index = 0; index<numberHolder.length; index++){
            numberHolder[index] = num + index;
        }
        randomNumber = "not " + numberHolder[0] + ", not " + numberHolder[1] + " but " + numberHolder[2];
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    //Getters
    public String getStory() {
        return story;
    }

    public String getName() {
        return name;
    }

    public String getAdjective1() {
        return adjective1;
    }

    public String getAdjective2() {
        return adjective2;
    }

    public String getNoun1() {
        return noun1;
    }

    public String getNoun2() {
        return noun2;
    }

    public String getNoun3() {
        return noun3;
    }

    public String getAdverb() {
        return adverb;
    }

    public String getRandomNumber() {
        return randomNumber;
    }

    public Random getRandom() {
        return random;
    }

    private void printInstructions(){
        System.out.println("Welcome to the MadLibs game. Let us tell you a short story based on the words you choose." +
                " Start by giving us your name. ");
    }


    private void readInValuesFromUser(){
        setName(scanner.nextLine());

        System.out.println("Please give me a noun.");
        setNoun1(scanner.nextLine());

        System.out.println("Give me another noun");
        setNoun2(scanner.nextLine());

        System.out.println("Okay I promise this is the last noun I need");
        setNoun3(scanner.nextLine());

        System.out.println("Give me an adverb");
        setAdverb(scanner.nextLine());

        System.out.println("I'll need an adjective");
        setAdjective1(scanner.nextLine());

        System.out.println("Another adjective won't do no harm.");
        setAdjective2(scanner.nextLine());

        setRandomNumber();
    }

    public void play(){
        printInstructions();
        readInValuesFromUser();
        putStoryTogether();
        System.out.println(getStory());

    }


    private void putStoryTogether(){
        String story ;
        int num = Math.abs(random.nextInt()) % 2;
        if(num == 0) {
            story = "Amina and her best friend " + getName() + " went to shoprite Mall." +
                    " They saw a " + getNoun1() + " in a show at iMax, and ate a " +
                    getAdjective1() + " feast for dinner. The next day, " + getName() + " ran " + getAdverb() + " to meet Buhari in his " +
                    getNoun2() + " and then that night, Amina and " + getName() + " gazed at the " + getRandomNumber() +
                    " " + getAdjective2() + " fireworks shooting from the " + getNoun3() + ".";
        } else{
            story =  "Udoka and her frenemy " + getName() + " went to Lekki Conservation Center last week. They saw a huge " +
                    getNoun1() + " and a tiny little " + getNoun2() + ". That night,  they decided to climb " + getAdverb() +
                    " into the " + getNoun3() + " to get a closer look. The center was " + getAdjective1() + " but they didn't care." +
                    " Until " + getRandomNumber() + " " + getAdjective2() + " monkeys screamed at their faces, making Udoka and " +
                    getName() + " run all the way back home.";
        }
            setStory(story);


    }


    public static void main(String[] args) {
        Madlibs game = new Madlibs();
        game.play();





    }

}
