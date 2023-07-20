package com.app.test;

import com.app.dao.MovieDAO;
import com.app.dto.Movie;

public class MovieTest {
  public static void main(String[] args) {
    MovieDAO movieDAO = new MovieDAO();

    // 영화 정보 저장
    Movie movie1 = new Movie();
    movie1.setTitle("영화 제목");
    movie1.setDirector("감독 이름");
    movie1.setGenre("장르");
    movie1.setReleaseYear(2021);
    movieDAO.saveMovie(movie1);

    // 영화 정보 수정
    String movieTitleToUpdate = "영화 제목";
    String newDirector = "새로운 감독 이름";
    String newGenre = "새로운 장르";
    int newReleaseYear = 2022;
    movieDAO.updateMovie(movieTitleToUpdate, newDirector, newGenre, newReleaseYear);

    // 영화 정보 삭제
    String movieTitleToDelete = "영화 제목";
    movieDAO.deleteMovie(movieTitleToDelete);
  }
}