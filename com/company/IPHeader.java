package com.company;

public class IPHeader {

    private String IPV;
    private String precedence;
    private String totalLength;
    private String identification;
    private String fragmentation;
    private String ttl;
    private String protocol;
    private String checksum;
    private String srcIPAdd;
    private String destIPAdd;
    private TCPHeader TCPHeader;






    public IPHeader(String input){
        if(input.equals(null)){
            System.out.println("null");
        }else if(input.equals(""))
            System.out.println("empty");
        else{
            System.out.println(input);
        }

        this.IPV = input.substring(0,2);

        this.precedence = input.substring(2,4);
        this.totalLength = input.substring(4,8);
        this.identification = input.substring(8,12);
        this.fragmentation = input.substring(12,16);
        this.ttl = input.substring(16,18);
        this.protocol = input.substring(18,20);
        this.checksum = input.substring(20,24);
        this.srcIPAdd = input.substring(24,32);
        this.destIPAdd = input.substring(32,40);
        this.TCPHeader = new TCPHeader(input.substring(40));

    }

    public String getIPV(){
        return this.IPV;
    }

    public String getPrecedence(){
        return this.precedence;
    }
    public String getTotalLength(){
        return this.totalLength;
    }

    public String getIdentification(){
        return this.identification;
    }

    public String getFragmentation(){
        return this.fragmentation;
    }

    public String getTtl(){
        return this.ttl;
    }

    public String getProtocol(){
        return this.protocol;
    }

    public String getChecksum(){
        return this.checksum;
    }

    public String getSrcIPAdd(){
        return this.srcIPAdd;
    }

    public String getDestIPAdd(){
        return this.destIPAdd;
    }

    public TCPHeader getTCPFrame(){
        return this.TCPHeader;
    }

}
