/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package videogamescoresapp;

import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author olcan
 */
public class VideoGameScoresApp {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
//         Create Scoreboard 

        Scoreboard myScoreboard = new Scoreboard();
        Game myGame = new Game();
         int choice;
        myScoreboard.loadGames("C:\\Users\\olcan\\OneDrive\\Documents\\NetBeansProjects\\VideoGameScoresApp\\src\\videogamescoresapp\\games.txt");
        myScoreboard.loadScores("C:\\Users\\olcan\\OneDrive\\Documents\\NetBeansProjects\\VideoGameScoresApp\\src\\videogamescoresapp\\scores.txt");
//o Load data files on start 

//o Show menu loop and collect user’s choice with Scanner
        do {
            printMenu();
            choice = Utilities.getUserChoice("Enter user choice");
        } while ((choice < 0) || (choice > 8));

        switch (choice) {
            case 0:
                System.exit(0);
                break;
            case 1:

                handleListGames(myScoreboard);
                break;
            case 2:
                handleListStudents();
                break;
            case 3:
                handleStudentReport();
                break;
            case 4:
                handleTopNforAgame();
                break;
            case 5:
                handleUpdateStudentScore();
                break;
            case 6:
                handleGameStats();
                break;
            case 7:
                handleAddNewStudent();
                break;
            case 8:
                handleSaveData();
                break;
        }
    }
//o Validate inputs (IDs exist, scores >= 0) 

//o Save on command or exit
    private static void printMenu() {
        System.out.println("=== Video game Scoreboard ===\n"
                + "1) List games\n"
                + "2) List students\n"
                + "3) Show a student's peport\n"
                + "4) Show top N for a game\n"
                + "5) Update a student's score\n"
                + "6) Game stats (min/max/avg)\n"
                + "7) Add a new student\n"
                + "8) Save data\n"
                + "0) Exit "
        );
    }

    public static void handleListGames(Scoreboard sb) {
        System.out.print("Handling list game choice");
        sb.listGames();

    }

    public static void handleListStudents() {
        System.out.print("Handling list student choice ");
    }

    public static void handleStudentReport() {
        System.out.print("Handling list student report");
    }

    public static void handleTopNforAgame() {
        System.out.print("Handling top N for a game");
    }

    public static void handleUpdateStudentScore() {
        System.out.print("Handling update student score choice");
    }

    public static void handleGameStats() {
        System.out.print("Handling game stats");
    }

    public static void handleAddNewStudent() {
        System.out.print("Handling new student choice");
    }

    public static void handleSaveData() {
        System.out.print("Handling save data choice");
    }

}
