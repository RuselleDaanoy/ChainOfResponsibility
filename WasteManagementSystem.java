public class WasteManagementSystem {
    private WasteCollector collectorChain;

    public WasteManagementSystem() {
        WasteCollector organicCollector = new OrganicWasteCollector();
        WasteCollector recyclableCollector = new RecyclableWasteCollector();
        WasteCollector hazardousCollector = new HazardousWasteCollector();
        
        organicCollector.setNextCollector(recyclableCollector);
        recyclableCollector.setNextCollector(hazardousCollector);
        
        this.collectorChain = organicCollector; 
    }

    public void collectWaste(WasteContainer container) {
        if (container.isFull()) {
            System.out.println(container.getType() + " bin is full! Sending for collection...");
            collectorChain.handleRequest(container); 
        } else {
            System.out.println(container.getType() + " bin is not full yet. Current level: " 
                               + container.getCurrentLevel() + " / " + container.getCapacity());
        }
    }
}
