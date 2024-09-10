package qlm.erp;

import java.util.HashSet;
import java.util.Set;

public class SeatingArrangement {

  public static int countAdjacentSeats(int totalSeats, Set<Integer> occupiedSeats) {
    if (totalSeats > 24) {
      throw new IllegalArgumentException("Az asztalok száma nem lehet több mint 24!");
    }

    for (int seat : occupiedSeats) {
      if (seat < 1 || seat > totalSeats) {
        throw new IllegalArgumentException("Van olyan foglalt asztal, amely nem létezik!");
      }
    }

    int adjacentPairs = 0;
    for (int i = 1; i <= totalSeats - 1; i += 2) {
      if (!occupiedSeats.contains(i) && !occupiedSeats.contains(i + 1)) {
        adjacentPairs++;
      }
    }
    for (int i = 1; i <= totalSeats - 2; i++) {
      if (!occupiedSeats.contains(i) && !occupiedSeats.contains(i + 2)) {
        adjacentPairs++;
      }
    }

    return adjacentPairs;
  }

  public static void main(String[] args) {
    int totalSeats = 24;
    Set<Integer> occupiedSeats = new HashSet<>();
    // occupiedSeats.add(2);
    // occupiedSeats.add(3);

    try {
      int result = countAdjacentSeats(totalSeats, occupiedSeats);
      System.out.println("Lehetséges ültetési módok száma: " + result);
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }

  }

}
