package kr.or.ddit.controller;

import java.io.IOException;
import java.io.PrintWriter;

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
	private static final String swOK = "{ \"sw\" : \"ok\"  }";
	private static final String swNO = "{ \"sw\" : \"no\"  }";
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
		
		PrintWriter out = response.getWriter();
		if(cmd.equals("checkmember")) {
			if(memberserivce.CheckMember(mail)) out.print(swOK);
			else out.print(swNO);
			return;
		}else if(cmd.equals("resend")) {
			if(memberserivce.Resend(mail)) out.print(swOK);
			else out.print(swNO);
			return;
		}else if(cmd.equals("signUp")){
			String certification = request.getParameter("certification");
			MemberVO vo = new MemberVO();
			vo.setMember_mail(mail);
			vo.setFirstname(request.getParameter("firstname"));
			vo.setLastname(request.getParameter("lastname"));
			vo.setPassword(request.getParameter("password"));
			if(memberserivce.InsertMember(vo,certification)) out.print(swOK);
			else out.print(swNO);
			return;
		}else {
			out.print(swNO);
			return;
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
