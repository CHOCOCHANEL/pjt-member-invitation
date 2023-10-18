package com.pro.mini;

import com.pro.mini.vo.GroupVO;
import com.pro.mini.vo.InvitationVO;
import com.pro.mini.vo.MemberVO;
import com.pro.mini.vo.UserVO;
import com.pro.mini.service.GroupService;
import com.pro.mini.service.InvitationService;
import com.pro.mini.service.MemberService;
import com.pro.mini.service.UserService;
import org.junit.jupiter.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class MiniApplicationTests {

	private final Logger log = LoggerFactory.getLogger(getClass());

	@Autowired
	private UserService userService;
	@Autowired
	private GroupService groupService;
	@Autowired
	private MemberService memberService;
	@Autowired
	private InvitationService invitationService;
	@Autowired
	private UserVO userVO;
	@Autowired
	private GroupVO groupVO;
	@Autowired
	private MemberVO memberVO;
	@Autowired
	private InvitationVO invitationVO;
	@BeforeAll
	void setUp() {
		userVO = new UserVO("test_user", "010-0000-0000", "test@gmail.com");
		groupVO = new GroupVO("test_group");
		memberVO = new MemberVO(groupVO, userVO, "Y");
		invitationVO = new InvitationVO("/invites/link?test", "N", "N", groupVO, userVO);

		log.info("[DAOs] ::: " +
				"[userDAO] == " + userVO +
				"[groupDAO] == " + groupVO +
				"[memberDAO] == " + memberVO +
				"[invitationDAO] == " + invitationVO);


		groupService.saveGroup(groupVO);
		memberService.saveMember(memberVO);
		invitationService.saveInvitation(invitationVO);

	}
	@Test
	@Order(1)
	void saveUser() {
		setUp();
		userService.saveUser(userVO);
		List<UserVO> userVOList = userService.getAllUsers();
		log.info("userDAOList === {}", userVOList);
	}

}
