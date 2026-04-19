
class TimeMap {

    // لكل اسم (key) نخزن TreeMap من (timestamp -> value)
    private HashMap<String, TreeMap<Integer, String>> map;

    public TimeMap() {
        map = new HashMap<>();
    }

    // O(1) تقريبًا للإضافة
    public void set(String key, String value, int timestamp) {
        map.putIfAbsent(key, new TreeMap<>());
        map.get(key).put(timestamp, value);
    }

    // O(log n) للبحث
    public String get(String key, int timestamp) {
        if (!map.containsKey(key)) return "";

        TreeMap<Integer, String> times = map.get(key);

        Integer closestTime = times.floorKey(timestamp); 
        // يعطيك أكبر timestamp ≤ المطلوب

        if (closestTime == null) return "";
        return times.get(closestTime);
    }
}
