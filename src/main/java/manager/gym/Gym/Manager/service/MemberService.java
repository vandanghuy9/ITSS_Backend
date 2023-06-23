package manager.gym.Gym.Manager.service;


import manager.gym.Gym.Manager.entity.Member;
import manager.gym.Gym.Manager.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MemberService {
    @Autowired
    private MemberRepository memberRepository;

    public List<Member> getAllMembers() {
        return memberRepository.findAll();
    }

    public Member getMemberById(Integer memberId) {
        Optional<Member> optionalMember = memberRepository.findById(memberId);
        return optionalMember.orElse(null);
    }

    public Member createMember(Member member) {
        return memberRepository.save(member);
    }

    public Member updateMember(Integer memberId, Member member) {
        member.setMemberId(memberId);
        return memberRepository.save(member);
    }

    public void deleteMember(Integer memberId) {
        memberRepository.deleteById(memberId);
    }
}

