package demo;

import demo.examples.snmpwalk.*;
import demo.examples.snmpget.*;
public class Main {
    public static void main(String[] args) throws Exception {
        // String IP, int Port, String Community, String OID, boolean BulkOpt
        // TestSnmpWalkV1AndV2c.SnmpV2c("203.235.222.144", 161, "g10ry2HXs3", "1.3.6.1.4.1.9.2.1.57", true);
        TestSnmpGetV2c.main(new String[] {"203.235.199.20 161", "g10ry2HXs3", "1.3.6.1.2.1.2.2.1.16.7"});
        TestSnmpGetV3.main(new String[] {"203.235.222.242", "161", "skcc", "SHA", "g10ry2HXs3", "1.3.6.1.4.1.1916.1.32.1.4.1.7.1"});
    }
}