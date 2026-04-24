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
        if (
                code == 702 ||
                        code == 1082 ||
                        code == 1083 ||
                        code == 1114 ||
                        code == 1184 ||
                        code == 1266 ||
                        code == 12403
        ) {
            return "DATE";
        } else if (
                code == 20 ||
                        code == 21 ||
                        code == 23 ||
                        code == 24 ||
                        code == 26 ||
                        code == 700 ||
                        code == 701 ||
                        code == 790 ||
                        code == 1700 ||
                        code == 2202 ||
                        code == 2203 ||
                        code == 2204 ||
                        code == 2205 ||
                        code == 2206 ||
                        code == 3734 ||
                        code == 3769 ||
                        code == 12396
        ) {
            return "NUMERIC";
        } else {
            return "STRING";
        }
    }
}