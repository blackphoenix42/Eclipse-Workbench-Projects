package cities;

import java.util.List;

public interface CityDAO {
	
	boolean insert(String city); 
	boolean checkCity(String city);
	
	List<City> fetchAllCitites();
	
	boolean remove(int id);
	
	City fetchCity(int id);
	
	boolean update(City city);

}
