package com.DAO;

public interface FilmOnActorNameSQL {

	public static final String getFilmOnActorNameSQL = "select *\r\n" + "from actor\r\n"
			+ "join film_actor on actor.actor_id = film_actor.actor_id\r\n"
			+ "join film on film.film_id = film_actor.film_id\r\n"
			+ "where actor.first_name = ? and actor.last_name = ? ;";

}
