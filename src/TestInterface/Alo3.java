package TestInterface;
// khi triển khai 1 interface có phương thức default thì class đó có thể chọn lựa là có kế thừa hay không
// còn đối với phương thức public thì bắt buộc triển khai
public class Alo3 implements ITest{
    @Override
    public String publicMethod() {
        return null;
    }
}
//@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
//@Scope("singleton")
// 2 cách viết