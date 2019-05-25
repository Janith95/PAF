package shoppingcartDao;

import java.util.List;

import shoppingcartModel.CartInfo;
import shoppingcartModel.orderDetailInfo;
import shoppingcartModel.orderInfo;
import shoppingcartModel.PaginationResult;
 
public interface OrderDAO {
 
    public void saveOrder(CartInfo cartInfo);
 
    public PaginationResult<orderInfo> listOrderInfo(int page,
            int maxResult, int maxNavigationPage);
    
    public orderInfo getOrderInfo(String orderId);
    
    public List<orderDetailInfo> listOrderDetailInfos(String orderId);
 
}