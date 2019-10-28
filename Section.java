import java.util.ArrayList;
import java.util.List;

public class Section extends Element {
	Section(String sectionTitle)
	{
		this.sectionTitle=sectionTitle;
		
	}
	private String sectionTitle;
	private List<Element>listSection=new ArrayList<Element>();
public int add(Element el)
{
	listSection.add(el);
	return listSection.indexOf(el);
}
public void remove(Element el)
{
	listSection.remove(listSection.indexOf(el));	
}

public Element getElement(int index)
{
	return listSection.get(index);
}

public void print()
{
   System.out.println("Section Title "+sectionTitle);
   for(Element el :listSection)
   {
	   el.print();
   }
}
public String getSectionTitle() {
	return sectionTitle;
}
public void setSectionTitle(String sectionTitle) {
	this.sectionTitle = sectionTitle;
}
public List<Element> getListSection() {
	return listSection;
}
public void setListSection(List<Element> listSection) {
	this.listSection = listSection;
}
}
