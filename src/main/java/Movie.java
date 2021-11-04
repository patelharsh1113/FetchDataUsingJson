import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//
//{
//  "title": "Toy Story 3",
//  "year": 2010,
//  "mpaa_rating": "G",
//  "runtime": 103,
//  }

@JsonIgnoreProperties
public class Movie {
	String title;
	Integer year;
	String mpaa_rating;
	Integer runtime;
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public String getMpaa_rating() {
		return mpaa_rating;
	}
	public void setMpaa_rating(String mpaa_rating) {
		this.mpaa_rating = mpaa_rating;
	}
	public Integer getRuntime() {
		return runtime;
	}
	public void setRuntime(Integer runtime) {
		this.runtime = runtime;
	}

	
	
	
	

}
