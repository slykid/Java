/**
 * packageName  : hello.core.discount
 * fileName     : FixDiscountPolicy
 * author       : kilhyunkim
 * date         : 25. 2. 17.
 * description
 * ===================================================
 * DATE                 AUTHOR              NOTE
 * ---------------------------------------------------
 * 25. 2. 17.          kilhyunkim         최초작성
 */
package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;

public class FixDiscountPolicy implements DiscountPolicy {

    private int discountFixAmount = 1000;

    @Override
    public int discount(Member member, int price)
    {
        if (member.getGrade() == Grade.VIP)
        {
            return discountFixAmount;
        }
        else
        {
            return 0;
        }
    }
}
