package qlm.advertisement;

import java.util.ArrayList;
import java.util.List;

public class AdvertisementSystemImpl implements AdvertisementSystem {

  private List<Advertisement> advertisements;

  public AdvertisementSystemImpl() {
    this.advertisements = new ArrayList<>();
  }

  @Override
  public void showNextAdvertisement(int dayIndex) {
    Advertisement next = null;
    double maxPriority = -1;

    for (Advertisement adv : advertisements) {
      if (adv.lastAppearence(dayIndex, dayIndex) < adv.getMaxAppearance()) {
        double priority = adv.getWeight() / (adv.lastAppearence(dayIndex, 1) + 1);
        if (priority > maxPriority) {
          maxPriority = priority;
          next = adv;
        }
      }
    }

    if (next != null) {
      next.showAdvertisement(dayIndex);
    } else {
      System.out.println("Ma nincs több megjeleníthető reklám!");
    }
  }

  @Override
  public void registerAdvertisement(Advertisement ad) {
    advertisements.add(ad);
  }

  @Override
  public List<Advertisement> getAdvertisementList() {
    return advertisements;
  }
}
