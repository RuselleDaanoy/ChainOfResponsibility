public class HazardousWasteCollector implements WasteCollector {
    private WasteCollector nextCollector;

    public void setNextCollector(WasteCollector nextCollector) {
        this.nextCollector = nextCollector;
    }

    public void handleRequest(WasteContainer container) {
        if (container.getType().equalsIgnoreCase("hazardous")) {
            System.out.println("Hazardous waste collector processing...");
            container.emptyContainer();
        } else if (nextCollector != null) {
            nextCollector.handleRequest(container);
        } else {
            System.out.println("No collector found for " + container.getType() + " waste.");
        }
    }
}