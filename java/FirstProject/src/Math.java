    class Math{
        int previousNumber;

        int add(int x, int y){
            return x+y;
        }

        int addSpecial(int input){
            int result = previousNumber + input;    
            previousNumber= result;              
            return result;                         
        }
    }