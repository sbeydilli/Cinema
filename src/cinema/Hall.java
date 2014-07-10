package cinema;

public class Hall {
	private int id;
	private int rows;
	private int cols ;
	private String name;
	
	Hall(int id,int row, int col, String name){
		this.id=id;
		this.rows= row;
		this.cols=col;
		this.name=name;
	}
	Hall(int row, int col, String name){	
		this.rows= row;
		this.cols=col;
		this.name=name;
	}
	
	public int getId() {
		return id;
	}

	public int getRows() {
		return rows;
	}

	public int getCols() {
		return cols;
	}

	public String getName() {
		return name;
	}	
	
}
