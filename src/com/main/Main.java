package com.main;

import java.sql.SQLException;
import java.util.List;

import com.DAO.FilmOnActorNameDAOImpl;
import com.DTO.FilmOnActorNameDTO;
import com.VO.FilmOnActorNameVO;

public class Main {

	public static void main(String[] args) {
		FilmOnActorNameDAOImpl filmOnActorName = new FilmOnActorNameDAOImpl();
		try {
			List<FilmOnActorNameVO> filmOnActorList = filmOnActorName
					.getAllFilmOnActorName(new FilmOnActorNameDTO("PENELOPE", "GUINESS"));
			System.out.println("ciaoo sono Mia e ho aggiunto un print a caso per pushare");
			System.out.println("ar baretto");
			filmOnActorList.forEach(System.out::println);
		} catch (SQLException e) {
			System.err.println("inserimento Fallito");
			e.printStackTrace();
		}
	}
}
