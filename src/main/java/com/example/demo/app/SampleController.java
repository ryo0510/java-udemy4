package com.example.demo.app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // ユーザの入力値を取得、HTMLの表示の命令
@RequestMapping("/sample") // ドメイン以降のURL
public class SampleController {
	
	@GetMapping("/test")
	public String test(Model model) {
		model.addAttribute("title", "Inquiry Form");
		return "test";
	}

}
