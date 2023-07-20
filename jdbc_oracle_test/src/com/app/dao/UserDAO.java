package com.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.app.domain.UserVO;

public class UserDAO {
	public Connection connection;
	public PreparedStatement preparedStatement;
	public ResultSet resultSet;

	// 회원가입
	public boolean register(UserVO user) {
		

		
		String query = "INSERT INTO TBL_USER (USER_ID, USER_IDENTIFICATION, USER_PASSWORD, USER_NAME, USER_PHONE, USER_NICKNAME, USER_EMAIL, USER_BIRTH) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
		try {
			connection = DBConnecter.getConnection();
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setLong(1, user.getUserId());
			preparedStatement.setString(2, user.getUserIdentification());
			preparedStatement.setString(3, user.getUserPassword());
			preparedStatement.setString(4, user.getUserName());
			preparedStatement.setString(5, user.getUserPhone());
			preparedStatement.setString(6, user.getUserNickname());
			preparedStatement.setString(7, user.getUserEmail());
			preparedStatement.setString(8, user.getUserBirth());

			int rowsAffected = preparedStatement.executeUpdate();

			return rowsAffected > 0;
		} catch (SQLException e) {
			System.out.println("Register() SQL오류");
			e.printStackTrace();
		} finally {
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
	}
	
	// 아이디 중복검사
	public boolean checkId(String userIdentification) {
		String query = "SELECT USER_IDENTIFICATION FROM TBL_USER WHERE USER_IDENTIFICATION = ?";
		try {
			connection = DBConnecter.getConnection();
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, userIdentification);

			resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				return false;
			}
		} catch (SQLException e) {
			System.out.println("CheckId() SQL오류");
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null) {
					resultSet.close();
				}
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return true;
	}

	// 로그인
	public boolean login(String userIdentification, String password) {
		String query = "SELECT * FROM TBL_USER WHERE USER_IDENTIFICATION = ? AND USER_PASSWORD = ?";
		try {
			connection = DBConnecter.getConnection();
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, userIdentification);
			preparedStatement.setString(2, password);

			resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				return true;
			}
		} catch (SQLException e) {
			System.out.println("Login() SQL오류");
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null) {
					resultSet.close();
				}
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
	}



	// 아이디찾기(핸드폰번호)
	public String findIdByPhoneNumber(String phoneNumber) {
		String query = "SELECT USER_IDENTIFICATION FROM TBL_USER WHERE USER_PHONE = ?";
		try {
			connection = DBConnecter.getConnection();
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, phoneNumber);

			resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				return resultSet.getString("USER_IDENTIFICATION");
			}
		} catch (SQLException e) {
			System.out.println("FindIdByPhoneNumber() SQL오류");
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null) {
					resultSet.close();
				}
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	// 비밀번호 변경
	public boolean changePassword(String userIdentification, String newPassword) {
		String query = "UPDATE TBL_USER SET USER_PASSWORD = ? WHERE USER_IDENTIFICATION = ?";
		try {
			connection = DBConnecter.getConnection();
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, newPassword);
			preparedStatement.setString(2, userIdentification);

			int rowsAffected = preparedStatement.executeUpdate();

			return rowsAffected > 0;
		} catch (SQLException e) {
			System.out.println("ChangePassword() SQL오류");
			e.printStackTrace();
		} finally {
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
	}

	// 회원정보 수정
	public boolean updateUserInfo(UserVO user) {
		String query = "UPDATE TBL_USER SET USER_NAME = ?, USER_PHONE = ?, USER_NICKNAME = ?, USER_EMAIL = ?, USER_BIRTH = ? WHERE USER_IDENTIFICATION = ?";
		try {
			connection = DBConnecter.getConnection();
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, user.getUserName());
			preparedStatement.setString(2, user.getUserPhone());
			preparedStatement.setString(3, user.getUserNickname());
			preparedStatement.setString(4, user.getUserEmail());
			preparedStatement.setString(5, user.getUserBirth());
			preparedStatement.setString(6, user.getUserIdentification());

			int rowsAffected = preparedStatement.executeUpdate();

			return rowsAffected > 0;
		} catch (SQLException e) {
			System.out.println("UpdateUserInfo() SQL오류");
			e.printStackTrace();
		} finally {
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
	}
	
	// 회원정보 삭제
	public boolean deleteUserInfo(UserVO user) {
	    String query = "DELETE FROM TBL_USER WHERE USER_ID = ? AND USER_PASSWORD = ?";
	    try {
	        connection = DBConnecter.getConnection();
	        preparedStatement = connection.prepareStatement(query);
	        preparedStatement.setLong(1, user.getUserId());
	        preparedStatement.setString(2, user.getUserPassword());

	        int rowsAffected = preparedStatement.executeUpdate();

	        return rowsAffected > 0;
	    } catch (SQLException e) {
	        System.out.println("deleteUserInfo() SQL 오류");
	        e.printStackTrace();
	    } finally {
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
	    }
	    return false;
	}
}