package algorithms.a_star.a2.datastructures;

import algorithms.a_star.a2.ISearchNode;

public interface IClosedSet {

    public boolean contains(ISearchNode node);

    public void add(ISearchNode node);

    public ISearchNode min();

}
