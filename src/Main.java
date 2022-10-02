public class Main {
    public static void main(String[] args) {
        var WeightOfTheFirstFighter = 78.2;
        var WeightOfTheSecondFighter = 82.7;
        var TotalWeight = WeightOfTheFirstFighter + WeightOfTheSecondFighter;
        System.out.println("Общий вес двух бойцов " + TotalWeight + " кг!");
        var DifferenceWeight = WeightOfTheSecondFighter - WeightOfTheFirstFighter;
        System.out.println("Второй боец весит больше первого на " + DifferenceWeight + " кг!");
        var DifferenceWeightTwo = WeightOfTheSecondFighter % WeightOfTheFirstFighter;
        System.out.println("Первый боец весит меньше второго на " + DifferenceWeightTwo + " кг!");


    }
}
