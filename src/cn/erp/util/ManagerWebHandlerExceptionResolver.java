package cn.erp.util;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

// import com.taotao.common.utils.ExceptionUtil;
/**
 * 全局异常处理器
 *
 */
public class ManagerWebHandlerExceptionResolver implements HandlerExceptionResolver {

	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception ex) {
		
		ex.printStackTrace();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("error");
		String string = ExceptionUtil.getStackTrace(ex);
		modelAndView.addObject("error", string);
		//发邮件
		//发短信
		
		return modelAndView;
	}

}
