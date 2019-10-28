
public class Author {
    private String Name;
    public Author(String name) {Name=name;}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public void print() {
		
		System.out.println("Author name"+this.Name);
	}
    
}
