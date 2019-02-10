public class Combine {
    private int capacity;
    private int consumption;
    private int length;
    private int power;
    private int heigth;
    private static final double averagePrice = 59999.00;
    protected String colour;
    protected String producerName;

    public Combine() {
        this(0, 0, 0,
                0, 0, "default",
                "default");
    }

    public Combine(int capacity, int consumption, int length, int power) {
        this(capacity, consumption, length, power, 0, "default", "default");
    }

    public Combine(int capacity, int consumption, int length, int power, int heigth,
                   String colour, String producerName) {
        this.capacity = capacity;
        this.consumption = consumption;
        this.length = length;
        this.power = power;
        this.heigth = heigth;
        this.colour = colour;
        this.producerName = producerName;
    }

    public String toString() {
        System.out.println("Capacity of grain bin: " + capacity + "kg");
        System.out.println("Consumption of fuel per 1hectare of field: " + consumption + "liters");
        System.out.println("Length of combine: " + length + "meters");
        System.out.println("Engine power: " + power + "horsepower");
        System.out.println("Heigth of combine: " + heigth + "meters");
        System.out.println("Average price of combine: " + averagePrice);
        System.out.println("Colour of combine: " + colour);
        System.out.println("Combine producer name: " + producerName);


        return "Characteristics of combine";
    }

    public void resetValues(int capacity, int consumption, int length, int power, int heigth,
                            String colour, String producerName) {
        this.capacity = capacity;
        this.consumption = consumption;
        this.length = length;
        this.power = power;
        this.heigth = heigth;
        this.colour = colour;
        this.producerName = producerName;
    }

    public static void printStaticAveragePrice() {
        System.out.println("Static method - average price of combine:" + averagePrice);
    }

    public void printAveragePrice() {
        System.out.println("Non-static method - average price of combine: " + averagePrice);
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getComsumption() {
        return consumption;
    }

    public void setConsumption(int consumption) {
        this.consumption = consumption;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getPower()

    {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getHeigth()

    {
        return heigth;
    }

    public void setHeigth(int heigth) {
        this.heigth = heigth;
    }
}
