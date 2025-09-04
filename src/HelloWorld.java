/*HelloWorld.java 라는 이름으로 자바 파일을 작성하면 파일은 하나이지만 그 안에 클래스를
여러 개 작성할 수 있다. 다만 클래스명과 파일명이 같으면 그 class 앞에 public을 붙여야한다.*/

//main 메서드 : 시작과 끝을 관리
//HelloWorld 클래스를 실행하려면 main 메서드를 작성해야 한다.
//메서드=함수  , 클래스 내의 함수 -> 메서드
//ie, 자바는 모든 것이 클래스 기반이므로 자바에서 사용하는 함수는 모두 메서드이다.

public class HelloWorld {
    public static void main(String[] args){
        System.out.println("Hello World-!!");
    }
}

/*
 * public : 메서드의 접근 제어자로, 누구나 이 메서드에 접근할 수 있다는 의미
 * static : 메서드에 static이 지정되어 있으면 이 메서드는 인스턴스를 생성하지 않아도 실행할 수 있다는 의미
 * void : 메서드의 리턴값이 없음을 의미 ('텅 빈')
 * String[] : String은 문자열을 나타내는 자바의 자료형
 * args : String[] 자료형의 변수명
 * System.out.println : 표준 출력으로 데이터를 보내는 자바의 내장 메서드로 문자열을 화면에 출력
 */