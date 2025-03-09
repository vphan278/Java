public class FizzBuzz{

    public String isFizzBuzz(int value){
        if(value %3 ==0 && value % 5 ==0){
            return "FizzBuzz";
        }
        else if(value % 3==0){
            return "Fizz";
        }
        else if(value %5==0){
            return "Buzz";
        }
        else{
            return Integer.toString(value);
        }
    }

    public void counterFizzBuzz(){
        for(int i=1; i<=50; i++){
            String result = isFizzBuzz(i);
            System.out.println("Number: " + i + " -Results: " + result);
        }
    }

}