public class BonusMilesService {
    public int calculate(int cost) {
        int bonusstep = 20;
        int miles = cost / bonusstep;
        return miles;
    }
}