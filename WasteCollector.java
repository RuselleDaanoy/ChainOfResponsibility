public interface WasteCollector {
    void setNextCollector(WasteCollector nextCollector);
    void handleRequest(WasteContainer container);
}