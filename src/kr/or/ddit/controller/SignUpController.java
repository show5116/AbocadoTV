package kr.or.ddit.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.service.MemberServiceImp;
import kr.or.ddit.vo.MemberVO;

@WebServlet("/signUp")
public class SignUpController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private MemberServiceImp memberserivce;
	
	public SignUpController() {
		memberserivce = MemberServiceImp.getInstance();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");

		String mail = request.getParameter("mail");
		String cmd = request.getParameter("cmd");
		
		String result = "";
		if(cmd.equals("checkmember")) {
			result = memberserivce.CheckMember(mail);
		}else if(cmd.equals("resend")) {
			result = memberserivce.Resend(mail);
		}else if(cmd.equals("signUp")){
			String certification = request.getParameter("certification");
			MemberVO vo = new MemberVO();
			vo.setMember_mail(mail);
			vo.setFirstname(request.getParameter("firstname"));
			vo.setLastname(request.getParameter("lastname"));
			vo.setPassword(request.getParameter("password"));
			vo.setRegedent_num(request.getParameter("regidentNumber"));
			vo.setNickname(request.getParameter("nickname"));
			result = memberserivce.InsertMember(vo,certification);
		}else {			
			return;
		}
		request.setAttribute("json", result);
		RequestDispatcher rd = request.getRequestDispatcher("/page/pro/signup-pro.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
