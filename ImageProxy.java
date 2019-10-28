
public class ImageProxy extends Element {
  private String imageName;
  
  private Image realImage;
  //doar cand faci print atunci trebuie obiectul real  
  //nu trebuie facut extend la Image ca atunci se va face apel la constructorul de la Image si va dura
  public void print() {
	   if(realImage==null)
		realImage=new Image(imageName);
		System.out.println("Title Image"+imageName);
		
	}
public ImageProxy(String imageName) {
	this.imageName = imageName;
}

}
