public class WhileLoopFun {

    public WhileLoopFun() { }

    //prints the digits of the number individually starting from the ones digit
    public void printDigits(int number) {
        while(number > 0) {
            int digit = number % 10;
            System.out.println(digit);
            number /= 10;
        }
    }

    //Returns the number of times a letter occurs in word.
    public int countLetter(String word, String letter) {
        int count =0;
        while(word.indexOf(letter) != -1) {
            count ++;
            word = word.substring(word.indexOf(letter) + 1);
        }
        return count;
    }

    //Returns the maximum number of times that number can be doubled before it exceeds threshold
    public int maxDoubles(int number, int threshold) {
        int count = 0;
        while(number*2 < threshold) {
            count ++;
            number *= 2;
        }
        return count;
    }

    //Returns true if number is prime (i.e. it has exactly two divisors: 1 and itself) and false
    public boolean isPrime(int number) {
        int divisor = number -1;
        int count = 0;
        while(divisor > 0) {
            if(number % divisor == 0)  {
                count ++;
            }
            divisor --;
        }
        if (count == 1) {
            return true;
        } else {
            return false;
        }
    }
}
