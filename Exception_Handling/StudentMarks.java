package Exception_Handling;

import java.util.Scanner;

public class StudentMarks {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            for (int i = 1; i <= 2; i++) {

                System.out.println("Enter Student " + i + " Name:");
                String name = sc.nextLine();

                int total = 0;

                System.out.println("Enter marks in 3 subjects:");

                for (int j = 1; j <= 3; j++) {

                    int mark = Integer.parseInt(sc.nextLine());

                    if (mark < 0)
                        throw new NegativeValuesException("Negative values are not allowed");

                    if (mark > 100)
                        throw new OutOfRangeException("Marks should be in the range 0-100");

                    total += mark;
                }

                double avg = total / 3.0;
                System.out.println(name + " Average = " + avg);
            }

        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException");
        } catch (NegativeValuesException e) {
            System.out.println(e.getMessage());
        } catch (OutOfRangeException e) {
            System.out.println(e.getMessage());
        }
    }
}