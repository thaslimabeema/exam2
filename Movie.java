package com.deloitte;
  
public class Movie {
	 
	private int id;
	private String name;
	private String showdate;
	private String showtime;
	private String status;
	 
	public Movie(int id, String name, String showdate, String showtime, String status) {
		//super();
		this.id = id;
		this.name = name;
		this.showdate = showdate;
		this.showtime = showtime;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShowdate() {
		return showdate;
	}

	public void setShowdate(String showdate) {
		this.showdate = showdate;
	}

	public String getShowtime() {
		return showtime;
	}

	public void setShowtime(String showtime) {
		this.showtime = showtime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", showdate=" + showdate + ", showtime=" + showtime + ", status="
				+ status + "]";
	}
}
	
	
