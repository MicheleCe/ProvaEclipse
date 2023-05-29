package com.DTO;

import java.io.Serializable;

public class FilmOnActorNameDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8147427068073992391L;

	private String actorName;
	private String actorLastName;

	public FilmOnActorNameDTO(String actorName, String actorLastName) {
		this.actorName = actorName;
		this.actorLastName = actorLastName;
	}

	public String getActorName() {
		return actorName;
	}

	public void setActorName(String actorName) {
		this.actorName = actorName;
	}

	public String getActorLastName() {
		return actorLastName;
	}

	public void setActorLastName(String actorLastName) {
		this.actorLastName = actorLastName;
	}

}
