class StockSpanner {
    ArrayList<Integer> prices;
    public StockSpanner() {
        prices = new ArrayList<>();
    }
    
    public int next(int price) {
        int span = 1;
        for (int i = prices.size() - 1; i >= 0; i--) {
            if (prices.get(i) <= price) {
                span++;
            } else {
                break;
            }
        }
        prices.add(price);
        return span;
    }
}