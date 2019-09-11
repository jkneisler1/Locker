/**
 // Program Objective:
 // ==================
 // You have 100 closed lockers
 // Start with the first locker and for every locker open it.
 // Now, starting with the second locker, for this locker and every second locker after that, if the locker is open,
 //     close it; if it is closed, open it.
 // Then, starting with the third locker, for this locker and every third locker after that, if the locker is open,
 //     close it; if it is closed, open it.
 // Continue with the nth locker changing the “position” of every nth locker until n = 100. Print out the locker
 //     numbers that remain open.
 // What do you notice about the lockers that remain open?
 //
 // Program Convention:
 // ===================
 // Open locker = true
 // Closed locker = false
 // The index for the double loop is k = (i * j) + (i -1)
 */

public class Locker {
    public static void main(String[] args) {
        int numLockers = 100;
        boolean[] lockers = new boolean[numLockers];
        int k;

        // Initialize the lockers
        for (int i = 0; i < numLockers; i++) {
            lockers[i] = true;                      // All lockers are open
        }

        for (int i = 1; i < numLockers; i++) {      // index i starts a 1 since the array was initialized above.
            for (int j = 0; j < numLockers; j++) {
                k = (i * j) + (i - 1);
                if (k < numLockers) {
                    lockers[k] = ! lockers[k];
                }
                else {
                    break;                          // no need to go past 100
                }
            }
        }

        System.out.println("The ouput of the lockers.");
        for (int i = 0; i < numLockers; i++) {      // Print out of the lockers
            if (lockers[i]) {
                System.out.println("\tThe locker at position " + (i + 1) + " is open.");
            }
            else {
                System.out.println("\tThe locker at position " + (i + 1) + " is closed.");
            }
        }
    }
}
