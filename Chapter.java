import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Chapter {
	private String Title;
   private List<SubChapter>listSubChapter=new ArrayList<SubChapter>();
   public Chapter(String title) {Title=title;}
   public String getTitle() {
	return Title;
}
public void setTitle(String title) {
	Title = title;
}
public int CreateSubChapter(String title)
   {
	   SubChapter chp=new SubChapter(title);
	   listSubChapter.add(chp);
	   return listSubChapter.indexOf(chp);
   }
public SubChapter getChapter(int indexOfSubChapter) {
	
	return listSubChapter.get(indexOfSubChapter);
}

public SubChapter getSubChapter(int indexOfSubChapter) {
	
	return listSubChapter.get(indexOfSubChapter);
}


public void print()
{
	
	System.out.println("Title Chapter"+Title);
	for (SubChapter x:listSubChapter)
		x.print();
}
}
