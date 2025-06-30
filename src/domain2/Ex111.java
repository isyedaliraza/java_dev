package domain2;

public class Ex111 {
    public static void main(String[] args) {
        int piecesOfGold = 10;
        piecesOfGold += 2;
        piecesOfGold *= 3;
        piecesOfGold /= 2;
        piecesOfGold -= 2;
        piecesOfGold %= 6;

        System.out.println(String.format("We're left with %d pieces of Gold", piecesOfGold));
    }
}
