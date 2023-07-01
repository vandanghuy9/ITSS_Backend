package manager.gym.Gym.Manager.controller;

import manager.gym.Gym.Manager.entity.Membership;
import manager.gym.Gym.Manager.service.MembershipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/memberships")
@CrossOrigin(origins = "http://localhost:8080")
public class MembershipController {
    private final MembershipService membershipService;

    @Autowired
    public MembershipController(MembershipService membershipService) {
        this.membershipService = membershipService;
    }

    @GetMapping
    public List<Membership> getAllMemberships() {
        return membershipService.getAllMemberships();
    }

    @GetMapping("/{membershipId}")
    public Membership getMembershipById(@PathVariable Integer membershipId) {
        return membershipService.getMembershipById(membershipId);
    }

    @PostMapping
    public Membership createMembership(@RequestBody Membership membership) {
        return membershipService.createMembership(membership);
    }

    @PutMapping("/{membershipId}")
    public Membership updateMembership(@PathVariable Integer membershipId, @RequestBody Membership membership) {
        return membershipService.updateMembership(membershipId, membership);
    }

    @DeleteMapping("/{membershipId}")
    public void deleteMembership(@PathVariable Integer membershipId) {
        membershipService.deleteMembership(membershipId);
    }
}
