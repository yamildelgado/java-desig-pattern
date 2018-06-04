package gof.strategy.context;

public class Item {
	
	private Integer id;
	private float precie;
	public Item(Integer id, float precie) {
		super();
		this.id = id;
		this.precie = precie;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public float getPrecie() {
		return precie;
	}
	public void setPrecie(float precie) {
		this.precie = precie;
	}
	
	
	

}
