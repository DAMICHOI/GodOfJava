package chpater13.util;

import chpater13.model.MemberDTO;

public class FinalReferenceType {
	final MemberDTO dto = new MemberDTO();

	public static void main(String[] args) {
		FinalReferenceType referenceType = new FinalReferenceType();
		referenceType.checkDTO();
	}

	private void checkDTO() {
		System.out.println(dto);
		dto.name = "Sangmin";
		System.out.println(dto);
	}
}
