package com.company;

public class TCPHeader {
    private String sourcePort;
    private String destPort;
    private String seqNo;
    private String ackNo;
    private String dataOffset;
    private String flags;
    private String rcvWindow;
    private String checksum;
    private String urgentPTR;


    public TCPHeader(String input){
        this.sourcePort = input.substring(0,4);
        this.destPort = input.substring(4,8);
        this.seqNo = input.substring(8,16);
        this.ackNo = input.substring(16,24);
        this.dataOffset = input.substring(24,26);
        this.flags = input.substring(26,28);
        this.rcvWindow = input.substring(28,32);
        this.checksum = input.substring(32,36);
        this.urgentPTR = input.substring(36);

    }

    public String getSourcePort(){
        return this.sourcePort;
    }
    public String getDestPort(){
        return this.destPort;
    }
    public String getSeqNo(){
        return this.seqNo;
    }
    public String getAckNo(){
        return this.ackNo;
    }
    public String getDataOffset(){
        return this.dataOffset;
    }
    public String getFlags(){
        return this.flags;
    }
    public String getRcvWindow(){
        return this.rcvWindow;
    }
    public String getUrgentPTR(){
        return this.urgentPTR;
    }
    public  String getChecksum(){
        return this.checksum;
    }

}
