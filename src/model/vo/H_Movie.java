package model.vo;

import java.io.Serializable;
import java.util.Arrays;

public class H_Movie implements Serializable{
	
	private String title;		//제목
	private String director;	//감독
	private String[] actors;	//출연 배우
	private String national;	//국가
	private String genre;		//장르 (장르는 6가지로만 : 로맨스/애니메이션/액션/공포/코미디/판타지)
	private String grade;		//등급
	private int runningtime;	//러닝타임
	private String summary;
	
	public H_Movie() {}

	public H_Movie(String title, String director, String[] actors, String national, String genre, String grade,
			int runningtime, String summary) {
		super();
		this.title = title;
		this.director = director;
		this.actors = actors;
		this.national = national;
		this.genre = genre;
		this.grade = grade;
		this.runningtime = runningtime;
		this.summary = summary;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String[] getActors() {
		return actors;
	}

	public void setActors(String[] actors) {
		this.actors = actors;
	}

	public String getNational() {
		return national;
	}

	public void setNational(String national) {
		this.national = national;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getRunningtime() {
		return runningtime;
	}

	public void setRunningtime(int runningtime) {
		this.runningtime = runningtime;
	}
	public String getSummary() {
		return summary;
	}
	
	public void setSummary(String summary) {
		this.summary = summary;
	}

	@Override
	public String toString() {
		return "H_Movie [title=" + title + ", director=" + director + ", actors=" + Arrays.toString(actors)
				+ ", national=" + national + ", genre=" + genre + ", grade=" + grade + ", runningtime=" + runningtime
				+ ", summary=" + summary + "]";
	}

	
}
