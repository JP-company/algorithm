//package hello.core.order;
//
//import hello.core.discount.FixDiscountPolicy;
//import hello.core.member.*;
//import org.junit.jupiter.api.Test;
//
//import static org.assertj.core.api.Assertions.*;
//
//class OrderServiceImplTest {
//
//
//    MemberService memberService = new MemberServiceImpl();
//    OrderService orderService = new OrderServiceImpl();
//
//    @Test
//    void createOrderV1() {
//        Long memberId = 1L;
//        Member member = new Member(memberId, "memberA", Grade.VIP);
//        memberService.join(member);
//
//        Order order = orderService.createOrder(memberId, "itemA", 10000);
//        assertThat(order.getDiscountPrice()).isEqualTo(1000);
//    }
//
//    @Test
//    void createOrderV2() {
//        Long memberId = 1L;
//        MemoryMemberRepository memoryMemberRepository = new MemoryMemberRepository();
//        memoryMemberRepository.save(new Member(memberId, "name", Grade.VIP));
////        OrderServiceImpl orderService = new OrderServiceImpl(new MemoryMemberRepository(), new FixDiscountPolicy());
//        Order order = orderService.createOrder(1L, "itemA", 10000);
//        assertThat(order.getDiscountPrice()).isEqualTo(1000);
//    }
//}