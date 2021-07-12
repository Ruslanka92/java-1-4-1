public class BonusMilesService {
    public int calculate(int cost) {
        int miles;
        int bonus = 20;
        miles = cost / bonus;
        return miles;
    }
}
