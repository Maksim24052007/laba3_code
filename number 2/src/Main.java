import java.util.*;

class PrimesGenerator {
    public void ReadNumbers(int n, Scanner sc, List<Integer> targetList) {
        for (int i = 0; i < n; i++) {
            int number = sc.nextInt();
            targetList.add(number);
        }
    }
}

class PrimesGeneratorTest extends PrimesGenerator {
    public void Outlist(List<Integer> targetList) {
        System.out.println(targetList);
    }

    public void Reverselist(List<Integer> targetList) {
        targetList.sort(Comparator.reverseOrder());
        System.out.println(targetList);
    }
}

public class Main {
    static public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        List<Integer> list = new ArrayList<>();
        PrimesGenerator generator = new PrimesGenerator();
        generator.ReadNumbers(n, scanner, list);
        PrimesGeneratorTest systemout = new PrimesGeneratorTest();
        systemout.Outlist(list);
        systemout.Reverselist(list);
    }
}