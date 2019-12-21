package com.webcorestone.DMS.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.webcorestone.DMS.model.Comment;
import com.webcorestone.DMS.model.LikeDetails;
import com.webcorestone.DMS.model.LoginDetails;
import com.webcorestone.DMS.model.NursDetails;
import com.webcorestone.DMS.model.postDetails;
import com.webcorestone.DMS.serviceI.NursServiceI;

@RestController
@RequestMapping(value = "/nurse")
public class NursController {

	@Autowired
	NursServiceI sr;

	@PostMapping(value = "/reg")
	public String register(@RequestBody NursDetails n) {

		System.out.println(n.getNursFirstName());

		sr.register(n);
		return "success";
	}

	@GetMapping("/{loginUserName}/{loginPassword}")
	public NursDetails login(@PathVariable String loginUserName, @PathVariable String loginPassword) {
	
		NursDetails nd = new NursDetails();
		LoginDetails ld = sr.login(loginUserName, loginPassword);

		System.out.println(ld.getLoginId());
		int role = ld.getRole();
		int id = ld.getLoginId();
		if (ld.getStatus().equals("active") && role == 105) {
			nd = sr.getNurse(id);

		} else {
			System.out.println("not found");
		}

		return nd;

	}

	@DeleteMapping("/del/{nursId}")
	public String delete(@PathVariable String nursId) {
		int id = Integer.parseInt(nursId);
		sr.delete(id);
		return "success";
	}

	@RequestMapping(value = "/update")
	public String update(@RequestBody NursDetails n) {
		sr.update(n);
		return "success";
	}
	
	@GetMapping("/like/{pId}")
	public String Like(@PathVariable("pId") int pId) {
		System.out.println(pId);
		postDetails pd = sr.Like(pId);
		System.out.println(pd.getpId());
		LikeDetails ldd = pd.getLike();
		System.out.println(ldd.getLcount());
		int count = ldd.getLcount();
		System.out.println(count);
		int newcount = count + 1;
		ldd.setLcount(newcount);

		sr.LikeCount(ldd);
		

		return "success";

	}
	
	@GetMapping("/unlike/{pId}")
	public String UnLike(@PathVariable int pId) {

		postDetails pd = sr.UnLike(pId);
		LikeDetails ldd = pd.getLike();
		int count = ldd.getLcount();

		int newcount = count - 1;
		ldd.setLcount(newcount);

		ldd = sr.UnLikeCount(ldd);
		int pid = pd.getpId();

		return "success";

	}
	
	  
	  @PostMapping("/comm/{pId}") 
	  public String comment(@RequestBody Comment c,@PathVariable int pId)
	  {
	  postDetails pd=sr.getpost(pId);
	     pd.getCom().add(c);
	     sr.savecomment(c);
	  return "success";
	  
	  }
	  
	
	  @PostMapping("/addpost") 
	  public String addpost(@RequestBody postDetails pda)
	  {
		  sr.addpost(pda); 
		  
		  return "success"; 
		  
	  }
	  
	  @GetMapping("/getpost/{pId}")
	  public postDetails viewpost(@PathVariable("pId") int pId)
	  {
		 postDetails pda= sr.viewpost(pId);
		 
		 return pda;
	  }
	 

}
