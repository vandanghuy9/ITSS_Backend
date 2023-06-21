package manager.gym.Gym.Manager.controller;

import manager.gym.Gym.Manager.entity.Membership;
import manager.gym.Gym.Manager.repository.MembershipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/memberships")
public class MembershipController {
    private final MembershipRepository membershipRepository;

    @Autowired
    public MembershipController(MembershipRepository membershipRepository) {
        this.membershipRepository = membershipRepository;
    }

    @GetMapping
    public List<Membership> getAllMemberships() {
        return membershipRepository.findAll();
    }

    @PostMapping
    public Membership createMembership(@RequestBody Membership membership) {
        return membershipRepository.save(membership);
    }

    @GetMapping("/{id}")
    public Membership getMembershipById(@PathVariable Integer id) {
        return membershipRepository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Membership updateMembership(@PathVariable Integer id, @RequestBody Membership membership) {
        membership.setMembershipId(id);
        return membershipRepository.save(membership);
    }

    @DeleteMapping("/{id}")
    public void deleteMembership(@PathVariable Integer id) {
        membershipRepository.deleteById(id);
    }
}

