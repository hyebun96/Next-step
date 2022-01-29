package Chapter2;

public class StringCalculator {

    int repeatOpr(String opr, String text){
        int hap = 0;

        if(text==null || text.isEmpty() ){
            return 0;
        }

        String numbers[] = text.split(",|:");

        for(String i : numbers){
            
            if(opr.equals("+")){
                hap = add(hap, Integer.parseInt(i));
            }else if(opr.equals("-")){
                hap = subtract(hap, Integer.parseInt(i));
            }else if(opr.equals("*")){
                hap = multiply(hap, Integer.parseInt(i));
            }else if(opr.equals("/")){
                hap = divide(hap, Integer.parseInt(i));
            }
        }

        System.out.println(hap);
        return hap;
    }

    int add(int i, int j){
        return i + j;
    }
    
    int subtract(int i, int j){
        return i - j;
    }

    int multiply(int i, int j){
        return i * j;
    }

    int divide(int i, int j){
        return i / j;
    }
}
