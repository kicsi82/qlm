package qlm.advertisement;

import java.util.Hashtable;

public class AdvertisementImpl implements Advertisement {

  private int maxAppearance;

  private double weight;

  private Hashtable<Integer, Integer> appearances;

  public AdvertisementImpl(int maxAppearance, double weight) {
    this.maxAppearance = maxAppearance;
    this.weight = weight;
    this.appearances = new Hashtable<>();
  }

  @Override
  public int getMaxAppearance() {
    return maxAppearance;
  }

  @Override
  public double getWeight() {
    return weight;
  }

  @Override
  public int lastAppearence(int dayIndex, int numberOfDays) {
    int count = 0;
    for (int i = dayIndex; i > dayIndex - numberOfDays && i >= 1; i--) {
      count += appearances.getOrDefault(i, 0);
    }
    return count;
  }

  @Override
  public void showAdvertisement(int dayIndex) {
    appearances.put(dayIndex, appearances.getOrDefault(dayIndex, 0) + 1);
  }

  @Override
  public Hashtable<Integer, Integer> getAllAppearences() {
    return appearances;
  }
}
