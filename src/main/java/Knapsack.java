public class Knapsack {

    public int knapsack(int totalCapacity,Item[] items){
        int max = 0;
        for(int i = 0; i < items.length; i++){
            int capacity = totalCapacity - items[i].getCapacity();
            if(capacity > 0){

                int t = knapsack(capacity,items) + items[i].getValue();
                if(t > max){
                    max = t;
                }
            }
        }
        return max;
    }
}
class Item {
    private int value;
    private int capacity;

    public Item() {
    }

    public Item(int value, int capacity) {
        this.value = value;
        this.capacity = capacity;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capcity) {
        this.capacity = capcity;
    }
}