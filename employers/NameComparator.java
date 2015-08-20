package fabrica;
import java.util.*;

public class NameComparator implements Comparator<Employers> {

	public int compare(Employers a, Employers b) {
		String SurName1 = a.getSurName();
		String SurName2 = b.getSurName();
		int result = SurName1.compareTo(SurName2);
		if (result!=0)
		{
			return result;
		}
		String name1 = a.getName();
		String name2 = b.getName();
		int result2 = name1.compareTo(name2);
		if (result2 != 0)
		{
			return result2;
		}
		return 0;
	}
}
