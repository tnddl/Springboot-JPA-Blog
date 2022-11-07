package com.example.demo.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Controller//스프링이 com.example.demo패키지 이하를 스캔해서 모든파일을 메모리에 new하는 것은 아니구요
//특정 어노테이션이 붙여있는 클래스파일들을 new해서(IoC)스프링 컨테이너에 관리해줍니다.,
@RestController
public class BoardControllerTest {
 //http://localhost:8080/test/hello
 @GetMapping("/test/hello")
  public String hello() {
	  return "<h1>hello Spring boot</h1>";
  }
}
