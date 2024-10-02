package inhatc.cse.seokminshop.member.dto;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder


public class MemberDto {
    private String name;        //UserName
    private String email;       //UserEmail
    private String password;    //UserPassword
    private String address;     //UserAddress


}
