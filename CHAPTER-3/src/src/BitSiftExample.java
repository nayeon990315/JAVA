public class BitSiftExample {
    public static void main(String[] args) {
        int value = 772;  // [00000000] [00000000] [00000011] [00000100]

        // 우측으로 24bit 이동하고 끝 1 바이트 [00000000]만 읽음
        byte byte1 = (byte) (value >> 24);
        int int1 = byte1 & 255;
        System.out.println("첫 번째 바이트 부호 없는 값: " + int1);

        byte byte2 = (byte) (value >> 16);
        int int2 = byte2 & 255;
        System.out.println("두 번째 바이트 부호 없는 값: " + int2);

        byte byte3 = (byte) (value >> 8);
        int int3 = byte3 & 255;
        System.out.println("세 번째 바이트 부호 없는 값: " + int3);

        byte byte4 = (byte) value;
        int int4 = byte4 & 255;
        System.out.println("네 번째 바이트 부호 없는 값: " + int4);
    }
}
