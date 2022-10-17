public class BinaryHeap {
    //implements a binary heap where the heap rule is the value in the parent
    //node is less than
    //or equal to the values in the child nodes
    //the implementation uses parallel arrays to store the priorities and the
    // trees. This is un-java like but I want you to have practice with
    //parallel arrays. you must use this implementation

    int priority[];
    HuffmanTree trees[];
    int size;

    public BinaryHeap(int s){
        priority = new int[s + 1];
        trees = new HuffmanTree[s+1];
        size = 0;
    }

    public void removeMin(){
        //PRE: size != 0
        //removes the priority and tree at the root of the heap
        if(size == 0){
            return;
        }
        int hole = 1;
        priority[1] = priority[size];
        trees[1] = trees[size];
        int child;
        int temp = priority[1];
        HuffmanTree tempTree = trees[1];
        size--;
        while(hole * 2 <= size){
            child = hole * 2;
            if(child != size && priority[child + 1] < priority[child]){
                child++;
            }
            if(priority[child] < temp){
                priority[hole] = priority[child];
                trees[hole] = trees[child];
            }else{
                break;
            }
            hole = child;
        }
        priority[hole] = temp;
        trees[hole] = tempTree;
    }

    public int getMinPriority(){
        //PRE: size != 0
        //return the priority in the root of the heap
        return priority[1];
    }

    public HuffmanTree getMinTree(){
        //PRE: size != 0
        //return the tree in the root of the heap
        return trees[1];
    }

    public boolean full(){
        //return true if the heap is full otherwise return false
        if(size == priority.length - 1)
            return true;
        else
            return false;
    }

    public void insert(int p, HuffmanTree t){
        //insert the priority p and the associated tree t into the heap
        //PRE !full()
        if(!full()){
            int hole = ++size;
            priority[hole] = p;
            trees[hole] = t;
            while(p < priority[hole / 2]){
                priority[hole] = priority[hole / 2];
                trees[hole] = trees[hole / 2];
                hole = hole / 2;
            }
            priority[hole] = p;
            trees[hole] = t;
        }
    }

    public int getSize(){
        //return the number of values, (priority , tree) pairs, in the heap
        return size;
    }
}
