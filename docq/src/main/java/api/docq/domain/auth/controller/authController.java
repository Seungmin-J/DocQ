package api.docq.domain.auth.controller;

import api.docq.common.dto.Response;
import api.docq.domain.auth.dto.response.SignUpResponse;
import api.docq.domain.auth.dto.request.SignUpRequest;
import api.docq.domain.auth.service.AuthService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/auth")
@RequiredArgsConstructor
public class authController {
    private final AuthService authService;
    /**
     * 회원가입
     */
    @PostMapping("/sign-in")
    public Response<SignUpResponse> signUp(
            @Valid @RequestBody SignUpRequest signUpRequest
    ) {
        return Response.ok(authService.signUpService(signUpRequest));
    }

    /**
     * 로그인
     */
}
