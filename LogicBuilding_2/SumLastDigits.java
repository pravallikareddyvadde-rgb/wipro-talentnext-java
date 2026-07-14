package LogicBuilding_2;

public class SumLastDigits {
    public int addLastDigits(int input1, int input2) {
        int last1 = Math.abs(input1 % 10);
        int last2 = Math.abs(input2 % 10);

        return last1 + last2;
    }
}