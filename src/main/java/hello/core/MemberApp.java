package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberServiceImpl;
import hello.core.member.MemberService;

public class MemberApp {
    public static void main(String[] args) {
        MemberService memberSevice = new MemberServiceImpl();

        Member member = new Member(1L, "memberA", Grade.VIP);
        memberSevice.join(member);

        Member findMember = memberSevice.findMember(1L);
        System.out.println("findMember = " + findMember.getName());
        System.out.println("member = " + member.getName());
    }
}
