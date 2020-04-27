package kr.multi.bigdataShop.product.comment;

import java.util.List;

public interface ProductCommentDAO {
	int insert(ProductCommentDTO productCommentDTO);
	List<ProductCommentDTO> read(String prd_no);
	List<CommentResultDTO> getCommentResultDTO();
}
