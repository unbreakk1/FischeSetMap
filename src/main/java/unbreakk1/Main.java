package unbreakk1;

public class Main
{
    public static void main(String[] args)
    {
        Pharmacy pharmacy = new Pharmacy();

        // Adding funny medications
        Medication med1 = new Medication("HappyCaps", 12.99, true);
        Medication med2 = new Medication("GigglePills", 25.49, false);
        Medication med3 = new Medication("ChuckleSyrup", 18.75, true);
        Medication med4 = new Medication("SleepyDrops", 9.99, true);
        Medication med5 = new Medication("ZapZapPainAway", 49.99, false);

        // Save medications in the pharmacy
        pharmacy.save(med1);
        pharmacy.save(med2);
        pharmacy.save(med3);
        pharmacy.save(med4);
        pharmacy.save(med5);

        // Print all medications
        System.out.println("Welcome to the Funky Pharmacy! Here’s what we’ve got:");
        pharmacy.printAllMedications();

        // Get medication count
        System.out.println("\nTotal medications in stock: " + pharmacy.getCount());

        // Find a specific medication
        String searchName = "ChuckleSyrup";
        Medication found = pharmacy.find(searchName);
        if (found != null)
            System.out.println("\nLooking for " + searchName + "? Here it is: " + found);
        else
            System.out.println("\nUh oh, " + searchName + " is out of stock!");
        

        // Delete a medication
        System.out.println("\nOh no! The GigglePills are expired. Removing them...");
        pharmacy.delete("GigglePills");
        System.out.println("\nUpdated pharmacy inventory:");
        pharmacy.printAllMedications();

        // Get medication count after deletion
        System.out.println("\nCurrent total after the GigglePills removal: " + pharmacy.getCount());
    }

}
