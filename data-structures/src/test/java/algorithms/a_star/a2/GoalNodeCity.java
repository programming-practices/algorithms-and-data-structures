package algorithms.a_star.a2;

/**
 * Test case from wikipedia
 * http://de.wikipedia.org/wiki/A*-Algorithmus
 */

public class GoalNodeCity implements IGoalNode {
    private String name;
    public GoalNodeCity(String name) {
        this.name = name;
    }
    public boolean inGoal(ISearchNode other) {
         if(other instanceof SearchNodeCity) {
            SearchNodeCity otherNode = (SearchNodeCity) other;
            return (this.name == otherNode.getName());
        }
        return false;
    }
}