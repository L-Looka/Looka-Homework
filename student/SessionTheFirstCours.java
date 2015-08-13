package student;

public class SessionTheFirstCours extends LadderTheFirstCours implements srSession {
	private String [] sessionTheFirstCours = {"English", "Ukrainian", "Biology", "Anatomy","Latin","Philosophy","Physics","Sociology"};
	private int [] sessionTheFirstCoursRating = new int[8];
	private int sessionTheFirstCoursEnglish;
	private int sessionTheFirstCoursUkrainian;
	private int sessionTheFirstCoursBiology;
	private int sessionTheFirstCoursAnatomy;
	private int sessionTheFirstCoursLatin;
	private int sessionTheFirstCoursPhylosophy;
	private int sessionTheFirstCoursPhysics;
	private int sessionTheFirstCoursSociology;
	
	public SessionTheFirstCours(int sessionTheFirstCoursEnglish, int sessionTheFirstCoursUkrainian, int sessionTheFirstCoursBiology,
		int sessionTheFirstCoursAnatomy,int sessionTheFirstCoursLatin, int sessionTheFirstCoursPhylosophy,  int sessionTheFirstCoursPhysics, int sessionTheFirstCoursSociology) {
			this.sessionTheFirstCoursEnglish = sessionTheFirstCoursEnglish;
			sessionTheFirstCoursRating [0] = sessionTheFirstCoursEnglish;
			this.sessionTheFirstCoursUkrainian = sessionTheFirstCoursUkrainian;
			sessionTheFirstCoursRating [1] = sessionTheFirstCoursUkrainian;
			this.sessionTheFirstCoursBiology = sessionTheFirstCoursBiology;
			sessionTheFirstCoursRating [2] = sessionTheFirstCoursBiology;
			this.sessionTheFirstCoursAnatomy = sessionTheFirstCoursAnatomy;
			sessionTheFirstCoursRating [3] = sessionTheFirstCoursAnatomy;
			this.sessionTheFirstCoursLatin = sessionTheFirstCoursLatin;
			sessionTheFirstCoursRating [4] = sessionTheFirstCoursLatin;
			this.sessionTheFirstCoursPhylosophy = sessionTheFirstCoursPhylosophy;
			sessionTheFirstCoursRating [5] = sessionTheFirstCoursPhylosophy;
			this.sessionTheFirstCoursPhysics = sessionTheFirstCoursPhysics;
			sessionTheFirstCoursRating [6] = sessionTheFirstCoursPhysics;
			this.sessionTheFirstCoursSociology = sessionTheFirstCoursSociology;
			sessionTheFirstCoursRating [7] = sessionTheFirstCoursSociology;
			}
	public SessionTheFirstCours(){		
	}
		
	public String [] getSessionTheFirstCours(){
		return sessionTheFirstCours;
	}
	public int [] getSessionTheFirstCoursRating(){
		return sessionTheFirstCoursRating;
	}
	

	public int getSessionTheFirstCoursEnglish() {
		return sessionTheFirstCoursEnglish;
	}
	public void setSessionTheFirstCoursEnglish(int sessionTheFirstCoursEnglish) {
		this.sessionTheFirstCoursEnglish = sessionTheFirstCoursEnglish;
		sessionTheFirstCoursRating [0] = sessionTheFirstCoursEnglish;
	}
	public int getSessionTheFirstCoursUkrainian() {
		return sessionTheFirstCoursUkrainian;
	}
	public void setSessionTheFirstCoursUkrainian(int sessionTheFirstCoursUkrainian) {
		this.sessionTheFirstCoursUkrainian = sessionTheFirstCoursUkrainian;
		sessionTheFirstCoursRating [1] = sessionTheFirstCoursUkrainian;
	}
	public int getSessionTheFirstCoursBiology() {
		return sessionTheFirstCoursBiology;
	}
	public void setSessionTheFirstCoursBiology(int sessionTheFirstCoursBiology) {
		this.sessionTheFirstCoursBiology = sessionTheFirstCoursBiology;
		sessionTheFirstCoursRating [2] = sessionTheFirstCoursBiology;
	}
	public int getSessionTheFirstCoursAnatomy() {
		return sessionTheFirstCoursAnatomy;
	}
	public void setSessionTheFirstCoursAnatomy(int sessionTheFirstCoursAnatomy) {
		this.sessionTheFirstCoursAnatomy = sessionTheFirstCoursAnatomy;
		sessionTheFirstCoursRating [3] = sessionTheFirstCoursAnatomy;
	}
	public int getSessionTheFirstCoursLatin() {
		return sessionTheFirstCoursLatin;
	}
	public void setSessionTheFirstCoursLatin(int sessionTheFirstCoursLatin) {
		this.sessionTheFirstCoursLatin = sessionTheFirstCoursLatin;
		sessionTheFirstCoursRating [4] = sessionTheFirstCoursLatin;
	}
	public int getSessionTheFirstCoursPhylosophy() {
		return sessionTheFirstCoursPhylosophy;
	}
	public void setSessionTheFirstCoursPhylosophy(int sessionTheFirstCoursPhylosophy) {
		this.sessionTheFirstCoursPhylosophy = sessionTheFirstCoursPhylosophy;
		sessionTheFirstCoursRating [5] = sessionTheFirstCoursPhylosophy;
	}
	public int getSessionTheFirstCoursPhysics() {
		return sessionTheFirstCoursPhysics;
	}
	public void setSessionTheFirstCoursPhysics(int sessionTheFirstCoursPhysics) {
		this.sessionTheFirstCoursPhysics = sessionTheFirstCoursPhysics;
		sessionTheFirstCoursRating [6] = sessionTheFirstCoursPhysics;
	}
	public int getSessionTheFirstCoursSociology() {
		return sessionTheFirstCoursSociology;
	}
	public void setSessionTheFirstCoursSociology(int sessionTheFirstCoursSociology) {
		this.sessionTheFirstCoursSociology = sessionTheFirstCoursSociology;
		sessionTheFirstCoursRating [7] = sessionTheFirstCoursSociology;
	}

	public double srSessionRating(){
		double sum = 0.0;
		for (int i =0; i<8;i++){
			sum += sessionTheFirstCoursRating [i];
		}
		sum = sum/8;
		return sum;
	}
}	


