package student;

public class LadderTheFirstCours extends Student implements srLadder{
	private String [] ledderTheFirstCours = {"English", "Ukrainian", "Biology", "Anatomy","Latin","Philosophy","Physics","Sociology"};
	private int [] ledderTheFirstCoursRating = new int [8];
	private int ledderTheFirstCoursEnglish;
	private int ledderTheFirstCoursUkrainian;
	private int ledderTheFirstCoursBiology;
	private int ledderTheFirstCoursAnatomy;
	private int ledderTheFirstCoursLatin;
	private int ledderTheFirstCoursPhylosophy;
	private int ledderTheFirstCoursPhysics;
	private int ledderTheFirstCoursSociology;
	
	
	public LadderTheFirstCours(int ledderTheFirstCoursEnglish, int ledderTheFirstCoursUkrainian, int ledderTheFirstCoursBiology,
		int ledderTheFirstCoursAnatomy,int ledderTheFirstCoursLatin, int ledderTheFirstCoursPhylosophy,  int ledderTheFirstCoursPhysics, int ledderTheFirstCoursSociology) {
			this.ledderTheFirstCoursEnglish = ledderTheFirstCoursEnglish;
			ledderTheFirstCoursRating [0] = ledderTheFirstCoursEnglish;
			this.ledderTheFirstCoursUkrainian = ledderTheFirstCoursUkrainian;
			ledderTheFirstCoursRating [1] = ledderTheFirstCoursUkrainian;
			this.ledderTheFirstCoursBiology = ledderTheFirstCoursBiology;
			ledderTheFirstCoursRating [2] = ledderTheFirstCoursBiology;
			this.ledderTheFirstCoursAnatomy = ledderTheFirstCoursAnatomy;
			ledderTheFirstCoursRating [3] = ledderTheFirstCoursAnatomy;
			this.ledderTheFirstCoursLatin = ledderTheFirstCoursLatin;
			ledderTheFirstCoursRating [4] = ledderTheFirstCoursLatin;
			this.ledderTheFirstCoursPhylosophy = ledderTheFirstCoursPhylosophy;
			ledderTheFirstCoursRating [5] = ledderTheFirstCoursPhylosophy;
			this.ledderTheFirstCoursPhysics = ledderTheFirstCoursPhysics;
			ledderTheFirstCoursRating [6] = ledderTheFirstCoursPhysics;
			this.ledderTheFirstCoursSociology = ledderTheFirstCoursSociology;
			ledderTheFirstCoursRating [7] = ledderTheFirstCoursSociology;
			}
	public LadderTheFirstCours(){		
	}
		
	public String [] getLedderTheFirstCours(){
		return ledderTheFirstCours;
	}
	public int [] getLedderTheFirstCoursRating(){
		return ledderTheFirstCoursRating;
	}
	
	public void setLedderTheFirstCoursEnglish(int ledderTheFirstCoursEnglish){
		this.ledderTheFirstCoursEnglish = ledderTheFirstCoursEnglish;
		ledderTheFirstCoursRating [0] = ledderTheFirstCoursEnglish;
	}
	public int getLedderTheFirstCoursEnglish(){
		return ledderTheFirstCoursEnglish;
	}
	public void setLedderTheFirstCoursUkrainian(int ledderTheFirstCoursUkrainian){
		this.ledderTheFirstCoursUkrainian = ledderTheFirstCoursUkrainian;
		ledderTheFirstCoursRating [1] = ledderTheFirstCoursUkrainian;
	}
	public int getLedderTheFirstCoursUkrainian(){
		return ledderTheFirstCoursUkrainian;
	}
	public void setLedderTheFirstCoursBiology(int ledderTheFirstCoursBiology){
		this.ledderTheFirstCoursBiology = ledderTheFirstCoursBiology;
		ledderTheFirstCoursRating [2] = ledderTheFirstCoursBiology;
	}
	public int getLedderTheFirstCoursBiology(){
		return ledderTheFirstCoursBiology;
	}
	public void setLedderTheFirstCoursAnatomy(int ledderTheFirstCoursAnatomy){
		this.ledderTheFirstCoursAnatomy = ledderTheFirstCoursAnatomy;
		ledderTheFirstCoursRating [3] = ledderTheFirstCoursAnatomy;
	}
	public int getLedderTheFirstCoursAnatomy(){
		return ledderTheFirstCoursAnatomy;
	}
	public void setLedderTheFirstCoursLatin(int ledderTheFirstCoursLatin){
		this.ledderTheFirstCoursLatin = ledderTheFirstCoursLatin;
		ledderTheFirstCoursRating [4] = ledderTheFirstCoursLatin;
	}
	public int getLedderTheFirstCoursLatin(){
		return ledderTheFirstCoursLatin;
	}
	public void setLedderTheFirstCoursPhylosophy(int ledderTheFirstCoursPhylosophy){
		this.ledderTheFirstCoursPhylosophy = ledderTheFirstCoursPhylosophy;
		ledderTheFirstCoursRating [5] = ledderTheFirstCoursPhylosophy;
	}
	public int getLedderTheFirstCoursPhylosophy(){
		return ledderTheFirstCoursPhylosophy;
	}
	public void setLedderTheFirstCoursPhysics(int ledderTheFirstCoursPhysics){
		this.ledderTheFirstCoursPhysics = ledderTheFirstCoursPhysics;
		ledderTheFirstCoursRating [6] = ledderTheFirstCoursPhysics;
	}
	public int getLedderTheFirstCoursPhysics(){
		return ledderTheFirstCoursPhysics;
	}
	public void setLedderTheFirstCoursSociology(int ledderTheFirstCoursSociology){
		this.ledderTheFirstCoursSociology = ledderTheFirstCoursSociology;
		ledderTheFirstCoursRating [7] = ledderTheFirstCoursSociology;
	}
	public int getLedderTheFirstCoursSociology(){
		return ledderTheFirstCoursSociology;
	}
	
	public double srLadderRating ()	{
		double sum = 0.0;
		for (int i =0; i<8;i++){
			sum += ledderTheFirstCoursRating [i];
		}
		sum = sum/8;
		return sum;
	}
}
	
	
