public class Main {

    public static void main(String[] args) {
        String[][] arr = new String[4][4];

        arr[0][0] = "1";
        arr[0][1] = "Васька";
        arr[0][2] = "123";
        arr[0][3] = "258";

        arr[1][0] = "2";
        arr[1][1] = "Рыжик";
        arr[1][2] = "456";
        arr[1][3] = "369";

        arr[2][0] = "3";
        arr[2][1] = "Барсик";
        arr[2][2] = "789";
        arr[2][3] = "598";

        arr[3][0] = "4";
        arr[3][1] = "Мурзик";
        arr[3][2] = "147";
        arr[3][3] = "487";
        try {
            filterArray(arr);
        }
        catch (Exception er){
            System.out.println(er.getMessage());
            System.out.println(er.toString());
        }
    }


        public static void filterArray(String arrMethod[][]) throws MyArraySizeException,MyArrayDataException {
            double sum=0;
            int len=0;
                len=arrMethod.length;
                if(len!=4) throw new MyArraySizeException("Array have size not equal 4, but like: ",len);
            for(int i=0; i<len; i++){
                int len2=arrMethod[i].length;
                if(len2!=4) throw  new MyArraySizeException("Interior array have size not equal 4, but like: ",len2);
                for(int j=0; j<len2; j++){
                    try {
                        sum+=Double.parseDouble(arrMethod[i][j]);
                    }
                    catch (NullPointerException|NumberFormatException ex){
                        try {
                            throw  new MyArrayDataException("Value type not convert to number, ",new int[] { i,j});
                        }
                        catch (MyArrayDataException ee){
                            System.out.println(ee.toString());
                        }
                        finally {
                            continue;
                        }
                    }
                }
            }
            System.out.println(sum);

        }
    }






