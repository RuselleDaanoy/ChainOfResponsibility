class WasteContainer {
    private String type;
    private int capacity;
    private int currentLevel;

    public WasteContainer(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
        this.currentLevel = 0;
    }

    public void fill(int amount) {
        this.currentLevel += amount;
        if (this.currentLevel > this.capacity) {
            this.currentLevel = this.capacity;
        }
    }

    public boolean isFull() {
        return currentLevel >= capacity;
    }

    public String getType() {
        return type;
    }

    public int getCurrentLevel() {
        return currentLevel;
    }

    public int getCapacity() {
        return capacity;
    }

    public void emptyContainer() {
        System.out.println("Emptying " + type + " waste bin.");
        this.currentLevel = 0;
    }
}
