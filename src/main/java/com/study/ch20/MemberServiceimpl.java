package com.study.ch20;

import com.study.ch16.Member;

import java.util.ArrayList;

public class MemberServiceimpl {


   // @Override
    public void printMemberService(ArrayList<Member> members) throws Exception {
        for(int i=0;i<5;i++){
            System.out.println(members.get(i));
        }
    }
}


