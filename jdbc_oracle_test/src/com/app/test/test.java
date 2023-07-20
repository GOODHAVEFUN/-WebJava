package com.app.test;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

import com.app.dao.DBConnecter;
import com.app.dao.UserDAO;
import com.app.domain.UserVO;

public class test {
	public static void main(String[] args) {
		// 연결 테스트
		try {
			Connection connection = DBConnecter.getConnection();
			connection.close();
			System.out.println("DB연결 성공!");
		} catch (SQLException e) {
			e.printStackTrace();
		}

		UserDAO userDAO = new UserDAO();
		UserVO userVO = new UserVO();

		while (true) {
		Scanner sc = new Scanner(System.in);
		System.out.println("로그인");
		System.out.println("회원가입");
		System.out.println("아이디 찾기");
		System.out.println("비밀번호 변경");
		System.out.println("회원정보 수정");
		System.out.println("회원탈퇴");
		System.out.print("원하는 작업을 입력하세요: ");
		String choice = sc.next();

			switch (choice) {
			case "로그인": // 로그인

				if (userVO.getUserIdentification() == null) {
					System.out.print("아이디 입력: ");
					String ID = sc.next();
					System.out.print("비밀번호 입력: ");
					String Pass = sc.next();
					if (userDAO.login(ID, Pass)) {
						System.out.println("로그인 성공!");
					} else {
						System.out.println("로그인 실패!");
					}
					break;
				} else {
					System.out.println("로그인 되어있음");
					break;
				}

			case "회원가입": // 회원가입
				System.out.print("아이디 입력: ");
				userVO.setUserIdentification(sc.next());
				if (userDAO.checkId(userVO.getUserIdentification())) {
					System.out.print("비밀번호 입력: ");
					userVO.setUserPassword(sc.next());
					System.out.print("이름 입력: ");
					userVO.setUserName(sc.next());
					System.out.print("전화번호 입력: ");
					userVO.setUserPhone(sc.next());
					System.out.print("닉네임 입력: ");
					userVO.setUserNickname(sc.next());
					System.out.print("이메일 입력: ");
					userVO.setUserEmail(sc.next());
					System.out.print("생년월일 입력: ");
					userVO.setUserBirth(sc.next());

					if (userDAO.register(userVO)) {
						System.out.println("회원가입 성공!");
					} else {
						System.out.println("회원가입 실패!");
					}
				} else {
					System.out.println("이미 존재하는 아이디입니다.");
				}
				break;

			case "아이디 찾기": // 아이디 찾기
				System.out.print("휴대폰 번호 입력: ");
				String phoneNumber = sc.next();
				String foundId = userDAO.findIdByPhoneNumber(phoneNumber);
				if (foundId != null) {
					System.out.println("핸드폰 번호에 해당되는 아이디: " + foundId);
				} else {
					System.out.println("해당 아이디를 찾을 수 없습니다.");
				}
				break;

			case "비밀번호 변경": // 비밀번호 변경
				System.out.print("아이디 입력: ");
				String idForPasswordChange = sc.next();
				System.out.print("새로운 비밀번호 입력: ");
				String newPassword = sc.next();
				if (userDAO.changePassword(idForPasswordChange, newPassword)) {
					System.out.println("비밀번호 변경 성공!");
				} else {
					System.out.println("비밀번호 변경 실패!");
				}
				break;

			case "회원정보 수정": // 회원정보 수정
				System.out.print("아이디 입력: ");
				userVO.setUserIdentification(sc.next());
				if (userDAO.checkId(userVO.getUserIdentification())) {
					System.out.print("이름 입력: ");
					userVO.setUserName(sc.next());
					System.out.print("전화번호 입력: ");
					userVO.setUserPhone(sc.next());
					System.out.print("닉네임 입력: ");
					userVO.setUserNickname(sc.next());
					System.out.print("이메일 입력: ");
					userVO.setUserEmail(sc.next());
					System.out.print("생년월일 입력: ");
					userVO.setUserBirth(sc.next());

					if (userDAO.updateUserInfo(userVO)) {
						System.out.println("회원정보 수정 성공!");
					} else {
						System.out.println("회원정보 수정 실패!");
					}
				} else {
					System.out.println("존재하지 않는 아이디입니다.");
				}
				break;

			case "회원탈퇴": // 회원탈퇴
				System.out.print("아이디 입력: ");
				String identificationForDeletion = sc.next();
				if (userDAO.checkId(identificationForDeletion)) {
					System.out.print("비밀번호 입력: ");
					String passwordForDeletion = sc.next();
					userVO.setUserIdentification(identificationForDeletion);
					userVO.setUserPassword(passwordForDeletion);
					if (userDAO.deleteUserInfo(userVO)) {
						System.out.println("회원정보 삭제 성공!");
					} else {
						System.out.println("회원정보 삭제 실패!");
					}
				} else {
					System.out.println("존재하지 않는 아이디입니다.");
				}
				break;

			default:
				System.out.println("유효하지 않은 선택입니다.");
				break;
			}
		}
	}

}