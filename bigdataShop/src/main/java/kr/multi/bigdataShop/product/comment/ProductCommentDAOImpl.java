package kr.multi.bigdataShop.product.comment;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("productCommentDAO")
public class ProductCommentDAOImpl implements ProductCommentDAO {
	@Autowired
	SqlSession sqlSession;
	
	@Override
	public int insert(ProductCommentDTO productCommentDTO) {
		
		return sqlSession.insert("kr.multi.bigdataShop.comment.insert",productCommentDTO);
	}

	@Override
	public List<ProductCommentDTO> read(String prd_no) {
		
		return sqlSession.selectList("kr.multi.bigdataShop.comment.select",prd_no);
	}

	@Override
	public List<CommentResultDTO> getCommentResultDTO() {
		
		return sqlSession.selectList("kr.multi.bigdataShop.comment.select2");
	}

	

}
