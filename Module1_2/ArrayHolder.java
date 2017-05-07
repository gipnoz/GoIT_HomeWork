package Module1_2;


public class ArrayHolder {
    public ArrayHolder(){
    }
    private int[] massive;

    ArrayHolder(int arraySize){
        massive = new int[arraySize];
    }

    public int[] getMassive() {
        return massive;
    }

    public void setMassive(int[] massive) {
        this.massive = massive;
    }
}

