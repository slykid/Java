/**
 * packageName  : hello.core.member
 * fileName     : MemberService
 * author       : kilhyunkim
 * date         : 25. 2. 12.
 * description
 * ===================================================
 * DATE                 AUTHOR              NOTE
 * ---------------------------------------------------
 * 25. 2. 12.          kilhyunkim         최초작성
 */
package hello.core.member;

public interface MemberService {

    void join(Member member);

    Member findMember(Long memberId);
}
