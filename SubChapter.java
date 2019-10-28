import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SubChapter {

	public List<Element> getListElement() {
		return listElement;
	}
	public void setListElement(List<Element> listElement) {
		this.listElement = listElement;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
private List<Element>listElement=new ArrayList<Element>();
private String Title;
   public SubChapter(String title){Title=title;};
   //private List<Paragraph>listParagraph=new ArrayList<Paragraph>();
   //private List<Image>listImage=new ArrayList<Image>();
   //private List<Table>listTable=new ArrayList<Table>();
   
   public int CreateParagraph(String title)
   {
	   Paragraph chp=new Paragraph(title);
	   listElement.add(chp);
	   return listElement.indexOf(chp);
   }
   public int CreateImage(String title)
   {
	   Image chp=new Image(title);
	   listElement.add(chp);
	   return listElement.indexOf(chp);
   }
   public int CreateTable(String title)
   {
	   Table chp=new Table(title);
	   listElement.add(chp);
	   return listElement.indexOf(chp);
   }
   public void print() {
	   System.out.println("Afisare SubChapter");
//	   for (Paragraph p:listElement)
//		   p.print();
//	   for (Image i:listElement)
//		   i.print();
//	   for (Table t:listElement)
//		   t.print();
	   for (Element x:listElement)
		   x.print();
	   
   }
  
   
}
