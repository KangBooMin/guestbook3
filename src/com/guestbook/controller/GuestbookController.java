package com.guestbook.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.guestbook.dao.GuestbookDao;
import com.guestbook.vo.GuestbookVo;

@Controller
public class GuestbookController {

	@Autowired
	private GuestbookDao dao;

	@RequestMapping("/list")
	public String list(Model model) {
		List<GuestbookVo> list = dao.getlist();
		System.out.println(list);
		model.addAttribute("list", list);
		return "guestbook/list";
	}

	@RequestMapping("/add")
	public String add(@ModelAttribute GuestbookVo vo) {
		dao.insert(vo);
		return "redirect:/list";
	}

	@RequestMapping("/deleteform")
	public String deleteform(@RequestParam("no") int no, Model model) {       
		System.out.println("deleteform 도착");
		System.out.println(no);
		model.addAttribute("no", no);
		return "/guestbook/deleteform";
	}

	@RequestMapping("/delete")
	public String delete(@ModelAttribute GuestbookVo vo) {
		dao.delete(vo);
		return "redirect:/list";
	}

}