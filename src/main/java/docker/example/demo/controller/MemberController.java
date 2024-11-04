package docker.example.demo.controller;

import docker.example.demo.Member;
import docker.example.demo.MemberDto;
import docker.example.demo.service.MemberService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/members")
public class MemberController {


    private final MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }


    @GetMapping("/")
    public List<Member> get() {
        List<Member> members = memberService.getMembers();
        System.out.println(members);
        adsdadskjasd
        return members;
    }

    @PostMapping("/")
    public void post(@RequestBody MemberDto memberDto) {
        memberService.createMember(memberDto.getName());
    }
}
