package data_structures.recursion_data_structures.laboratory_work.a2;

import org.junit.Test;

import static data_structures.recursion_data_structures.a1.Node_Operations.genRec;
import static org.junit.Assert.assertEquals;

public class IsGrowing_LaboratoryWorkTest {

    @Test
    public void checkIsGrowingTest() {

        assertEquals(true, IsGrowing_LaboratoryWork.checkIsGrowing(genRec(1, 2, 3, 4, 5)));
        assertEquals(true, IsGrowing_LaboratoryWork.checkIsGrowing(genRec(0, 2, 4, 5, 7, 10)));

        assertEquals(false, IsGrowing_LaboratoryWork.checkIsGrowing(genRec(1, 0, 2, 3, 4, 5)));
        assertEquals(false, IsGrowing_LaboratoryWork.checkIsGrowing(genRec(1, 2, 0, 3, 4, 5)));
        assertEquals(false, IsGrowing_LaboratoryWork.checkIsGrowing(genRec(1, 2, 3, 0, 4, 5)));
        assertEquals(false, IsGrowing_LaboratoryWork.checkIsGrowing(genRec(1, 2, 3, 4, 0, 5)));
        assertEquals(false, IsGrowing_LaboratoryWork.checkIsGrowing(genRec(1, 2, 3, 4, 5, 0)));
    }
}