package chapter13.service;

import chapter13.model.MemberDTO;

public class MemberManagerImpl2 extends MemberManaberAbstract{

	@Override
	public boolean addMember(MemberDTO member) {
		return false;
	}

	@Override
	public boolean removeMember(String name, String phone) {
		return false;
	}

	@Override
	public boolean updateMember(MemberDTO member) {
		return false;
	}
}
