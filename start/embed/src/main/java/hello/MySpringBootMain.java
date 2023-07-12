package hello;

import hello.boot.MySpringApplication;
import hello.boot.MySpringBootAnnotation;

@MySpringBootAnnotation // 해당 어노테이션을 붙인 대상 클래스(MySpringBootMain)의 패키지 hello 이하로 다 컴포넌트 스캔 대상이 되서 빈 등록됨
public class MySpringBootMain {
    public static void main(String[] args) {
        System.out.println("MySpringBootMain.main");
        MySpringApplication.run(MySpringBootMain.class, args);
    }
}
