package qns;

public class isPrime2{
     boolean isPrime2(int n){
        if(n <= 1){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }


void main(){
    System.out.println(isPrime2(55)); 
    
}
}