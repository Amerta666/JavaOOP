/*
Обработайте возможные исключительные ситуации. “Битые” значения в
исходном массиве считайте нулями. Можно внести в код правки, которые считаете
необходимыми.
*/

package Sem2_2.ex002;
public class Main {
    public static void main(String[] args) {
        String [][] arr = {{null, "2", "3"}, {"1", "3", "4"}};
        System.out.println(sum2d(arr));
    }
    public static Integer sum2d(String[][] arr) {
        int sum = 0;
        try {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[1].length; j++) {
                    int val = 0;
                    try {
                        val = Integer.parseInt(arr[i][j]);
                    } catch (NumberFormatException ignored) {}
                        sum += val;
                }
            }
            return sum;
        } catch(IndexOutOfBoundsException e){
            System.out.println("Вылет за массив");
            return null;
        } catch(NullPointerException e){
            System.out.println("Ошибка NullPointer");
        }
        return null;
    }
}
