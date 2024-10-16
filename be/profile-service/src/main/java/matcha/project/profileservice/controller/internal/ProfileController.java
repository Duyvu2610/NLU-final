package matcha.project.profileservice.controller.internal;

import lombok.RequiredArgsConstructor;
import matcha.project.profileservice.dto.request.ProfileRequestDto;
import matcha.project.profileservice.service.ProfileService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/internal")
@RequiredArgsConstructor
public class ProfileController {
    private final ProfileService profileService;

    @PostMapping
    public ResponseEntity<Object> createProfile(@RequestBody final ProfileRequestDto profileRequestDto) {
        profileService.createProfile(profileRequestDto);
        return ResponseEntity.created(null).build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getProfile(@PathVariable final String id) {
        return ResponseEntity.ok(profileService.getProfile(id));
    }
}
