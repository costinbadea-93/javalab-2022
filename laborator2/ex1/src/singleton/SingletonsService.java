package singleton;

//Bill Paugh
public class SingletonsService {
    /**
     * Intr-o clasa singleton constructorul este
     * privat
     */

    private SingletonsService(){}

    private static class SINGLETON_HOLDER{
        private static final SingletonsService INSTANCE = new SingletonsService();
    }

    public static SingletonsService getInstance () {
        return SINGLETON_HOLDER.INSTANCE;
    }


    public static int [] add(int [] arr, int elem){
        int [] tmp = new int[arr.length + 1];
        for(int i = 0; i < arr.length; i ++) {
            tmp[i] = arr[i];
        }
//        System.arraycopy(arr, 0, tmp, 0, arr.length);
        tmp[tmp.length -1] = elem;

        return tmp;
    }

}
