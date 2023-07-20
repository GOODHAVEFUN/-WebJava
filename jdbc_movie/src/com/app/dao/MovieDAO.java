package com.app.dao;

import com.app.dto.Movie;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MovieDAO {
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String username = "hr";
	private String password = "1111";

	public void saveMovie(Movie movie) {
		try (Connection conn = DriverManager.getConnection(url, username, password)) {
			String query = "INSERT INTO movies (title, director, genre, release_year) VALUES (?, ?, ?, ?)";
			PreparedStatement stmt = conn.prepareStatement(query);
			stmt.setString(1, movie.getTitle());
			stmt.setString(2, movie.getDirector());
			stmt.setString(3, movie.getGenre());
			stmt.setInt(4, movie.getReleaseYear());
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void updateMovie(String title, String director, String genre, int releaseYear) {
		try (Connection conn = DriverManager.getConnection(url, username, password)) {
			String query = "UPDATE movies SET director = ?, genre = ?, release_year = ? WHERE title = ?";
			PreparedStatement stmt = conn.prepareStatement(query);
			stmt.setString(1, director);
			stmt.setString(2, genre);
			stmt.setInt(3, releaseYear);
			stmt.setString(4, title);
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void deleteMovie(String title) {
		try (Connection conn = DriverManager.getConnection(url, username, password)) {
			String query = "DELETE FROM movies WHERE title = ?";
			PreparedStatement stmt = conn.prepareStatement(query);
			stmt.setString(1, title);
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}