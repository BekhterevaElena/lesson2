public class MyArrayDataException extends Exception implements viewValue {
    private int[] arr;
    public String getValue(){
        String s="address error  from [";
        for(int a=0;a<arr.length;a++){
            s+=arr[a]+",";
        }
        s=s.substring(0, s.length()-1) + "]";
        return s;
    }
    public MyArrayDataException(String message, int[] arr){
        super(message);
        this.arr=arr;
    }
    @Override
    public String toString(){
        return getValue();
    }
}
