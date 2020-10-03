package servlet;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import db.DB;
import model.LyTable;
import model.User;

public class AddServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setCharacterEncoding("gb2312");
		resp.setContentType("gb2312");
		String title = req.getParameter("title");
		String content1 = req.getParameter("content1");
		User user = (User)req.getSession().getAttribute("user");
		LyTable lyTable = new LyTable();
		lyTable.setUserId(user.getId());
		lyTable.setDate(new Date(System.currentTimeMillis()));
		lyTable.setTitle(title);
		lyTable.setContent1(content1);
		if(new DB().addInfo(lyTable)) {
			resp.sendRedirect("success.jsp");
		}
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
}
