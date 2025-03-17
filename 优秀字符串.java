package 算法竞技;

import java.util.HashSet;
import java.util.Scanner;

public class 优秀字符串 {
    public static boolean isExcellentString(String s) {
        // 条件1：字符串长度为 5
        if (s.length() != 5) {
            return false;
        }
        // 条件2：第三个字符与第五个字符相同
        if (s.charAt(2) != s.charAt(4)) {
            return false;
        }
        // 条件3：前四个字符互不相同
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < 4; i++) {
            set.add(s.charAt(i));
        }
        return set.size() == 4;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 输入字符串数量
        int n = scanner.nextInt();
        scanner.nextLine();  // 清除输入缓冲区的换行符

        int count = 0;

        // 逐行读取每个字符串并判断是否符合优秀字符串的条件
        for (int i = 0; i < n; i++) {
            String s = scanner.nextLine().trim();
            if (isExcellentString(s)) {
                count++;
            }
        }

        // 输出结果
        System.out.println(count);

        scanner.close();
    }
}

