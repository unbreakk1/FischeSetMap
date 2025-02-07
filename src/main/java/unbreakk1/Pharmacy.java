package unbreakk1;

import java.util.HashMap;
import java.util.Map;

public class Pharmacy
{
    private Map<String, Medication> medications;

    // Constructor
    public Pharmacy() {
        this.medications = new HashMap<>();
    }

    // Step 3: Get the count of medications
    public int getCount() {
        return medications.size();
    }

    // Step 4: Save a medication
    public void save(Medication medication) {
        medications.put(medication.getName(), medication);
    }

    // Step 5: Find a medication by name
    public Medication find(String medicationName) {
        return medications.getOrDefault(medicationName, null);
    }

    // Step 6: Delete a medication by name
    public void delete(String medicationName) {
        medications.remove(medicationName);
    }

    // Step 7: Print all medications
    public void printAllMedications() {
        if (medications.isEmpty()) {
            System.out.println("No medications found in the pharmacy.");
        } else {
            for (Medication medication : medications.values()) {
                System.out.println(medication);
            }
        }
    }

}
