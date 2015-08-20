package fabrica;
import java.util.*;

public class SalaryUpComparator implements Comparator<Employers>
{
	public int compare (Employers a, Employers b)
	{
		return a.getSalary()<b.getSalary()?-1 : a.getSalary()>b.getSalary()?1 : 0;
	}
}
