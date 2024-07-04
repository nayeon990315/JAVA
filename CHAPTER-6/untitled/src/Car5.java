public class Car5 {
    int gas;

    // 리턴값이 없는 메소드로 매개값을 받아서 gas 필드값 변경
    void setGas(int gas) {
        this.gas = gas;
    }

    // gas 필드값이 0이면 false, 0이 아니면 true 리턴
    boolean isLeftGas() {
        if(gas == 0) {
            System.out.println("가스가 없습니다.");
            return false;
        }
        System.out.println("가스가 있습니다.");
        return true;
    }

    // gas 필드값이 0이면 return 문으로 메소드를 종료
    void run() {
        while(true) {
            if(gas > 0) {
                System.out.println("달립니다. (gas 잔량 : " + gas + ")");
                gas--;
            } else {
                System.out.println("멈춥니다. (gas 잔량 : " + gas + ")");
                return;
            }
        }
    }
}
