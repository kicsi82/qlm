package qlm.advertisement;

public class AdvertisementApp {

  public static void main(String[] args) {
    Advertisement adv1 = new AdvertisementImpl(400, 0.2);
    Advertisement adv2 = new AdvertisementImpl(50, 0.4);
    Advertisement adv3 = new AdvertisementImpl(20, 0.8);

    AdvertisementSystem system = new AdvertisementSystemImpl();
    system.registerAdvertisement(adv1);
    system.registerAdvertisement(adv2);
    system.registerAdvertisement(adv3);

    for (int day = 1; day <= 10; day++) {
      system.showNextAdvertisement(day);
      system.showNextAdvertisement(day);
      system.showNextAdvertisement(day);
      system.showNextAdvertisement(day);
      system.showNextAdvertisement(day);
      system.showNextAdvertisement(day);
      system.showNextAdvertisement(day);
      system.showNextAdvertisement(day);
      system.showNextAdvertisement(day);
      system.showNextAdvertisement(day);
      system.showNextAdvertisement(day);
      system.showNextAdvertisement(day);
      system.showNextAdvertisement(day);
      system.showNextAdvertisement(day);
    }

    for (Advertisement advertisement : system.getAdvertisementList()) {
      System.out.println(advertisement.getAllAppearences());
    }
  }

}
