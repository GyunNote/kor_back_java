package com.study.ch15;

public class SendMain {
    public static void main(String[] args) {

        SendData<String> sendData1 = new SendData<String>(200,"김도균");
   //     sent(sendData1);
        SendData<Member03> sendData2 = new SendData<Member03>(200,new Member03("김도균", "010651620"));
        sent(sendData2);
        SendData<VipMember> sendData3 = new SendData<>(200,new VipMember("김도균", "156132132"));
        sent(sendData3);
    }

    public static void sent(SendData<? super VipMember> sendData){    //제네릭의 와일드카드 : ?
        sendData.send();

    }
}
//와일드 카드 제한 : ex1) super ~~~~ : 내 위에 모든 것
//                ex2) extends ~~~~ : 내 밑에 모든 것