package com.reversi.entity;

import lombok.Data;

/**
 * ユーザー情報 Entity
 */
@Data
public class UserEntity {

	/**
	 * ユーザーID
	 */
	private Long userId;

	/**
	 * ユーザー名
	 */
	private String userName;

	/**
	 * パスワード
	 */
	private String password;

	/**
	 * メールアドレス
	 */
	private String email;

	/**
	 * 権限
	 */
	private String role;
}