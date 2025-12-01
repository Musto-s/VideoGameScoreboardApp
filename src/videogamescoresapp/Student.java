/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package videogamescoresapp;

/**
 *
 * @author olcan
 */
public class Student {

    private static final int NUMBER_OF_GAMES = 10;
    private String id;
    private String name;
    private int[] scores;

    // constructor
    public Student() {
        this.id = "";
        this.name = "";
        this.scores = new int[NUMBER_OF_GAMES];
    }

    // all arfument constructor
    public Student(String id, String n, int[] s) {
        this.id = id;
        this.name = n;
        this.scores = new int[NUMBER_OF_GAMES];
        for (int i = 0; i < this.scores.length; i++) {
            this.scores[i] = s[i];
        }
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int[] getScores() {
        return this.scores;
    }
    // setters

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScores(int[] scores) {
        this.scores = scores;
    }

    public int getTotal() {
        int total = 0;
        for (int i = 0; i < this.scores.length; i++) {
            total += this.scores[i];

        }
        return total;
    }

    public double getAverage() {
        double average = 0;
        int total = 0;
        for (int i = 0; i < this.scores.length; i++) {
            total += this.scores[i];

        }
        average = (double) total / this.scores.length;
        return average;

    }

    public String toDataLine(Student stu) {
        String str = "";
        String idd = stu.getId();
        String nme = stu.getName();
        String scc = "";
        int[] scArr = new int[10];
        for (int i = 0; i < stu.getScores().length; i++) {
            if (i == 9) {
                scc = scc + stu.getScores()[i];
            } else {
                scc = scc + stu.getScores()[i] + " , ";
            }
        }
        str = String.format("%s , %s , %s", idd, nme, scc);
        return str;
    }

    public static Student fromDataLine(String line) {
        String[] parts = line.split(",");
        int[] scores = new int[10];
        String str = "";
        for (int i = 2; i < parts.length; i++) {
            str = parts[i].trim();
            scores[i - 2] = Integer.parseInt(str);
        }

        Student myStu = new Student(parts[0], parts[1], scores);
        return myStu;
    }

    public boolean equals(Student stu) {
        boolean check = false;
        if (this.getId().equals(stu.getId())
                && this.getName().equals(stu.getName())
                && this.getScores() == stu.getScores());

        return check;
    }

    public String toString() {
        String result = this.getId() + " - " + this.getName() + "[";
        for (int i = 0; i < this.scores.length; i++) {
            result = result + this.scores[i] + ",";
        }
        result = result + "]";
        return result;

    }

    public String scoresToString() {
        String result = "[";
        for (int i = 0; i < this.scores.length; i++) {
            result = result + this.scores[i] + ",";
        }
        result = result + "]";
        return result;
    }

}
