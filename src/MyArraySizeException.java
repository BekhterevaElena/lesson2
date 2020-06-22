public class MyArraySizeException extends Exception implements viewValue{
    private int number;
    public String getValue(){return Integer.toString(number);}
    public MyArraySizeException(String message, int num){
        super(message);
        number=num;
    }
    @Override
    public String toString(){
        return getValue();
    }
}