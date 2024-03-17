package kr.boot.basic.config;


import kr.boot.basic.repository.MemberRepository;
import kr.boot.basic.repository.MemoryMemberRepository;
import kr.boot.basic.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService(MemberRepository memberRepository) {
        return new MemberService(memberRepository);
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

}
