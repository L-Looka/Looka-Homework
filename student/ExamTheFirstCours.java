package student;

public class ExamTheFirstCours extends SessionTheFirstCours implements sr {
	private String [] examTheFirstCours = {"English", "Ukrainian", "Biology", "Anatomy"};
	private int [] examTheFirstCoursRating = new int [4];
	private int examTheFirstCoursEnglish;
	private int examTheFirstCoursUkrainian;
	private int examTheFirstCoursBiology;
	private int examTheFirstCoursAnatomy;
	
	public ExamTheFirstCours(int examTheFirstCoursEnglish, int examTheFirstCoursUkrainian, int examTheFirstCoursBiology,
		int examTheFirstCoursAnatomy) {
			this.examTheFirstCoursEnglish = examTheFirstCoursEnglish;
			examTheFirstCoursRating [0] = examTheFirstCoursEnglish;
			this.examTheFirstCoursUkrainian = examTheFirstCoursUkrainian;
			examTheFirstCoursRating [1] = examTheFirstCoursUkrainian;
			this.examTheFirstCoursBiology = examTheFirstCoursBiology;
			examTheFirstCoursRating [2] = examTheFirstCoursBiology;
			this.examTheFirstCoursAnatomy = examTheFirstCoursAnatomy;
			examTheFirstCoursRating [3] = examTheFirstCoursAnatomy;
			}
	public ExamTheFirstCours(){		
	}
	
	public String [] getExamTheFirstCours(){
		return examTheFirstCours;
	}
	public int [] getExamTheFirstCoursRating(){
		return examTheFirstCoursRating;
	}
	public int getExamTheFirstCoursEnglish() {
		return examTheFirstCoursEnglish;
	}
	public void setExamTheFirstCoursEnglish(int examTheFirstCoursEnglish) {
		this.examTheFirstCoursEnglish = examTheFirstCoursEnglish;
		examTheFirstCoursRating [0] = examTheFirstCoursEnglish;
	}
	public int getExamTheFirstCoursUkrainian() {
		return examTheFirstCoursUkrainian;
	}
	public void setExamTheFirstCoursUkrainian(int examTheFirstCoursUkrainian) {
		this.examTheFirstCoursUkrainian = examTheFirstCoursUkrainian;
		examTheFirstCoursRating [1] = examTheFirstCoursUkrainian;
	}
	public int getExamTheFirstCoursBiology() {
		return examTheFirstCoursBiology;
	}
	public void setExamTheFirstCoursBiology(int examTheFirstCoursBiology) {
		this.examTheFirstCoursBiology = examTheFirstCoursBiology;
		examTheFirstCoursRating [2] = examTheFirstCoursBiology;
	}
	public int getExamTheFirstCoursAnatomy() {
		return examTheFirstCoursAnatomy;
	}
	public void setExamTheFirstCoursAnatomy(int examTheFirstCoursAnatomy) {
		this.examTheFirstCoursAnatomy = examTheFirstCoursAnatomy;
		examTheFirstCoursRating [3] = examTheFirstCoursAnatomy;
	}
	
	public double srExamRating() {
		double sum = 0.0;
		for (int i =0; i<4;i++){
			sum += examTheFirstCoursRating [i];
		}
		sum = sum/4;
		return sum;
	}	
}
