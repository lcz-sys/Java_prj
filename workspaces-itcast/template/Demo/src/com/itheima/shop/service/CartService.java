package com.itheima.shop.service;

import java.util.Map;
import com.itheima.shop.entity.Cart;
import com.itheima.shop.entity.Item;
import com.itheima.shop.entity.Product;

public class CartService {
	private ProductService productService = new ProductService();

	/*
	 * 加入购物车
	 */
	public void addProduct(int pid, int num, Cart cart) throws Exception {
		// 获取购物商品集合
		Map<Integer, Item> map = cart.getMap();
		// 根据商品编号获取商品
		Item item = map.get(pid);
		// 若购物商品为空
		if (item == null) {
			// 创建新购物商品
			item = new Item();
			// 封装购物商品
			Product product = productService.findProductByPid(pid);
			item.setProduct(product);
			item.setNum(num);
			double subTotal = product.getShop_price() * item.getNum();
			item.setSubTotal(subTotal);
			// 将新的购物项加入到购物商品集合中
			map.put(pid, item);
			// 若购物商品不为空
		} else {
			// 更新商品数量和小计
			item.setNum(item.getNum() + num);
			item.setSubTotal(item.getNum() * item.getProduct().getShop_price());
		}
	}

	/*
	 * 删除购物商品
	 */
	public void deleteProduct(int pid, Cart cart) {
		// 获取购物商品集合
		Map<Integer, Item> map = cart.getMap();
		// 根据商品编号删除购物商品
		map.remove(pid);
	}

	/*
	 * 清空购物车
	 */
	public void deleteAllProduct(Cart cart) {
		// 获取购物商品集合
		Map<Integer, Item> map = cart.getMap();
		// 清空购物商品集合
		map.clear();
	}

	/*
	 * 修改购物车中商品的数量
	 */
	public void updateProduct(int pid, int num, Cart cart) {
		// 获取购物商品集合
		Map<Integer, Item> map = cart.getMap();
		// 根据商品编号获取购物商品
		Item item = map.get(pid);
		// 修改购物商品数量
		item.setNum(num);
		// 修改购物商品总计
		item.setSubTotal(item.getNum() * item.getProduct().getShop_price());
	}
}
