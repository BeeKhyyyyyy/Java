// Creating class named MobilePhone
class MobilePhone {
    // Attributes (fields) of the MobilePhone
    private String brand, model;
    private boolean powerState, chargeState;
    
    // Constructor (to initialize objects)
    MobilePhone(String brand, String model, boolean power, boolean charge) {
        this.brand=brand;
        this.model=model;
        powerState=power;
        chargeState=charge;
    }
    
    // Public method to display device info
    public void deviceInfo() {
        System.out.println("Brand: "+brand);
        System.out.println("Model: "+model);
        System.out.println("\n======== "+model+" STATUS ========");
    }
    
    // Public method to display if the device has been turned on or already turned on
    public void TurnOn() {
        if (powerState==false) {
            powerState=true;
            System.out.println("The device has been turned on.");
        } else {
            System.out.println("The device is already turned on.");
        }
    }
    
    // Public method to display if the device has been turned off or already turned off
    public void TurnOff() {
        if (powerState==true) {
            powerState=false;
            System.out.println("The device has been turned off.");
        } else {
            System.out.println("The device is already turned off.");
        }
    }
    
    // Public method to display if the device is charging or already charging
    public void ConnectCharger() {
        if (chargeState==false) {
            chargeState=true;
            System.out.println("The device is charging.");
        } else {
            System.out.println("The device is already charging.");
        }
    }
    
    // Public method to display if the device is not charging or already not charging
    public void DisconnectCharger() {
        if (chargeState==true) {
            chargeState=false;
            System.out.println("The device is not charging.");
        } else {
            System.out.println("The device is already not charging.");
        }
    }
}

// Main class
public class Main {
    // Main method
    public static void main(String[] args) {
        // Creating an object of the MobilePhone class
        MobilePhone objMobilePhone=new MobilePhone("Apple", "Iphone 14 Pro Max", false, false);
        
        // Calling all methods on the object
        objMobilePhone.deviceInfo();
        objMobilePhone.TurnOn();
        objMobilePhone.TurnOn();
        objMobilePhone.TurnOff();
        objMobilePhone.TurnOff();
        objMobilePhone.ConnectCharger();
        objMobilePhone.ConnectCharger();
        objMobilePhone.DisconnectCharger();
        objMobilePhone.DisconnectCharger();
    }
}
