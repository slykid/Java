/**
 * packageName  : hello.core.order
 * fileName     : OrderService
 * author       : kilhyunkim
 * date         : 25. 2. 17.
 * description
 * ===================================================
 * DATE                 AUTHOR              NOTE
 * ---------------------------------------------------
 * 25. 2. 17.          kilhyunkim         최초작성
 */
package hello.core.order;

public interface OrderService {

    Order createOrder(Long memberId, String itemName, int itemPrice);

}
