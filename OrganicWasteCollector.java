public class OrganicWasteCollector implements WasteCollector {
    private WasteCollector nextCollector;

    public void setNextCollector(WasteCollector nextCollector) {
        this.nextCollector = nextCollector;
    }

    public void handleRequest(WasteContainer container) {
        if (container.getType().equalsIgnoreCase("organic")) {
            System.out.println("Organic waste collector processing...");
            container.emptyContainer();
        } else if (nextCollector != null) {
            nextCollector.handleRequest(container);
        } else {
            System.out.println("No collector found for " + container.getType() + " waste.");
        }
    }
}