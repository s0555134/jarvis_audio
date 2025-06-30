package jarvis_audio.s0555134;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class Controller {
	@GetMapping("/jarvis/hello")
	public String requestMethodName(@RequestParam String param) {
		return new String("hello Jarvis");
	}
	
}
