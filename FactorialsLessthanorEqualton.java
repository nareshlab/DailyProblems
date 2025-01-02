import java.util.ArrayList;

public class FactorialsLessthanorEqualton {
    static ArrayList<Long> factorialNumbers(long n) {
        
        ArrayList<Long> result = new ArrayList<>();
        calci(1,1,n,result);
        return result;
    }
    static void calci(int i , long fact, long n, ArrayList<Long> result){
        if(fact>n){
            return;
        }
        result.add(fact);
        calci(i+1, fact*(i+1),n,result);
    }
}
