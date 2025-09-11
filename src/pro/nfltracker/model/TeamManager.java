package pro.nfltracker.model;

public class TeamManager {
    private static final String[] TEAMS = {
            "Arizona Cardinals", "Atlanta Falcons", "Baltimore Ravens",
            "Buffalo Bills", "Carolina Panthers", "Chicago Bears",
            "Cincinnati Bengals", "Cleveland Browns", "Dallas Cowboys",
            "Denver Broncos", "Detroit Lions", "Green Bay Packers",
            "Houston Texans", "Indianapolis Colts", "Jacksonville Jaguars",
            "Kansas City Chiefs", "Las Vegas Raiders", "Los Angeles Chargers",
            "Los Angeles Rams", "Miami Dolphins", "Minnesota Vikings",
            "New England Patriots", "New Orleans Saints", "New York Giants",
            "New York Jets", "Philadelphia Eagles", "Pittsburgh Steelers",
            "San Francisco 49ers", "Seattle Seahawks", "Tampa Bay Buccaneers",
            "Tennessee Titans", "Washington Commanders"
    };

    public static void displayTeams() {
        System.out.println("\n================= NFL TEAMS =================");
        for (int i = 0; i < TEAMS.length; i++) {
            System.out.printf("%2d) %-25s", i + 1, TEAMS[i]);
            if ((i + 1) % 2 == 0) System.out.println(); // 2 columns
        }
        System.out.println("\n=============================================\n");
    }

    public static void selectTeam(int index) {
        if (index < 1 || index > TEAMS.length) {
            System.out.println("Invalid team number.");
        } else {
            System.out.println("You selected: " + TEAMS[index - 1]);
            // TODO: Hook the stats later
        }
    }

    public static String getTeamName(int index) {
        if (index < 1 || index > TEAMS.length) {
            return "Unknown Team"; // fallback
        }
        return TEAMS[index - 1];
    }
}
