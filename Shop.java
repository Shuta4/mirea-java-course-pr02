import java.util.ArrayList;

class Shop {
    private final ArrayList<Computer> computers;

    public static void main(String[] args) {
        var shopInterface = new ShopInterface();
        shopInterface.run();
    }

    public Shop() {
        computers = new ArrayList<>();
    }

    public void addComputer(Computer computer) {
        computers.add(computer);
    }

    public void delComputer(Computer computer) {
        computers.remove(computer);
    }

    public Computer getComputer(int i) {
        if (i < 0 || i >= computers.size()) return null;
        return computers.get(i);
    }

    public ArrayList<Computer> findByModelName(String modelName) {
        var foundComputers = new ArrayList<Computer>();
        for (var computer : computers) {
            if (computer.getModelName().equals(modelName)) {
                foundComputers.add(computer);
            }
        }
        return foundComputers;
    }

    public ArrayList<Computer> findByCpu(String cpu) {
        var foundComputers = new ArrayList<Computer>();
        for (var computer : computers) {
            if (computer.getCpu().equals(cpu)) {
                foundComputers.add(computer);
            }
        }
        return foundComputers;
    }

    public ArrayList<Computer> findByRam(String ram) {
        var foundComputers = new ArrayList<Computer>();
        for (var computer : computers) {
            if (computer.getRam().equals(ram)) {
                foundComputers.add(computer);
            }
        }
        return foundComputers;
    }

    public ArrayList<Computer> findByGpu(String gpu) {
        var foundComputers = new ArrayList<Computer>();
        for (var computer : computers) {
            if (computer.getGpu().equals(gpu)) {
                foundComputers.add(computer);
            }
        }
        return foundComputers;
    }

    public ArrayList<Computer> findByPrice(double minPrice, double maxPrice) {
        var foundComputers = new ArrayList<Computer>();
        for (var computer : computers) {
            if (minPrice <= computer.getPrice() && computer.getPrice() <= maxPrice) {
                foundComputers.add(computer);
            }
        }
        return foundComputers;
    }
}

class ShopInterface {
    Shop shop;

    public ShopInterface() {
        shop = new Shop();
    }

    public void run() {
        System.out.println("=== Computer Shop ===");
        System.out.println();
    }
}

class Computer {
    private String modelName;
    private String cpu;
    private String ram;
    private String gpu;
    private double price;

    public Computer(String modelName, String cpu, String ram, String gpu, double price) throws Exception {
        this.modelName = modelName;
        this.cpu = cpu;
        this.ram = ram;
        this.gpu = gpu;
        setPrice(price);
    }

    public void setPrice(double price) throws Exception {
        if (price <= 0) {
            throw new Exception("Price must be greater then 0.");
        }
        this.price = price;
    }

    public String getModelName() {
        return modelName;
    }

    public String getCpu() {
        return cpu;
    }

    public String getGpu() {
        return gpu;
    }

    public String getRam() {
        return ram;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format(
            "%s:\nCPU: %s\nGPU: %s\nRAM: %s\nPrice: %.2f",
            getModelName(), getCpu(), getGpu(), getRam(), getPrice()
        );
    }
}