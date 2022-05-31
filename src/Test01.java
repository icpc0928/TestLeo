import javax.management.MBeanServerConnection;
import java.lang.management.ManagementFactory;
import java.util.Properties;

public class Test01 {

//    static Test test = new Test("Leo", 1234156);

    public static void main(String[] args){

        try{
            MBeanServerConnection mbsc = ManagementFactory.getPlatformMBeanServer();
            com.sun.management.OperatingSystemMXBean osMBean = ManagementFactory.newPlatformMXBeanProxy(
                    mbsc, ManagementFactory.OPERATING_SYSTEM_MXBEAN_NAME, com.sun.management.OperatingSystemMXBean.class);
            long mSB = System.currentTimeMillis();
            long nanoBefore = System.nanoTime();
            long cpuBefore = osMBean.getProcessCpuTime();

            dod();
            System.out.println("Todo");
            long cpuAfter = osMBean.getProcessCpuTime();
            long nanoAfter = System.nanoTime();
            long mSA = System.currentTimeMillis();
            long percent;
            if(nanoAfter > nanoBefore){
                percent = ((cpuAfter - cpuBefore) * 100L) / (nanoAfter - nanoBefore);
                System.out.println("p: " + percent);
            }
            System.out.println("NB:" + nanoBefore);
            System.out.println("NA:" + nanoAfter);
            System.out.println("MS:" + (mSA-mSB));
            System.out.println("MS:" + (nanoAfter-nanoBefore));


        }catch(Exception e){
            System.out.println(e.toString());
        }

    }

    static void dod(){
        for(int i = 0; i < 100000; i++){
            System.out.println(i);
        }
    }
}
