package interTest2;

public class InterTest {
	public static void main(String[] args) {
		// InterTest 객체 it
		InterTest it = new InterTest();
		// Music 객체 music1 , HipHop 참조값
		Music music1 = new HipHop();
		// Music 객체 music1 , Rock 참조값
		Music music2 = new Rock();
//      it.cheak(??);
//      3분
		it.check(music1);
		it.check(music2);
		
	}

	void check(Music music) {
      if(music instanceof Ballad) {
//         Ballad로 다운캐스팅
    	  
//         Ballad 클래스에 있는 메소드 호출
    	  
      }else if(music instanceof Ballad) {
//         HipHop 다운캐스팅
    	  
//         HipHop 클래스에 있는 메소드 호출
    	  
      }else {
//         Rock 다운캐스팅
//         Rock 클래스에 있는 메소드 호출
      }
   }
}