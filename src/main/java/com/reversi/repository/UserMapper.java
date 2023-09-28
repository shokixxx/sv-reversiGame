package com.reversi.repository;

import org.apache.ibatis.annotations.Mapper;

import com.reversi.dto.UserSearchRequest;
import com.reversi.entity.UserEntity;

/**
 * ユーザー情報 Mapper
 */
@Mapper
public interface UserMapper {
	/**
	 * ユーザー情報検索
	 * @param userSearchRequest 検索用リクエストデータ
	 * @return ユーザー情報
	 */
	UserEntity getUserOne(UserSearchRequest userSearchRequest);
}