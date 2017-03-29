package CodingChallenge;

public class Student extends Person {
    private int[] testScores;
    private String firstName;
    private String lastName;
    private int id;
    private int[] scores;

        /*
        *   Class Constructor
        *
        *   @param firstName - A string denoting the Person's first name.
        *   @param lastName - A string denoting the Person's last name.
        *   @param id - An integer denoting the Person's ID number.
        *   @param scores - An array of integers denoting the Person's test scores.
        */

    public Student(String firstName, String lastName, int id, int[] scores) {
        super(firstName, lastName, id); //this conflicts with Person class from day 04
        this.scores = scores;
    }

    /*
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
    public char calculate() {
        double avg = ((double) java.util.stream.IntStream.of(scores).sum()) / scores.length;
        if (avg < 40) return 'T';
        if (avg < 55) return 'D';
        if (avg < 70) return 'P';
        if (avg < 80) return 'A';
        return avg < 90 ? 'E' : 'O';
    }

}
