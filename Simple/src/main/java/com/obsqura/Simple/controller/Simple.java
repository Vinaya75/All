package com.obsqura.Simple.controller;
@Controller
public class Simple {
	@GetMapping("/hello")
    public String sayHello() {
        return "hello"; // goes to hello.jsp
}
