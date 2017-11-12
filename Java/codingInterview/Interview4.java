class Interview4 {
    public static int mux(DataRecords data, int muxNum) {
        if(data.next == null) {
            return muxNum;
        }
        if(data.value % 5 == 0) {
            muxNum *= data.value;
        }
        return mux(data.next, muxNum);
    }
    
    public static void main(String[] args) {
        DataRecords data1 = new DataRecords(1);
        DataRecords data2 = new DataRecords(2);
        DataRecords data3 = new DataRecords(5);
        DataRecords data4 = new DataRecords(10);
        DataRecords data5 = new DataRecords(12);
        DataRecords data6 = new DataRecords(15);
        DataRecords data7 = new DataRecords(17);
        DataRecords data8 = new DataRecords(20);
        DataRecords data9 = new DataRecords(22);
        data1.next = data2;
        data2.next = data3;
        data3.next = data4;
        data4.next = data5;
        data5.next = data6;
        data6.next = data7;
        data7.next = data8;
        data8.next = data9;
        data9.next = null;
        System.out.println(mux(data1, 1));
    }
}

class DataRecords{
    int value;
    DataRecords next;

    DataRecords(int value) {
        this.value = value;
    }
}

