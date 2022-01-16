package Daily;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**89 格雷编码
 * n 位格雷码序列 是一个由 2n 个整数组成的序列，其中：
 * 每个整数都在范围 [0, 2n - 1] 内（含 0 和 2n - 1）
 * 第一个整数是 0
 * 一个整数在序列中出现 不超过一次
 * 每对 相邻 整数的二进制表示 恰好一位不同 ，且
 * 第一个 和 最后一个 整数的二进制表示 恰好一位不同
 * 给你一个整数 n ，返回任一有效的 n 位格雷码序列 。
 *
 *
 * @author Jacob
 * @creator 2022/1/8-20:34
 */
public class Test89 {
    public static List<Integer> grayCode(int n) {
        ArrayList<Integer> integers = new ArrayList<>();
        for(int i = 0; i < 1<<n; i++)
            integers.add(i^i>>1);
        return integers;

    }


    public static void main(String[] args) {
        List<Integer> integers = grayCode(1);
        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }
}
