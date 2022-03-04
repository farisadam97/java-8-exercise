import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Number1 {
    public static void main(String[] args) {
//        Integer[] numbers = {11,12,22,31,41,25,28,50,20};
        List<Integer> numbers = Arrays.asList(new Integer[]{11,12,22,31,41,25,28,50,20});
        System.out.println("List of Numbers : " + numbers);
        System.out.println("");

//        Get even number with stream
        List<Integer> evenNumbers = numbers.stream().filter(i ->i%2 == 0).collect(Collectors.toList());
        System.out.println("List of even numbers : " + evenNumbers);

//        Get numbers start with 1
        List<Integer> startWith1 = (List<Integer>) numbers.stream()
                                    .map(num -> num + "")
                                    .filter(num -> num.startsWith("1"))
                                    .map(Integer::valueOf)
                                    .collect(Collectors.toList());
        System.out.println("List of numbers start with 1 : " + startWith1);

//        Get total number element from numbers
        Integer totalAmount = Math.toIntExact(numbers.stream().count());
        System.out.println("Get total amount of element : " + totalAmount);

//        Sort elements
        List<Integer> sortedNums = (List<Integer>) numbers.stream()
                                    .sorted()
                                    .collect(Collectors.toList());
        System.out.println("Sorted elements : " + sortedNums);
    }
}
