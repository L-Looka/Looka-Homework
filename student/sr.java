package student;

interface srLadder {
	double srLadderRating();
}
interface srSession {
	double srSessionRating();
}
interface srExam {
	double srExamRating ();
}

public interface sr extends srLadder,srSession,srExam
{}

