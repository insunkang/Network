package kr.multi.bigdataShop.product.comment;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductCommentController {
	@Autowired
	ProductCommentService service;
	
	@RequestMapping("/comment/write.do")
	public String insert(ProductCommentDTO productCommentDTO) {
		service.insert(productCommentDTO);
		return "redirect:/product/read.do?prd_no="+productCommentDTO.getPrd_no();
	}
	@RequestMapping("/comment/result.do")
	public String getCommentResult(Model model , HttpServletRequest req) {
		System.out.println(service.getCommentResult());
		List<CommentResultDTO> commentResult = service.getCommentResult();
		model.addAttribute("commentResult", commentResult);
		
		return "comment/result";
	}
	
}
