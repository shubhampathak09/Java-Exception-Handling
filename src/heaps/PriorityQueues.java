package heaps;

import java.util.ArrayList;

public class PriorityQueues {

    // hop and complete bt
    ArrayList<Integer> data;
    public PriorityQueues(){
     data=new ArrayList<>();
    }
    public void add(int val){
    data.add(val);
    upHeapify(data.size()-1);

    }
    private void upHeapify(int i){
        
    }
    public int remove(){

    }
    public int peek(){
    if(this.size() == 0) {
        System.out.println("underflow");
        return -1;
    }
    else {
        return data.get(0);
    }
    }
    public int size(){

    }

}
