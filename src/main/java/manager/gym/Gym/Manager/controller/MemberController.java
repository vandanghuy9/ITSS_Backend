package manager.gym.Gym.Manager.controller;

import manager.gym.Gym.Manager.entity.Member;
import manager.gym.Gym.Manager.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/members")
public class MemberController {
    private final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping
    public List<Member> getAllMembers() {
        return memberService.getAllMembers();
    }

    @GetMapping("/{memberId}")
    public Member getMemberById(@PathVariable Integer memberId) {
        return memberService.getMemberById(memberId);
    }

    @PostMapping
    public Member createMember(@RequestBody Member member) {
        return memberService.createMember(member);
    }

    @PutMapping("/{memberId}")
    public Member updateMember(@PathVariable Integer memberId, @RequestBody Member member) {
        return memberService.updateMember(memberId, member);
    }

    @DeleteMapping("/{memberId}")
    public void deleteMember(@PathVariable Integer memberId) {
        memberService.deleteMember(memberId);
    }
}