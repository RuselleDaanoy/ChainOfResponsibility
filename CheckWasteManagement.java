public class CheckWasteManagement {
    public static void main(String[] args) {
        WasteManagementSystem system = new WasteManagementSystem();
        
        WasteContainer organicBin = new WasteContainer("Organic", 10);
        WasteContainer recyclableBin = new WasteContainer("Recyclable", 15);
        WasteContainer hazardousBin = new WasteContainer("Hazardous", 5);

        organicBin.fill(5);
        recyclableBin.fill(5); 
        hazardousBin.fill(5);

        system.collectWaste(organicBin);
        system.collectWaste(recyclableBin);
        system.collectWaste(hazardousBin);
    }
}
