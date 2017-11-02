package com.company;

public class EthernetHeader {

    private String destAddress;
    private String srcAddress;
    private String type;
    private String data;
    private String crc;
    private IPHeader IPHeader;


    public EthernetHeader(String input){

        this.destAddress = input.substring(0,12);
        this.srcAddress = input.substring(12,24);
        this.type = input.substring(24,28);

        this.IPHeader = new IPHeader(input.substring(28));
        //what is CRC


    }


    public String getDestAddress(){
        return this.destAddress;

    }

    public String getSrcAddress(){
        return this.srcAddress;

    }

    public String getType(){
        return this.type;

    }

    public String getData(){
        return this.data;

    }

    public String getCRC(){
        return this.crc;

    }

    public IPHeader getIPHeader(){
        return this.IPHeader;

    }





}
