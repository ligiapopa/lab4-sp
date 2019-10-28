
public class Paragraph extends Element{
  private String Title;
  public Paragraph(String title) {Title=title;}
public String getTitle() {
	return Title;
}
public void setTitle(String title) {
	Title = title;
}
public void print() {
	
	System.out.println("Title Paragraph "+Title);
}
}
