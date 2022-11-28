import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Parallelepiped");
        int height = 0;
        int length = 0;
        int width = 0;
        while (true) {

            try {
                Scanner scanner = new Scanner(System.in);
                System.out.print("height: ");
                int scanHeight = scanner.nextInt();
                if (scanHeight > 20) {
                    throw new RuntimeException();
                } else if (scanHeight < 0) {
                    throw new Exception();
                } else {
                    height = scanHeight;
                }
            } catch (InputMismatchException e) {
                System.out.println("write only numbers!");
                System.out.println("\n-try again-");
                continue;
            } catch (RuntimeException e) {
                System.out.println("number must not exceed 20!");
                System.out.println("\n-try again-");
                continue;
            } catch (Exception e) {
                System.out.println("write only positive numbers!");
                System.out.println("\n-try again-");
                continue;
            }
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.print("length: ");
                int scanLength = scanner.nextInt();

                if (scanLength > 20) {
                    throw new RuntimeException();
                } else if (scanLength < 0) {
                    throw new Exception();
                } else {
                    length = scanLength;

                }
            } catch (InputMismatchException e) {
                System.out.println("write only numbers!");
                System.out.println("\n-try again-");
                continue;
            } catch (RuntimeException e) {
                System.out.println("number must not exceed 20!");
                System.out.println("\n-try again-");
                continue;
            } catch (Exception e) {
                System.out.println("write only positive numbers!");
                System.out.println("\n-try again-");
                continue;
            }
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.print("width: ");
                int scanWidth = scanner.nextInt();
                if (scanWidth > 20) {
                    throw new RuntimeException();
                } else if (scanWidth < 0) {
                    throw new Exception();
                } else {
                    width = scanWidth;
                }
            } catch (InputMismatchException e) {
                System.out.println("write only numbers!");
                System.out.println("\n-try again-");
                continue;
            } catch (RuntimeException e) {
                System.out.println("number must not exceed 20!");
                System.out.println("\n-try again-");
                continue;
            } catch (Exception e) {
                System.out.println("write only positive numbers!");
                System.out.println("\n-try again-");
                continue;
            }
            Parallelepiped parallelepiped = new Parallelepiped(height, length, width);
            System.out.println();
            System.out.println("area: " + parallelepiped.areaAble());
            System.out.println("volume: " + parallelepiped.volumeAble());
            System.out.println("_________________________");
            System.out.println();
        }
    }
}