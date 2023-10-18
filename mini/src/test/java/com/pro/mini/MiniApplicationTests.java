package com.pro.mini;

import com.pro.mini.dao.GroupDAO;
import com.pro.mini.dao.InvitationDAO;
import com.pro.mini.dao.MemberDAO;
import com.pro.mini.dao.UserDAO;
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
	private UserDAO userDAO;
	@Autowired
	private GroupDAO groupDAO;
	@Autowired
	private MemberDAO memberDAO;
	@Autowired
	private InvitationDAO invitationDAO;
	@BeforeAll
	void setUp() {
		userDAO = new UserDAO("test_user", "010-0000-0000", "test@gmail.com");
		groupDAO = new GroupDAO("test_group");
		memberDAO = new MemberDAO(groupDAO, userDAO, "Y");
		invitationDAO = new InvitationDAO("/invites/link?test", "N", "N", groupDAO, userDAO);

		log.info("[DAOs] ::: " +
				"[userDAO] == " + userDAO +
				"[groupDAO] == " + groupDAO +
				"[memberDAO] == " + memberDAO +
				"[invitationDAO] == " + invitationDAO);


		groupService.saveGroup(groupDAO);
		memberService.saveMember(memberDAO);
		invitationService.saveInvitation(invitationDAO);

	}
	@Test
	@Order(1)
	void saveUser() {
		setUp();
		userService.saveUser(userDAO);
		List<UserDAO> userDAOList = userService.getAllUsers();
		log.info("userDAOList === {}", userDAOList);
	}

}
