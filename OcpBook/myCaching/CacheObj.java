package myCaching;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class CacheObj implements Cacheable {

	private LocalDateTime dateOfExpiration;
	Object obj = null;
	private Object id = null;
	

	public CacheObj(Object obj, Object id, int secondsToLive) {
		this.obj = obj;
		this.id = id;

		if (secondsToLive != 0) {
			dateOfExpiration = LocalDateTime.now().plusSeconds(secondsToLive);
		}
	}

// default time of 30 sec
	public CacheObj(Object obj, Object id) {
		this.obj = obj;
		this.id = id;
		dateOfExpiration = LocalDateTime.now().plusSeconds(30);
	}

	@Override
	public boolean isExpired() {

		if (dateOfExpiration != null) {

			if(dateOfExpiration.isBefore(LocalDateTime.now())) {
				System.out.println(new StringBuilder("CachedResultSet.isExpired:  Expired from Cache! EXPIRE TIME: ")
						.append(dateOfExpiration.toString())
						.append("Current TIme")
						.append(LocalDateTime.now()));
				
				return true;
			}
			
			else {
				System.out.println("CachedResultSet.isExpired:  Expired not from Cache!");
				return false;
			}
		}
		
		else  
			return false;
		
	}

	@Override
	public Object getIdentifier() {
		return id;
	}

}
