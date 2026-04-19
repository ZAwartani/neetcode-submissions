class MyHashSet {
    public ArrayList<Integer> arr;
    public MyHashSet() {
        arr = new ArrayList<>();
    }
    
    public void add(int key) {
        if(!contains(key))
        {
            arr.add(key);
        }
    }
    
    public void remove(int key) {
        for(int i = 0 ; i < arr.size() ; i++)
        {
            if(arr.get(i) == key)
            {
                arr.remove(i);
            }
        }
    }
    
    public boolean contains(int key) {
        boolean result = false;
        for(int i = 0 ; i < arr.size(); i++)
        {
            if(arr.get(i) == key)
            {
                result = true;
                break;
            }
        }
        return result;
    }
}