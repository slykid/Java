/**
 * packageName  : hello.core.discount
 * fileName     : DiscountPolicy
 * author       : kilhyunkim
 * date         : 25. 2. 17.
 * description
 * ===================================================
 * DATE                 AUTHOR              NOTE
 * ---------------------------------------------------
 * 25. 2. 17.          kilhyunkim         최초작성
 */
package hello.core.discount;

import hello.core.member.Member;

public interface DiscountPolicy {

    /**
     * @return 할인 대상 금액
     */
    int discount(Member member, int price);
}
