/**
 * packageName  : hello.core.member
 * fileName     : MemberRepository
 * author       : kilhyunkim
 * date         : 25. 2. 12.
 * description
 * ===================================================
 * DATE                 AUTHOR              NOTE
 * ---------------------------------------------------
 * 25. 2. 12.          kilhyunkim         최초작성
 */
package hello.core.member;

public interface MemberRepository {

    void save(Member member);

    Member findById(Long id);
}
