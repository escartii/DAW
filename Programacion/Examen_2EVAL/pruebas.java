public public static void main(String[] args) {
    // Create an instance of the Inventario class
    Inventario inventario = new Inventario();

    // Get the reference and volume from the user
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the reference of the tablon: ");
    String reference = scanner.nextLine();
    System.out.print("Enter the volume in cubic meters: ");
    float volume = scanner.nextFloat();

    // Calculate the total price, required units, and price per cubic meter
    float totalPrice = calculateTotalPrice(reference, volume, inventario);
    int requiredUnits = calculateRequiredUnits(reference, volume, inventario);
    float pricePerCubicMeter = calculatePricePerCubicMeter(totalPrice, volume);

    // Print the results
    System.out.println("Total Price: " + totalPrice);
    System.out.println("Required Units: " + requiredUnits);
    System.out.println("Price per Cubic Meter: " + pricePerCubicMeter);
}

public static float calculateTotalPrice(String reference, float volume, Inventario inventario) {
    // Get the price of the tablon from the inventory
    float price = inventario.getPrecio(reference);

    // Calculate the total price
    float totalPrice = price * volume;

    return totalPrice;
}

public static int calculateRequiredUnits(String reference, float volume, Inventario inventario) {
    // Get the dimensions of the tablon from the inventory
    int length = inventario.getLargo(reference);
    int width = inventario.getAncho(reference);
    int height = inventario.getAlto(reference);

    // Calculate the required units
    int requiredUnits = (int) Math.ceil(volume / (length * width * height));

    return requiredUnits;
}

public static float calculatePricePerCubicMeter(float totalPrice, float volume) {
    // Calculate the price per cubic meter
    float pricePerCubicMeter = totalPrice / volume;

    return pricePerCubicMeter;
}
    

