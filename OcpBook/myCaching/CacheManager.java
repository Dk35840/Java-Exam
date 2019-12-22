package myCaching;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.Set;
import java.util.Vector;

public class CacheManager {

	private static Map<Object, Object> cacheHashMap = new HashMap<Object, Object>();

	static {
		ExecutorService service = null;
		try {
			int milliSecondsSleepTime = 5000;
			service = Executors.newSingleThreadExecutor();
			service.execute(() -> {

				while (true) {
					System.out.println("Scanning for the expired objects");
					Set keyset = cacheHashMap.keySet();

					Iterator keys = keyset.iterator();

					while (keys.hasNext()) {
						Object key = keys.next();

						Cacheable value = (Cacheable) cacheHashMap.get(key);

						if (value.isExpired()) {
							cacheHashMap.remove(key);
							System.out.println("Found an exprired object and is clean");
						}
					}

					try {
						Thread.currentThread().sleep(milliSecondsSleepTime);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			}

			);
		}

		finally {
			if (service != null) {
				service.shutdown();
			}

		}

	}

	public CacheManager() {

	}

	public static void putCache(Cacheable obj) {
		cacheHashMap.put(obj.getIdentifier(), obj);
	}

	public static synchronized Cacheable getCache(Object id) {

		Cacheable object = (Cacheable) cacheHashMap.get(id);

		if (object == null)
			return null;
		if (object.isExpired()) {
			cacheHashMap.remove(id);
			return null;
		} else {
			return object;
		}
	}
}
