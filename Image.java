import java.util.concurrent.TimeUnit;

public class Image extends Element{
    private String Title;
    public Image(String title) {Title=title;
    try {
		TimeUnit.SECONDS.sleep(5);
	}catch(InterruptedException e) {
		e.printStackTrace();
	}}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public void print() {
		
		System.out.println("Title Image"+Title);
	}
	
	
}
