// Bitwise Operators (https://www.geeksforgeeks.org/bitwise-operators-in-java/)
// used to perform manipulation of individual bits of a number
// READ: Used when performing update and query operations of the Binary indexed trees

// LOOK UP: 'bit masking'

public class BitwisePractice {

    // Bit-shift operators - shift bits of a number left or right
    
    public static void main(String[] args) {

        // Expected answer: 8
        int val = 2;
        shiftedVal = val << 2;

        // Expected answer: 20
        int val = 5;
        shiftedVal = val << 2;

        // Expected answer: 52
        int val = 13;
        shiftedVal = val << 2;
    }

    // making sense of ctci 1.1 bit vector solution
    public static void isUnique(String[] args) {
        int checker = 0; //00000000000000000000000000000000
        String example = "test";
        for (int i = 0; i < example.length(); i++) {
            int numericValue = example.charAt(i);
            int bitIndex = numericValue - 'a';
            // index represents bit in checker corresponding to current char
            if ((checker & (1 << bitIndex)) > 0) {
                System.out.println("duplicate found");
            }
            // update checker to mark the currente char 
            checker |= (1 << bitIndex);
        }
    }


}