package com.cafe24.dk4750.miniMarket.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe24.dk4750.miniMarket.vo.ItemSoldout;

@Mapper
public interface SoldoutMapper {
	
	// 판매완료 상품 추가
	public int insertSoldoutItem(ItemSoldout itemSoldout);
	
	// 구매자의 구매완료 리스트
	public List<ItemSoldout> selectBuyListByMember(String memberUniqueNo);
	
	// 구매완료 상품 리스트에서 삭제
	public int deleteBuyItem(int soldoutNo);
}