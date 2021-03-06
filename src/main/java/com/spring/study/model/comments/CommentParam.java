package com.spring.study.model.comments;

import com.spring.study.common.model.BaseParam;

public class CommentParam extends BaseParam{
	private String articleId;
	private String writeMemberId;
	private String userId;
	
	public static class Builder extends BaseParam.Builder<Builder>{
		private String articleId;
		private String writeMemberId;
		private String userId;
		
		public Builder(int pageSize, String articleId) {
			super(pageSize);
			this.articleId = articleId;
		}
		public Builder(int startNum, int endNum, String articleId) {
			super(startNum, endNum);
			this.articleId = articleId;
		}
		
		public Builder writeMemberId(String writeMemberId) {
			this.writeMemberId = writeMemberId;
			return this;
		}
		
		public Builder userId(String userId) {
			this.userId = userId;
			return this;
		}
		
		public CommentParam build() {
			super.build();
			return new CommentParam(this);
		}
		
	}

	public CommentParam(Builder builder) {
		super(builder);
		this.articleId = builder.articleId;
		this.writeMemberId = builder.writeMemberId;
		this.userId = builder.userId;
	}

	public String getWriteMemberId() {
		return writeMemberId;
	}

	public String getArticleId() {
		return articleId;
	}

	protected final String getUserId() {
		return userId;
	}
}
