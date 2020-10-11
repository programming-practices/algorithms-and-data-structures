package data_structures.recursion_data_structures.laboratory_work;

import org.junit.Test;

import static data_structures.recursion_data_structures.a1.Node_Operations.genRec;
import static data_structures.recursion_data_structures.a1.Node_Operations.toStringRec;
import static data_structures.recursion_data_structures.laboratory_work.a1.NodeUtils_LaboratoryWork.removeInPosition;
import static org.junit.Assert.assertEquals;

public class NodeUtils_LaboratoryWorkTest {

    @Test
    public void addLastTest (){
//        assertEquals(toStringRec(genRec(0)), toStringRec(addLast(null, 0)));
//        assertEquals(toStringRec(genRec(1, 0)), toStringRec(addLast(genRec(1), 0)));
//        assertEquals(toStringRec(genRec(1, 2,  0)), toStringRec(addLast(genRec(1, 2), 0)));
//        assertEquals(toStringRec(genRec(1, 2, 3, 0)), toStringRec(addLast(genRec(1, 2, 3), 0)));
//        assertEquals(toStringRec(genRec(1, 2, 3, 4, 0)), toStringRec(addLast(genRec(1, 2, 3, 4), 0)));
//        assertEquals(toStringRec(genRec(1, 2, 3, 4, 5, 0)), toStringRec(addLast(genRec(1, 2, 3, 4, 5), 0)));
    }

    @Test
    public void insertInPositionTest() {
//        assertEquals(toStringRec(genRec(0,1)), toStringRec(insertInPosition(genRec(1), 0, 0)));

//        assertEquals(toStringRec(genRec(0,1,2)), toStringRec(insertInPosition(genRec(1,2), 0, 0)));
//        assertEquals(toStringRec(genRec(1,0,2)), toStringRec(insertInPosition(genRec(1,2), 1, 0)));

//        assertEquals(toStringRec(genRec(0,1,2,3)), toStringRec(insertInPosition(genRec(1,2,3), 0, 0)));
//        assertEquals(toStringRec(genRec(1,0,2,3)), toStringRec(insertInPosition(genRec(1,2,3), 1, 0)));
//        assertEquals(toStringRec(genRec(1,2,0,3)), toStringRec(insertInPosition(genRec(1,2,3), 2, 0)));

//        assertEquals(toStringRec(genRec(0,1,2,3,4)), toStringRec(insertInPosition(genRec(1,2,3,4), 0, 0)));
//        assertEquals(toStringRec(genRec(1,0,2,3,4)), toStringRec(insertInPosition(genRec(1,2,3,4), 1, 0)));
//        assertEquals(toStringRec(genRec(1,2,0,3,4)), toStringRec(insertInPosition(genRec(1,2,3,4), 2, 0)));
//        assertEquals(toStringRec(genRec(1,2,3,0,4)), toStringRec(insertInPosition(genRec(1,2,3,4), 3, 0)));

//        assertEquals(toStringRec(genRec(0,1,2,3,4,5)), toStringRec(insertInPosition(genRec(1,2,3,4,5), 0, 0)));
//        assertEquals(toStringRec(genRec(1,0,2,3,4,5)), toStringRec(insertInPosition(genRec(1,2,3,4,5), 1, 0)));
//        assertEquals(toStringRec(genRec(1,2,0,3,4,5)), toStringRec(insertInPosition(genRec(1,2,3,4,5), 2, 0)));
//        assertEquals(toStringRec(genRec(1,2,3,0,4,5)), toStringRec(insertInPosition(genRec(1,2,3,4,5), 3, 0)));
//        assertEquals(toStringRec(genRec(1,2,3,4,0,5)), toStringRec(insertInPosition(genRec(1,2,3,4,5), 4, 0)));
    }

    public void removeLastTest (){
//        assertEquals(toStringRec(null), toStringRec(removeLast(genRec(1))));
//        assertEquals(toStringRec(genRec(1)), toStringRec(removeLast(genRec(1, 2))));
//        assertEquals(toStringRec(genRec(1, 2)), toStringRec(removeLast(genRec(1, 2, 3))));
//        assertEquals(toStringRec(genRec(1, 2, 3)), toStringRec(removeLast(genRec(1, 2, 3, 4))));
//        assertEquals(toStringRec(genRec(1, 2, 3, 4)), toStringRec(removeLast(genRec(1, 2, 3, 4, 5))));
    }

    public void removeInPositionTest (){
        assertEquals(toStringRec(null), toStringRec(removeInPosition(genRec(1), 0)));

        assertEquals(toStringRec(genRec(2)), toStringRec(removeInPosition(genRec(1,2), 0)));
        assertEquals(toStringRec(genRec(1)), toStringRec(removeInPosition(genRec(1,2), 1)));

        assertEquals(toStringRec(genRec(2,3)), toStringRec(removeInPosition(genRec(1,2,3), 0)));
        assertEquals(toStringRec(genRec(1,3)), toStringRec(removeInPosition(genRec(1,2,3), 1)));
        assertEquals(toStringRec(genRec(1,2)), toStringRec(removeInPosition(genRec(1,2,3), 2)));

        assertEquals(toStringRec(genRec(2,3,4)), toStringRec(removeInPosition(genRec(1,2,3,4), 0)));
        assertEquals(toStringRec(genRec(1,3,4)), toStringRec(removeInPosition(genRec(1,2,3,4), 1)));
        assertEquals(toStringRec(genRec(1,2,4)), toStringRec(removeInPosition(genRec(1,2,3,4), 2)));
        assertEquals(toStringRec(genRec(1,2,3)), toStringRec(removeInPosition(genRec(1,2,3,4), 3)));

        assertEquals(toStringRec(genRec(2,3,4,5)), toStringRec(removeInPosition(genRec(1,2,3,4,5), 0)));
        assertEquals(toStringRec(genRec(1,3,4,5)), toStringRec(removeInPosition(genRec(1,2,3,4,5), 1)));
        assertEquals(toStringRec(genRec(1,2,4,5)), toStringRec(removeInPosition(genRec(1,2,3,4,5), 2)));
        assertEquals(toStringRec(genRec(1,2,3,5)), toStringRec(removeInPosition(genRec(1,2,3,4,5), 3)));
        assertEquals(toStringRec(genRec(1,2,3,4)), toStringRec(removeInPosition(genRec(1,2,3,4,5), 4)));
    }
}