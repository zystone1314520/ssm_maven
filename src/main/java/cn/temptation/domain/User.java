package cn.temptation.domain;

public class User {
	  private Integer userid;
	    private String username;
	    private String password;
	    private String email;
	    
		// 构造函数
	    public User() {
	        super();
	    }

	    public User(String username, String password,String email) {
	        super();
	        
	        this.username = username;
	        this.password = password;
	        this.email = email;
	    }

	    // 成员方法
	    public Integer getUserid() {
	        return userid;
	    }

	    public void setUserid(Integer userid) {
	        this.userid = userid;
	    }

	    public String getUsername() {
	        return username;
	    }

	    public void setUsername(String username) {
	        this.username = username;
	    }

	    public String getPassword() {
	        return password;
	    }

	    public void setPassword(String password) {
	        this.password = password;
	    }
	    public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

}
