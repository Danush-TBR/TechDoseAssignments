class MyHashMap {
    int[] myMap = new int[1000001];
    public MyHashMap() {
    }
    
    public void put(int key, int value) {
        if(value==0) myMap[key]=-2;
        else myMap[key]=value;
    }
    
    public int get(int key) {
        if(myMap[key]==-2) return 0;
        else if(myMap[key]==0) return -1;
        else return myMap[key];
    }
    
    public void remove(int key) {
        myMap[key]=-1;
    }
}
