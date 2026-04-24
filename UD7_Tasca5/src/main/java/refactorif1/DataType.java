package main.java.refactorif1;

import java.util.Set;

public class DataType {

    private static final Set<Integer> DATE_CODES = Set.of(
            702, 1082, 1083, 1114, 1184, 1266, 12403
    );

    private static final Set<Integer> NUMERIC_CODES = Set.of(
            20, 21, 23, 24, 26, 700, 701, 790,
            1700, 2202, 2203, 2204, 2205, 2206,
            3734, 3769, 12396
    );

    public static void main(String[] args) {
        System.out.println(DataType.gd(20));
        System.out.println(DataType.gd(702));
        System.out.println(DataType.gd(0));
    }

    public static String gd(int code){

            if (DATE_CODES.contains(code)) {
                return "DATE";
            }

            if (NUMERIC_CODES.contains(code)) {
                return "NUMERIC";
            }

            return "STRING";
        }
}