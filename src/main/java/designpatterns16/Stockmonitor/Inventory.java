package designpatterns16.Stockmonitor;

public class Inventory {
    private List<StockItem> stockItems = new ArrayList<>();

    public void addStock(StockItem item) {
        stockItems.add(item);
    }

    public void removeStock(StockItem item) {
        if(!stockItems.contains(item)) {
            throw new IllegalArgumentException("Item not found in inventory!");
        }
        stockItems.remove(item);
    }
    public List<StockItem> getStockByProduct(String name) {
        return stockItems.stream()
                .filter(s -> s.getProduct().getName().equals(name))
                .toList();
    }
}

