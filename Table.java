
public class Table extends Element{
   private String Title;
   public String getTitle() {
	return Title;
}
public void setTitle(String title) {
	Title = title;
}
public Table(String title) {Title=title;}

public void print() {
	System.out.println("Title Table"+Title);
}
}
