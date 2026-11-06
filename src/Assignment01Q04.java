import java.util.Arrays;
public class Assignment01Q04 {

    public static int[] shiftArrayCyclic(int[] array, int move, char direction) {
        int[] tmp_array = new int[array.length];
        int index_move_right = array.length - 1;
        int index_move_left = array.length - 1;
        if (move >= array.length) {
            move = move % array.length;
        }
        if (direction == 'R' && move > 0 || (direction == 'L' && move < 0)) { // move right
            move = Math.abs(move);
            for(int i = 0; i < move; i++){
                tmp_array[i] = array[i]; /////////////
                index_move_right -= 1;
            }
            for(int i = move; i <= array.length-1; i++) {
                int tot = 0;
                tmp_array[i] = array[tot];
                tot++;
            }
        }
        if (direction == 'L' && move > 0 || (direction == 'R' && move < 0)) { // move left
            move = Math.abs(move);
            for(int i = 0; i < move; i++){
                tmp_array[index_move_left] = array[i];
                index_move_left -= 1;
            }
            int tot = 0;
            for(int i = move; i <= array.length-1; i++) {
                tmp_array[tot] = array[i];
                tot++;
            }
        }
        array = tmp_array;
        return array;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -1, 'R'))); // [2, 3, 4, 5, 1]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 1, 'R'))); // [5, 1, 2, 3, 4]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 1, 'r'))); // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -2, 'g'))); // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 3, 'L'))); // [4, 5, 1, 2, 3]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -3, 'L'))); // [3, 4, 5, 1, 2]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{0, 8, 9, 5, 6}, 6, 'L'))); // [8, 9, 5, 6, 0]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{}, 3, 'R'))); // []
    }
}