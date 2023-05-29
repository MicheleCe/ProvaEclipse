package com.VO;

import java.io.Serializable;

public class FilmOnActorNameVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5298010527496621283L;

	private Integer actorId;
	private String name;
	private String lastName;
	private Integer film_id;
	private String filmTitle;

	public FilmOnActorNameVO(Integer actrId, String name, String lastName, Integer film_id, String filmTitle) {
		this.actorId = actrId;
		this.name = name;
		this.lastName = lastName;
		this.film_id = film_id;
		this.filmTitle = filmTitle;
	}

	public Integer getActrId() {
		return actorId;
	}

	public void setActrId(Integer actrId) {
		this.actorId = actrId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getFilm_id() {
		return film_id;
	}

	public void setFilm_id(Integer film_id) {
		this.film_id = film_id;
	}

	public String getFilmTitle() {
		return filmTitle;
	}

	public void setFilmTitle(String filmTitle) {
		this.filmTitle = filmTitle;
	}

	@Override
	public String toString() {
		return "FilmOnActorNameVO [actrId=" + actorId + ", name=" + name + ", lastName=" + lastName + ", film_id="
				+ film_id + ", filmTitle=" + filmTitle + "]";
	}

}
