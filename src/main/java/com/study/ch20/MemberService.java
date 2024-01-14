package com.study.ch20;

import com.study.ch16.Member;

import java.util.ArrayList;

public interface MemberService {

    public void printMemberService(ArrayList<Member> members)throws Exception ;  //모든 메소드에 예외처리 해줘야함 강제성 부어!
}
