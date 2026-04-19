class MyHashMap {
    ArrayList<Integer[]> arrmap;

    public MyHashMap() {
        arrmap = new ArrayList<>();
    }

    public void put(int key, int value) {
        boolean found = false;
        for (Integer[] pair : arrmap) {
            if (pair[0] == key) {
                pair[1] = value;
                found = true;
                break;
            }
        }
        if (!found) {
            arrmap.add(new Integer[]{key, value});
        }
    }

    public int get(int key) {
        for (Integer[] pair : arrmap) {
            if (pair[0] == key) {
                return pair[1];
            }
        }
        return -1;
    }
    
    public void remove(int key) {
        for (int i = 0; i < arrmap.size(); i++) {
        if (arrmap.get(i)[0] == key) {
            arrmap.remove(i);
            break;         }
    }
}
}
