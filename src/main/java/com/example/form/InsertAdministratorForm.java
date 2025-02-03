package com.example.form;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

/**
 * 管理者情報登録時に使用するフォーム.
 * 
 * @author igamasayuki
 * 
 */
public class InsertAdministratorForm {
	/** 名前 */
	@NotBlank(message = "項目ラベルを入力してください")
	@Size(max = 100)
	private String name;
	/** メールアドレス */
	@NotBlank(message = "項目ラベルを入力してください")
	@Size(max = 100, message = "項目ラベルは100文字以下で入力してください")
	@Email(message = "メールアドレスの形式が不正です")
	
	private String mailAddress;
	/** パスワード */
	@NotNull(message = "項目ラベルを入力してください")
	@Pattern(regexp = "^(?=.*[A-Z])(?=.*[.?/-])[a-zA-Z0-9.?/-]{8,24}$", message = "パスワードは8文字以上、20文字以下で英大文字、小文字、数字をそれぞれ少なくとも1文字は使用してください")
	private String password;








	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMailAddress() {
		return mailAddress;
	}

	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "InsertAdministratorForm [name=" + name + ", mailAddress=" + mailAddress + ", password=" + password
				+ "]";
	}

}
