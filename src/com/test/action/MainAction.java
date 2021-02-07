package com.test.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.test.form.MainForm;

public class MainAction extends Action {

	private final String viewPage = "success";

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		String lstrparam = mapping.getParameter();
		MainForm lobjForm = (MainForm)form;
		lobjForm.setMessage("Hello world");
		
		System.out.println("Start action main");
		return mapping.findForward(viewPage); 
		
		
	}
}
