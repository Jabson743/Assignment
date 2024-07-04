public class Kata{

	public static boolean isEven(int integer) {
		if (integer % 2 == 0) return true;
		return false;
	}
      
        public static boolean isPrimeNumber(int number) {
                if (number % 2 != 0 && number / 2 != 0) return true;
                return false;
        }

        public static int subtract(int firstNumber, int secondNumber) {
             
                return firstNumber - secondNumber;         
        }

        public static double floate(double firstNumber, double secondNumber) {
                if (secondNumber != 0)   return firstNumber / secondNumber;
                 return 0;
        }

        public static int factorOf(int integer) {
                int factor = 1;
                for (int count = 1; count <= integer/2; count++) {
                    if (integer % count == 0)
			factor++;
		}
	        return factor;	
        }

        public static boolean isSquare(int integer) {
               for(int count = 1; count < integer/2; count++){
			if(integer/count == count) return true;
		}
		return false;
        }

        public static boolean isPalindrone(int num) {
              int rem = 0;
              int reverse = 0;
              int org_num = num;

              while (num > 0) {
              rem = num % 10;
              reverse = reverse * 10 + rem;
              num = num / 10;
              }
              if (org_num == reverse) return true;
              return false;
       }

       public static long factorialOf(int num) {
             int factorial = 1;
             for (int count = 1; count <= num; count++) {
             factorial *= count;
             }
             return factorial;
       }
            
}