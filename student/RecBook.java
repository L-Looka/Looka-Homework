package student;

public class RecBook{

	public static void print (Student x, LadderTheFirstCours xL, SessionTheFirstCours xC, ExamTheFirstCours xE){
		System.out.println(x.getINN()+ " " + x.getSurName() + " " + x.getName());
		System.out.println("Ladder for the first cours:");
		for (int i = 0; i < xL.getLedderTheFirstCoursRating().length; i ++){
			System.out.println (xL.getLedderTheFirstCours()[i] + " " + xL.getLedderTheFirstCoursRating()[i] );
		}
		System.out.println("Sesion for the first cours:");
		for (int i = 0; i < xC.getSessionTheFirstCours().length; i ++){
			System.out.println (xC.getSessionTheFirstCours()[i] + " " +  xC.getSessionTheFirstCoursRating()[i] );
		}
		System.out.println("Exam for the first cours:");
		for (int i = 0; i < xE.getExamTheFirstCours().length; i ++){
			System.out.println (xE.getExamTheFirstCours()[i] + " " +  xE.getExamTheFirstCoursRating()[i] );
		}
	}
	public static void print (Student x, SessionTheFirstCours xC, ExamTheFirstCours xE){
		System.out.println(x.getINN() + " " + x.getSurName() + " " + x.getName());
		System.out.println("Sesion for the first cours:");
		for (int i = 0; i < xC.getSessionTheFirstCours().length; i ++){
			System.out.println (xC.getSessionTheFirstCours()[i] + " " +  xC.getSessionTheFirstCoursRating()[i] );
		}
		System.out.println("Exam for the first cours:");
		for (int i = 0; i < xE.getExamTheFirstCours().length; i ++){
			System.out.println (xE.getExamTheFirstCours()[i] + " " +  xE.getExamTheFirstCoursRating()[i] );
		}
	}
	public static void print (Student x, ExamTheFirstCours xE){
		System.out.println(x.getINN() + " " + x.getSurName() + " " + x.getName());
		System.out.println("Exam for the first cours:");
		for (int i = 0; i < xE.getExamTheFirstCours().length; i ++){
			System.out.println (xE.getExamTheFirstCours()[i] + " " +  xE.getExamTheFirstCoursRating()[i] );
		}
	}
	
	
	public static void main(String[] args) {
		ExamTheFirstCours st1E = new ExamTheFirstCours(5,4,5,3);
		SessionTheFirstCours st1S = new SessionTheFirstCours (5,4,4,5,4,3,3,4);
		LadderTheFirstCours st1L = new LadderTheFirstCours (5,4,4,3,4,3,3,5);
		Student st1 = new Student (1,"Laz", "Alexander");
		/* ����� ��� �� ������ � ��������� ������ ExamTheFirstCours �����
		 * st1E.setSurName("Laz");
		 * st1E.setSessionTheFirstCoursAnatomy(5);
		 *  �� ��� ��� ���� ��� ���� ������ :(
		 *  �� ����� � ���� ������� ����������� ������ ���������
		 *  � ����� ����� �� ��� ������ ��������������� �������������� ����� Session(��� Ladder) ���� �������� ��������� ������ Exam?
		 *  ��� ����� ���-�� ��� ��� ��� ���������� ������ � 1 ����� ����� ��������? ��� ����� ���� ��� � �� �������������� ������?
		 */
		
		print (st1,st1L,st1S,st1E);
		print (st1,st1E);
		
		System.out.println (st1L.srLadderRating() + " " + st1S.srSessionRating() + " " + st1E.srExamRating() + " " );
	}
}
