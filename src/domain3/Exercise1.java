package domain3;

public class Exercise1 {
    public static void main(String[] args) {
        byte[] player1Cards = { 10, 6, 8, 9, 7, 12, 7 };
        byte player1Score = 0;
        byte[] player2Cards = { 7, 6, 9, 5, 2, 8, 11 };
        byte player2Score = 0;

        System.out.println("****************************Play Card Busters!!!****************************");
        for (byte round = 0; round < player1Cards.length; round++) {
            System.out.format("Round No: %d- ", round + 1);
            if (player1Cards[round] == player2Cards[round]) {
                System.out.format("Tie! %d ties with %d%n",
                        player1Cards[round],
                        player2Cards[round]);
            } else if (player1Cards[round] > player2Cards[round]) {
                System.out.format("Player 1 wins the round: %d beats %d%n",
                        player1Cards[round],
                        player2Cards[round]);
                player1Score++;
            } else {
                System.out.format("Player 2 wins the round: %d beats %d%n",
                        player2Cards[round],
                        player1Cards[round]);
                player2Score++;
            }
        }

        if (player1Score == player2Score) {
            System.out.format("Tie! Player 1 won %d rounds and Player 2 won %d rounds%n",
                    player1Score,
                    player2Score);
        } else if (player1Score > player2Score) {
            System.out.format("Player One wins!! He won %d rounds beating Player Two who won %d rounds!%n",
                    player1Score,
                    player2Score);
        } else {
            System.out.format("Player Two wins!! He won %d rounds beating Player One who won %d rounds!%n",
                    player2Score,
                    player1Score);
        }

        System.out.println("Goodbye!");
    }
}