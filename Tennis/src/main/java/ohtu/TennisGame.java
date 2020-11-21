package ohtu;

public class TennisGame {
    
    private int player1Score = 0;
    private int player2Score = 0;
    private String player1Name;
    private String player2Name;

    public TennisGame(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public void wonPoint(String playerName) {
        if (playerName == "player1")
            player1Score += 1;
        else
            player2Score += 1;
    }

    public String getScore() {

        if (player1Score>=4 || player2Score>=4){
            if (player1Score == player2Score) {
                return ("Deuce");
            } else {
                if (player1Score > player2Score && (player1Score-player2Score) == 1) {
                    return ("Advantage " + player1Name);
                } else if (player1Score < player2Score && (player2Score-player1Score) == 1) {
                    return ("Advantage " + player2Name);   
                } else if (player1Score > player2Score && (player1Score-player2Score) >= 2) {
                    return ("Win for " + player1Name);                                         
                } else {
                    return ("Win for " + player2Name);
                }
            }

        } else if (player1Score == player2Score) {
            return (printScore(player1Score) + "-All");
        } else {
            return (printScore(player1Score) + "-" + printScore(player2Score));
        }

    }
    public String printScore(int score) {
        if (score == 0) {
            return("Love");
        } else if (score == 1) {
            return("Fifteen");
        } else if (score == 2) {
            return("Thirty");
        } else if (score == 3) {
            return("Forty");
        } else {
            return("Win for ");
        }
    }
}