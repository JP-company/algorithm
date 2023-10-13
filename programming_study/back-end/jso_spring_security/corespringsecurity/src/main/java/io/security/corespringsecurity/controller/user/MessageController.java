package io.security.corespringsecurity.controller.user;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MessageController {

	@GetMapping(value = "/messages")
	public String mypage() throws Exception {

		return "user/messages";
	}

	@GetMapping("/api/messages")
	@ResponseBody
	public String apiMessage() {
		return "messages ok";
	}

	@PostMapping("/api/messages")
	public ResponseEntity<String> createMessage(@RequestBody String message) {
		// 이 메서드에서 요청 처리 로직을 구현합니다.
		// 요청 본문(message)를 파싱하고 적절한 응답을 생성합니다.

		// 예를 들어, 간단한 응답을 반환하는 경우:
		return ResponseEntity.ok("Message created successfully");
	}
}
