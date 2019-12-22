package mB2.ch7.someU;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// page 388 of fox lesson
class Food {
}

class Water {
}

public class Fox {
	public void eatAndDrink(Food food, Water water) {
		synchronized (food) {
			System.out.println("Got Food!"+ food);
			move();
			synchronized (water) {
				System.out.println("Got Water!"+ water);
			}
		}
	}

	public void drinkAndEat(Food food, Water water) {
		synchronized (water) {
			System.out.println("Got Water!"+ water);
			move();
			synchronized (food) {
				System.out.println("Got Food!"+ food);
			}
		}
	}

	public void move() {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
// Handle exception
		}
	}

	public static void main(String[] args) {
// Create participants and resources
		Fox foxy = new Fox();
		Fox tails = new Fox();
		Food food = new Food();
		Water water = new Water();
// Process data
		
		ExecutorService service = null;
		try {
			service = Executors.newScheduledThreadPool(10);
			service.submit(() -> foxy.eatAndDrink(food, water));
			service.submit(() -> tails.drinkAndEat(food, water));
		} finally {
			if (service != null)
				service.shutdown();
		}
	}
}