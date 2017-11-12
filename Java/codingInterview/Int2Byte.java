class Int2Byte {
    public void intToByte(int value) {
        System.out.println(Integer.toBinaryString(value));
        System.out.println(Integer.toBinaryString((byte)(value >> 24)));
        System.out.println(Integer.toBinaryString((byte)(value >> 16)));
        System.out.println(Integer.toBinaryString((byte)(value >> 8)));
        System.out.println(Integer.toBinaryString((byte)value));
        
        byte[] array = new byte[4];
        array[0] = (byte)(value >> 24);
        array[1] = (byte)(value >> 16);
        array[2] = (byte)(value >> 8);
        array[3] = (byte)value;
        for(int i = 0; i < array.length; i++) {
            System.out.println((array[i]&0xff) + ", " + Integer.toBinaryString(array[i]&0xff));
        }
    }

    public int byteToInt(byte data[], int idx)
    {
       return
       (
          /*
          16진수 0xFF는 255를 나타낸다.
          0xFF를 & (AND 연산)하는 이유는
          원래 음수가 아니었는데 byte로 자르다보면 부호비트에 1이 들어와서 음수가 되는 경우가 있다.
          그 음수값을 다시 복구하기 위해서 0xFF를 2진수(마지막 8비트만 1이고 나머지는 0)로 AND 연산하면 부호비트는 0이 되어 본래 부호 그대로 들어오고 8비트는 그대로 복원될 수 있다.
          이것을 다시 쉬프팅하고 OR연산을 하면 이전의 int 값이 나오게 된다.
          | (OR연산) 대신 + 를 해도 되지만 비트연산이 더 빠르기 때문에 OR연산을 사용한다.
          */
          ((data[idx] & 0xFF) << 24) |
          ((data[idx] & 0xFF) << 16) |
          ((data[idx] & 0xFF) << 8) |
          (data[idx] & 0xFF)
       );
    }
    
    public static void main(String[] args) {
        Int2Byte obj = new Int2Byte();
        obj.intToByte(3542);
    }
}

//http://egloos.zum.com/littletrue/v/4096524
//http://emflant.tistory.com/133