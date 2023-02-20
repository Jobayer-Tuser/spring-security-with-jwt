package springsecuritywithjwt.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springsecuritywithjwt.service.AuthenticationService;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class AuthenticationController {

    private final AuthenticationService authenticationService;
    @PostMapping("register")
    public ResponseEntity<AuthenticationResponse> userRegistration(@RequestBody RegisterRequest request){
        return ResponseEntity.ok(authenticationService.registerAUser(request));
    }
    @PostMapping("authenticate")
    public ResponseEntity<AuthenticationResponse> userAuthentication(@RequestBody AuthenticationRequest request){
        return ResponseEntity.ok(authenticationService.authenticateUser(request));
    }
}
