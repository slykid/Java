/**
 * packageName  : hello.core.discount
 * fileName     : RateDiscountPolicy
 * author       : slykid
 * date         : 25. 2. 19.
 * description
 * ===================================================
 * DATE                 AUTHOR              NOTE
 * ---------------------------------------------------
 * 25. 2. 19.          slykid         최초작성
 */
package hello.core.discount;


import hello.core.member.Grade;
import hello.core.member.Member;

public class RateDiscountPolicy implements DiscountPolicy {

    private int discountPercent = 10;

    @Override
    public int discount(Member member, int price) {
        if(member.getGrade() == Grade.VIP)
        {
            return price * discountPercent / 100;
        }
        else
        {
            return 0;
        }
    }
}
