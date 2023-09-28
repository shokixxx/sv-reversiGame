package com.reversi.dto;

import java.io.Serializable;

import lombok.Data;

/**
 * ユーザー情報 検索用リクエストデータ
 */
@Data
public class UserSearchRequest implements Serializable {

	/**
	 * ユーザー名
	 */
	private String userName;

	/**
	 * パスワード
	 */
	private String password;
}