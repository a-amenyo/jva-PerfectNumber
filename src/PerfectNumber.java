public class PerfectNumber {

    public static void main ( String [] args){
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
    }
    public static boolean isPerfectNumber( int number ){
        if( number < 1){
            return false;
        }
        else {
            int properPositiveDivisor = 0;
            for ( int i =1; i<= (number/2) ; i++ ){
                if ( number % i == 0 ){
                    properPositiveDivisor += number ;
                }
            }
            if (properPositiveDivisor == number) {
                return false;
            } else  return true;
        }
    }
}
