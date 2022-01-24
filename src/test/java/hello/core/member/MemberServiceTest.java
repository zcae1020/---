package hello.core.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {

    MemberService memberSevice = new MemberServiceImpl();

    @Test
    void join(){
        //given
        Member member = new Member(1L, "memberA", Grade.VIP);

        //when
        memberSevice.join(member);
        Member findMember = memberSevice.findMember(1L);

        //then
        Assertions.assertThat(member).isEqualTo(findMember);
    }
}
