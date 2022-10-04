// "static void main" must be defined in a public class.
public class IntegerFlip {
    public static void main(String[] args) {
        //N >= 2
        int N = 17;
        int len = String.valueOf(N).length();
        double nBy10 = (double) N/10;
        int zeroes = 0;
        String part1 = "0.";
        String part2 = "";
        if (nBy10 - (int) nBy10 == 0.0)
            zeroes = len-2;
        else
            zeroes = len-1;
        int dividend = (int) Math.pow(10, zeroes+1);
        for (int i = 0; i < zeroes; i++)
            part1 += "0";
        Set<Integer> divSet = new HashSet<>();
        List<Integer> quotList = new ArrayList<>();
        while (dividend >= 10) {
            int size1 = divSet.size();
            divSet.add(dividend);
            int size2 = divSet.size();
            int quot = (int) dividend/N;
            if (size1 == size2) {
                int index = quotList.indexOf(quot);
                for (int i = index; i < quotList.size(); i++)
                    part2 += String.valueOf(quotList.get(i));
                break;
            }
            quotList.add(quot);
            part1 += String.valueOf(quot);
            int rem = dividend - N*quot;
            if (rem == 0) {
                part1 += "0";
                part2 = "0";
                break;
            } else {
                dividend = rem*10;
            }
            
        }
        System.out.println(part1 + " " + part2);
    }
}
