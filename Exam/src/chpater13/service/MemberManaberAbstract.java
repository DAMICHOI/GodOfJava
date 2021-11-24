package chpater13.service;

import chpater13.model.MemberDTO;

public abstract class MemberManaberAbstract {
	public abstract boolean addMember(MemberDTO member);

	public abstract boolean removeMember(String name, String phone);

	public abstract boolean updateMember(MemberDTO member);

	public void printLog(String data) {
		System.out.println("Data=" + data);
	}
}
