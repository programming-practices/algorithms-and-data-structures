package data_structures.recursion_data_structures.laboratory_work.a2;

import data_structures.recursion_data_structures.a1.Node;
import data_structures.recursion_data_structures.a1.Node_Operations;

public class IsGrowing_LaboratoryWork {

    private static boolean result = false;

    public static boolean checkIsGrowing(Node tail) {
        if (tail != null && tail.getNext() != null) {
            result = tail.getValue() < tail.getNext().getValue();
            return result && checkIsGrowing(tail.getNext());
        } else {
            return result;
        }
    }
}


class Test {
    public static void main(String[] args) {
        Node tail1 = Node_Operations.genRec(1, 2, 3, 4, 5);
        Node tailA = Node_Operations.genRec(0, 2, 4, 5, 7, 10);
        Node tail2 = Node_Operations.genRec(1, 0, 2, 3, 4, 5);
        Node tail3 = Node_Operations.genRec(1, 2, 0, 3, 4, 5);
        Node tail4 = Node_Operations.genRec(1, 2, 3, 0, 4, 5);
        Node tail5 = Node_Operations.genRec(1, 2, 3, 4, 0, 5);
        System.out.println(IsGrowing_LaboratoryWork.checkIsGrowing(tail1));
        System.out.println(IsGrowing_LaboratoryWork.checkIsGrowing(tailA));
        System.out.println(IsGrowing_LaboratoryWork.checkIsGrowing(tail2));
        System.out.println(IsGrowing_LaboratoryWork.checkIsGrowing(tail3));
        System.out.println(IsGrowing_LaboratoryWork.checkIsGrowing(tail4));
        System.out.println(IsGrowing_LaboratoryWork.checkIsGrowing(tail5));
    }
}