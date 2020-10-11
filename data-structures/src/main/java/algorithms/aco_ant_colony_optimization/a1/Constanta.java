package algorithms.aco_ant_colony_optimization.a1;

public class Constanta {
    int N_MIN = 3;
    int N_MAX = 30;
    int ALPHA = 1;
    int BETTA = 3;
    int T_MAX = 100;
    int M = 20;
    int Q = 100;
    double RHO = 0.5;
}

enum Constants{
    N_MIN(3), N_MAX(30), ALPHA(1), BETTA(3), T_MAX(100), M(20), Q(100), RHO(0.5);

    private int valueInt;
    private double valueDouble;

    private Constants(int value) {
        this.valueInt = value;
    }

    private Constants(double value) {
        this.valueDouble = value;
    }

}
