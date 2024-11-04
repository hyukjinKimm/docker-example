package docker.example.demo.service;

import docker.example.demo.Member;
import docker.example.demo.repository.MemberRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository){
        this.memberRepository = memberRepository;
    }

    public void createMember(String name) {
        memberRepository.save(new Member(name));
    }

    public List<Member> getMembers() {
        return memberRepository.findAll();
    }
}
