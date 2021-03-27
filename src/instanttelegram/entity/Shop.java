/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instanttelegram.entity;

import java.util.ArrayList;

/**
 *
 * @author luckysetiawan
 */
public class Shop {
    private User wishBy;
    private ArrayList<ShopItem> listOfWish = new ArrayList<>();
    
    private void addToWishlist(ShopItem item) {
        listOfWish.add(item);
    }
    
    private boolean removeFromWishlist(ShopItem item) {
        boolean isRemoved = listOfWish.remove(item);
        return isRemoved;
    }
}
