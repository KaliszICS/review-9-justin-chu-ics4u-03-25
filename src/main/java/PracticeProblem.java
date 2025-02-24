public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int lettersToFive(String word, char sussyletter) {
		int count = 0;
        int index = 0;

        while (index < word.length()) {
            if (word.charAt(index) == sussyletter) {
                count++;
                    
                if (count == 5) {
                    return index + 1;
                }
            }
            index++;
        }
        return -1;  
    }

    public static int countLetter(String word, char sussyletter) {
        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == sussyletter) {
                count++;
            }
        }
        return count;
    }

    public static int oddSum(int a, int b) {
        int start = Math.min(a, b);
        int end = Math.max(a, b);
        int sum = 0;

        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        return sum;
    }

}
