public class EncapsulationDemo {
    // Private variable: cannot be accessed directly from outside this class
    private String secretData;
    private int price;

    // Getter method for secretData - allows read access
    public String getSecretData() {
        return secretData;
    }

    // Setter method for secretData - allows write access
    public void setSecretData(String secretData) {
        this.secretData = secretData;
    }

    // Getter method for price
    public int getPrice() {
        return price;
    }

    // Setter method for price with simple validation
    public void setPrice(int price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Error: Price cannot be negative.");
        }
    }

    public static void main(String[] args) {
        EncapsulationDemo obj = new EncapsulationDemo();

        // Accessing private variables directly like "obj.price = 10;" would cause an
        // error!
        // We MUST use the setter methods provided.
        obj.setSecretData("Confidential Document XYZ");
        obj.setPrice(150);

        System.out.println("Accessing private variables securely via getters:");
        System.out.println("Secret Data: " + obj.getSecretData());
        System.out.println("Price: $" + obj.getPrice());

        System.out.println("\nTrying to set an invalid price:");
        obj.setPrice(-50); // Triggers the validation inside the setter method
    }
}

/*
 * SUMMARY / LEARNING OBJECTIVES:
 * This program teaches the Object-Oriented principle of Encapsulation.
 * - Encapsulation restricts direct access to data by making variables 'private'.
 * - Public 'getter' and 'setter' methods act as protective gateways, allowing the class 
 *   to control how its attributes are read and safely modified (e.g., adding validation rules).
 */
