package com.company;

import java.io.Console;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here


       // Console c = System.console();



        System.out.println("Program Starting");
  //      Scanner scanner = new Scanner(System.in);
  //      System.out.println("Program in Progress");
   //     String frame = scanner.nextLine();

        String frame = "00000cd9fa880000b4a015c108004500002804044000800642a080d3a03c800a1314043a001554f1f209d67ddf9d5010405ab9e80000";

        System.out.println("Ethernet Frame");
        System.out.println("______________________");
        EthernetHeader ethernetFrame = new EthernetHeader(frame);
        System.out.println("Ethernet Destination:" + ethernetFrame.getDestAddress());
        System.out.println("Ethernet Source:" + ethernetFrame.getSrcAddress());
        System.out.println("Ethernet Type:" + ethernetFrame.getType());
        System.out.println("Ethernet CRC:" + ethernetFrame.getData());

        System.out.println("IP Frame");
        System.out.println("______________________");

        IPHeader ipHeader = ethernetFrame.getIPHeader();

        System.out.println("IP IPV:" + ipHeader.getIPV());
        System.out.println("IP Precedence:" + ipHeader.getPrecedence());
        System.out.println("IP Total Length:" + ipHeader.getTotalLength());
        System.out.println("IP Identification:" + ipHeader.getIdentification());
        System.out.println("IP Fragmentation:" + ipHeader.getFragmentation());
        System.out.println("IP TTL:" + ipHeader.getTtl());
        System.out.println("IP Protocol:" + ipHeader.getProtocol());
        System.out.println("IP Checksum:" + ipHeader.getChecksum());
        System.out.println("IP SRC IP ADD:" + ipHeader.getSrcIPAdd());
        System.out.println("IP DEST IP ADD:" + ipHeader.getDestIPAdd());

        System.out.println("TCP Frame");
        System.out.println("______________________");

        TCPHeader tcpHeader = ipHeader.getTCPFrame();

        System.out.println("TCP Source Port:" + tcpHeader.getSourcePort());
        System.out.println("TCP Dest Port:" + tcpHeader.getDestPort());
        System.out.println("TCP Seq No:" + tcpHeader.getSeqNo());
        System.out.println("TCP Ack No:" + tcpHeader.getAckNo());
        System.out.println("TCP Get Data Offset:" + tcpHeader.getDataOffset());
        System.out.println("TCP Get Flags :" + tcpHeader.getFlags());
        System.out.println("TCP Get CheckSum  :" + tcpHeader.getChecksum());
        System.out.println("TCP Get RCV Window :" + tcpHeader.getRcvWindow());
        System.out.println("TCP Get UrgentPTR  :" + tcpHeader.getUrgentPTR());


        System.out.println("Program Complete");


    }
}
