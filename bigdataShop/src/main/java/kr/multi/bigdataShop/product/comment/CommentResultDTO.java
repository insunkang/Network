package kr.multi.bigdataShop.product.comment;

public class CommentResultDTO {
	public String word;
	public String count;
	public CommentResultDTO() {
		super();
	}
	public CommentResultDTO(String word, String count) {
		super();
		this.word = word;
		this.count = count;
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public String getCount() {
		return count;
	}
	public void setCount(String count) {
		this.count = count;
	}
	@Override
	public String toString() {
		return "CommentResultDTO [word=" + word + ", count=" + count + "]";
	}
	
	
}
