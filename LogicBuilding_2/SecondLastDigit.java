package LogicBuilding_2;

public class SecondLastDigit {
    public int getSecondLastDigit(int number) {
        number = Math.abs(number);

        if (number < 10)
            return -1;

        return (number / 10) % 10;
    }
}