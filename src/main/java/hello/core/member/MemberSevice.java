package hello.core.member;

public interface MemberSevice {

    void join(Member member);
    Member findMember(Long memberId);
}
