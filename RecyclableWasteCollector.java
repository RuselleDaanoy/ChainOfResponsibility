public class RecyclableWasteCollector implements WasteCollector {
    private WasteCollector nextCollector;

    public void setNextCollector(WasteCollector nextCollector) {
        this.nextCollector = nextCollector;
    }

    public void handleRequest(WasteContainer container) {
        if (container.getType().equalsIgnoreCase("recyclable")) {
            System.out.println("Recyclable waste collector processing...");
            container.emptyContainer();
        } else if (nextCollector != null) {
            nextCollector.handleRequest(container);
        } else {
            System.out.println("No collector found for " + container.getType() + " waste.");
        }
    }
}