package Chapter2;

public class StringCalculator {

    // 계산기 합
    public int add(String text){

       if(isblank(text)){
           return 0;
       }
       
        return sum(textSplit(text));
    }

    //  text null 검사
    private boolean isblank(String text){
        
        if(text==null || text.isEmpty() ){
            return true;
        }
        
        return false;
    }
    
    // split
    private int[] textSplit(String text){
        
        String numbers[] = text.split(",|:");
        
        return stringToInt(numbers);
    }

    // String -> Int
    private int[] stringToInt(String[] numbers){
        int[] values = new int[numbers.length];

        for(int i = 0; i<numbers.length; i++){
            values[i] = toPositive(numbers[i]);
            
        }
        return values;
    }

    // sum
    private int sum(int[] numbers){
        int hap = 0 ;

        for(int i: numbers){
            hap += i;
        }

        return hap;
    }

    private int toPositive(String value){
        int number = Integer.parseInt(value);
        if(number < 0  ){
            throw new RuntimeException();
        }
        return number;
    }
}
