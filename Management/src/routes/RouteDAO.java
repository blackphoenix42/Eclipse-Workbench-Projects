package routes;

public interface RouteDAO {
	
	boolean checkroute(int startcity,int endcity);
	boolean insert(int startcity,int endcity);
	
}
