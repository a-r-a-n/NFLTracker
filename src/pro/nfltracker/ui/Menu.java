package pro.nfltracker.ui;

import pro.nfltracker.model.TeamManager;
import java.util.Scanner;

public class Menu {
    private final Scanner sc = new Scanner(System.in);

    public void show() {
        int choice = -1;
        Headers.display(); // Print welcome header once

        while (choice != 0) {
            // ===== Global Main Menu =====
            System.out.println();
            System.out.println("      ==============  Main Menu  ==============");
            System.out.println("                   1. Display Teams");
            System.out.println("                   2. Select Team");
            System.out.println("                   0. Exit");
            System.out.println("      =========================================");
            System.out.print("      Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1 -> TeamManager.displayTeams();

                case 2 -> {
                    System.out.println("\n      ==== Select Team ====");
                    System.out.print("      Enter team index: ");
                    int teamIndex = sc.nextInt();
                    TeamManager.selectTeam(teamIndex);

                    // Once a team is selected, show team-specific menu
                    teamMenu(teamIndex);
                }

                case 0 -> System.out.println("      Goodbye!");

                default -> System.out.println("      Invalid choice. Try again.\n");
            }
        }
    }

    private void teamMenu(int teamIndex) {
        int teamChoice = -1;
        String teamName = TeamManager.getTeamName(teamIndex); // TODO: Implement getTeamName in TeamManager

        while (teamChoice != 0) {
            System.out.println();
            System.out.println("      ========== " + teamName + " Menu ==========");
            System.out.println("                   1. View Defensive Stats");
            System.out.println("                   2. View Offensive Stats");
            System.out.println("                   0. Back to Main Menu");
            System.out.println("      ========================================");
            System.out.print("      Enter your choice: ");

            teamChoice = sc.nextInt();

            switch (teamChoice) {
                case 1 -> defensiveMenu(teamName);
                case 2 -> offensiveMenu(teamName);
                case 0 -> System.out.println("      Returning to Main Menu...");
                default -> System.out.println("      Invalid choice. Try again.\n");
            }
        }
    }

    private void defensiveMenu(String teamName) {
        int defChoice = -1;

        while (defChoice != 0) {
            System.out.println();
            System.out.println("      ===== " + teamName + " Defensive Stats =====");
            System.out.println("                   1. View Tackles");
            System.out.println("                   2. View Interceptions");
            System.out.println("                   3. View Sacks");
            System.out.println("                   0. Back to Team Menu");
            System.out.println("      ========================================");
            System.out.print("      Enter your choice: ");

            defChoice = sc.nextInt();

            switch (defChoice) {
                case 1 -> System.out.println("      [TODO] Display tackles for " + teamName);
                case 2 -> System.out.println("      [TODO] Display interceptions for " + teamName);
                case 3 -> System.out.println("      [TODO] Display sacks for " + teamName);
                case 0 -> System.out.println("      Returning to Team Menu...");
                default -> System.out.println("      Invalid choice. Try again.\n");
            }
        }
    }

    private void offensiveMenu(String teamName) {
        int offChoice = -1;

        while (offChoice != 0) {
            System.out.println();
            System.out.println("      ===== " + teamName + " Offensive Stats =====");
            System.out.println("                   1. View Passing Yards");
            System.out.println("                   2. View Rushing Yards");
            System.out.println("                   3. View Touchdowns");
            System.out.println("                   0. Back to Team Menu");
            System.out.println("      ========================================");
            System.out.print("      Enter your choice: ");

            offChoice = sc.nextInt();

            switch (offChoice) {
                case 1 -> System.out.println("      [TODO] Display passing yards for " + teamName);
                case 2 -> System.out.println("      [TODO] Display rushing yards for " + teamName);
                case 3 -> System.out.println("      [TODO] Display touchdowns for " + teamName);
                case 0 -> System.out.println("      Returning to Team Menu...");
                default -> System.out.println("      Invalid choice. Try again.\n");
            }
        }
    }
}
