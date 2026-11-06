import java.util.Arrays;
public class Assignment01Q04 {

    public static int[] shiftArrayCyclic(int[] array, int move, char direction) {
        int length_arr = array.length;
        if (direction == 'L') {
            move = -move;
        }
        if (direction != 'L' && direction != 'R') {
            return array;
        }
        int move_right = (length_arr + move % length_arr) % length_arr; // convert move to number of right steps (positive value)
        int[] tmp_array = new int[array.length];
        int toMove = length_arr - move_right;
        int toBringBack = 0;
        for (int i=0; i< move_right; i++) { // copy x right items to the start of tmp_array
            tmp_array[i] = array[toMove];
            toMove++;
        }
        for (int i=move_right; i<length_arr; i++){ // copy the rest of the array
            tmp_array[i] = array[toBringBack];
            toBringBack++;
        }
        for(int i=0; i< length_arr; i++) {
            array[i] = tmp_array[i];
        }
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