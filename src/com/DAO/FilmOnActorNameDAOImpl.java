package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.DTO.FilmOnActorNameDTO;
import com.VO.FilmOnActorNameVO;
import com.connection.ConnectionManager;

public class FilmOnActorNameDAOImpl implements FilmOnActorNameSQL, FilmOnActorNameDAO {

	@Override
	public List<FilmOnActorNameVO> getAllFilmOnActorName(FilmOnActorNameDTO filmCategoryDTO) throws SQLException {
		Connection connection = ConnectionManager.getConnection();
		List<FilmOnActorNameVO> result = new ArrayList<>();
		PreparedStatement ps = ConnectionManager.getPreparedStatement(connection, getFilmOnActorNameSQL);
		ps.setString(1, filmCategoryDTO.getActorName());
		ps.setString(2, filmCategoryDTO.getActorLastName());
		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
			FilmOnActorNameVO current = getVOFromRs(rs);
			result.add(current);
		}
		ConnectionManager.closeConnection(connection);
		return result;

	}

	private FilmOnActorNameVO getVOFromRs(ResultSet rs) throws SQLException {
		Integer actorId = rs.getInt("actor_Id");
		String name = rs.getString("first_name");
		String lastName = rs.getString("last_name");
		Integer filmId = rs.getInt("film_id");
		String filmTitle = rs.getString("title");

		return new FilmOnActorNameVO(actorId, name, lastName, filmId, filmTitle);

	}

}
