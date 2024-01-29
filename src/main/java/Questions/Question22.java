package Questions;
import java.util.Set;
import java.util.HashSet;
public class Question22{
    public static void main(String[] args) {
        int[] array = {4, 2, 4, 5, 2, 3, 1, 1, 7, 8, 8};
        Set<Integer> duplicates = findDuplicateElements(array);

    }

    public static Set<Integer> findDuplicateElements(int[] arr) {
        Set<Integer> uniqueElements = new HashSet<>();
        Set<Integer> duplicateElements = new HashSet<>();
        for (int num : arr) {
            if (!uniqueElements.add(num)) {
                duplicateElements.add(num);
            }
        }

        return duplicateElements;
    }
}