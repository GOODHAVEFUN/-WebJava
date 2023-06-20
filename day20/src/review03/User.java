package review03;

import java.util.HashMap;
import java.util.Map;

public class User {
   // 필드
   private String name;
   private String password;

   // 생성자
   public User(String name, String password) {
      super();
      this.name = name;
      this.password = password;
   }

   public String getName() {
      return name;
   }

   public String getPassword() {
      return password;
   }
}

class UserMananger {
   private Map<String, User> users;
   private User loginUser;

   public UserMananger() {
      users = new HashMap<>();
      loginUser = null;
   }

   // 메소드
   // 사용자 등록 메소드
   public void registerUser(String name, String passwd) {
      if (users.containsKey(name)) {
         System.out.println("존재하는 사용자입니다");
      } else {
         User user = new User(name, passwd);
         users.put(name, user);
         System.out.println("사용자가 등록되었습니다");
      }
   }

   // 사용자 로그인기능 메소드
   public void login(String name, String passwd) {
      if(loginUser != null) {
         System.out.println("이미 로그인 되어있습니다");
         return;
      }
      
      User user = users.get(name);
      if(user == null) {
         System.out.println("사용자가 존재하지 않습니다");
      }else if(!user.getPassword().equals(passwd)) {
         System.out.println("비밀번호가 일치하지 않습니다");
      }else {
         loginUser = user;
         System.out.println("로그인 되었습니다");
      }
   }
   
   //사용자 로그아웃 기능 메소드
   public void logout() {
      if(loginUser == null) {
         System.out.println("로그인된 사용자가 없습니다");
      }else {
         loginUser = null;
         System.out.println("로그아웃 되었습니다");
      }
   }
   
   //프로필 수정기능 메소드
   public void updateUser(String newPasswd) {
      if(loginUser == null) {
         System.out.println("로그인된 사용자가 없습니다");
      }else {
         loginUser = new User(loginUser.getName(), newPasswd);
         System.out.println("프로필이 업데이트 되었습니다");
      }
   }
}
   