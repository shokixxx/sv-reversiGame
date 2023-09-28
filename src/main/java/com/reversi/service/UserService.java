package com.reversi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reversi.dto.UserSearchRequest;
import com.reversi.entity.UserEntity;
import com.reversi.repository.UserMapper;
//import com.reversi.repository.UserMapper;

/**
 * ユーザー情報 Service
 */
@Service
public class UserService {
	/**
	 * ユーザー情報 Mapper
	 */
	@Autowired
	private UserMapper userMapper;

	/**
	 * ユーザー情報検索
	 * @param userSearchRequest リクエストデータ
	 * @return 検索結果
	 */
	public UserEntity getUserOne(UserSearchRequest userSearchRequest) {
		return userMapper.getUserOne(userSearchRequest);
	}
}