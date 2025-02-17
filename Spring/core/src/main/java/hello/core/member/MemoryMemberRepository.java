/**
 * packageName  : hello.core.member
 * fileName     : MemoryMemberRepository
 * author       : kilhyunkim
 * date         : 25. 2. 12.
 * description
 * ===================================================
 * DATE                 AUTHOR              NOTE
 * ---------------------------------------------------
 * 25. 2. 12.          kilhyunkim         최초작성
 */
package hello.core.member;

import java.util.HashMap;
import java.util.Map;

public class MemoryMemberRepository implements MemberRepository {

    private static Map<Long, Member> store = new HashMap<>();

    @Override
    public void save(Member member) {
        store.put(member.getId(), member);
    }

    @Override
    public Member findById(Long memberId) {
        return store.get(memberId);
    }
}
