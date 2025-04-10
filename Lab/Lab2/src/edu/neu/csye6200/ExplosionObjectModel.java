package edu.neu.csye6200;

public class ExplosionObjectModel {
	public void triggerExplosion(Object explosion) {
        if (explosion instanceof Explosion) {
            ((Explosion) explosion).explode();
        } else if (explosion instanceof AbstractExplosion) {
            ((AbstractExplosion) explosion).explode();
        } else if (explosion instanceof Explodable) {
            ((Explodable) explosion).explode();
        } else {
            System.out.println("Unknown explosion type");
        }
    }
}
