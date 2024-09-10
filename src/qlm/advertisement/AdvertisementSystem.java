package qlm.advertisement;

import java.util.List;

public interface AdvertisementSystem {
  // Reklám regisztrálása.
  public void registerAdvertisement(Advertisement ad);

  // Következı reklám megjelenítése a megadott napon.
  public void showNextAdvertisement(int dayIndex);

  // Reklámok listája
  public List<Advertisement> getAdvertisementList();
}
