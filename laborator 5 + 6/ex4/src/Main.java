public class Main {
    public static void main(String[] args) {
        Square square = new Square("2", "3");
        System.out.println(square.getLength());
        System.out.println(square.getWidth());

        SquareRecord squareRecord = new SquareRecord("2", "3");
        System.out.println(squareRecord.length());
        System.out.println(squareRecord.width());
    }
}
