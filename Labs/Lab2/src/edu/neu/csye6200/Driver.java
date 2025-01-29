package edu.neu.csye6200;

public class Driver {
	public static void main(String[] args) {
        // Instantiate models
        ExplosionModel explosionModel = new ExplosionModel();
        AbstractExplosionModel abstractExplosionModel = new AbstractExplosionModel();
        ExplodableModel explodableModel = new ExplodableModel();
        ExplosionObjectModel explosionObjectModel = new ExplosionObjectModel();

        // Create instances of explosion objects
        GunShot gunShot = new GunShot();
        Grenade grenade = new Grenade();
        GunShotA gunShotA = new GunShotA();
        GrenadeA grenadeA = new GrenadeA();
        GunShotI gunShotI = new GunShotI();
        GrenadeI grenadeI = new GrenadeI();

        // Demonstrate polymorphism
        System.out.println("-- Using ExplosionModel --");
        explosionModel.triggerExplosion(gunShot);
        explosionModel.triggerExplosion(grenade);

        System.out.println("-- Using AbstractExplosionModel --");
        abstractExplosionModel.triggerExplosion(gunShotA);
        abstractExplosionModel.triggerExplosion(grenadeA);

        System.out.println("-- Using ExplodableModel --");
        explodableModel.triggerExplosion(gunShotI);
        explodableModel.triggerExplosion(grenadeI);

        System.out.println("-- Using ExplosionObjectModel --");
        explosionObjectModel.triggerExplosion(gunShot);
        explosionObjectModel.triggerExplosion(grenade);
        explosionObjectModel.triggerExplosion(gunShotA);
        explosionObjectModel.triggerExplosion(grenadeA);
        explosionObjectModel.triggerExplosion(gunShotI);
        explosionObjectModel.triggerExplosion(grenadeI);
    }
}
