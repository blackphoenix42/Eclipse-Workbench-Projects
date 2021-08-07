package routes;

public class Route {
	private int id;
	private int startcity;
	private int endcity;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getStartcity() {
		return startcity;
	}
	public void setStartcity(int startcity) {
		this.startcity = startcity;
	}
	public int getEndcity() {
		return endcity;
	}
	public void setEndcity(int endcity) {
		this.endcity = endcity;
	}
	@Override
	public String toString() {
		return "Route [id=" + id + ", startcity=" + startcity + ", endcity=" + endcity + "]";
	}
	
	public Route(){}
}
