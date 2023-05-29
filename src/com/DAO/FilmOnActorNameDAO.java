package com.DAO;

import java.sql.SQLException;
import java.util.List;

import com.DTO.FilmOnActorNameDTO;
import com.VO.FilmOnActorNameVO;

public interface FilmOnActorNameDAO {

	public List<FilmOnActorNameVO> getAllFilmOnActorName(FilmOnActorNameDTO filmCategoryDTO) throws SQLException;

}
