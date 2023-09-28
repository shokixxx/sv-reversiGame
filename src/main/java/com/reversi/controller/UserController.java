package com.reversi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.reversi.dto.UserSearchRequest;
import com.reversi.entity.UserEntity;
import com.reversi.service.UserService;

/**
 * ユーザー情報 Controller
 */
@Controller
public class UserController {
	/**
	 * ユーザー情報 Service
	 */
	@Autowired
	UserService userService;

	/**
	 * ユーザー情報検索
	 *
	 * @param userSearchRequest リクエストデータ
	 * @return ユーザー情報（JSON形式）
	 */
	@PostMapping("/user/id_search")
	public ResponseEntity<UserEntity> search(@RequestBody UserSearchRequest userSearchRequest) {
		UserEntity user = userService.getUserOne(userSearchRequest);

		if (user != null) {
			return new ResponseEntity<>(user, HttpStatus.OK); // ユーザー情報が見つかった場合、HTTPステータス200と一緒にユーザー情報を返す
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND); // ユーザー情報が見つからなかった場合、HTTPステータス404を返す
		}
	}
}