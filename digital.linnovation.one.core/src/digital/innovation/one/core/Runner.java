//Adriano Siqueira - 8/23/21 - Calculadora Modular Java

//-digital.innovation.one.util (module)           |-digital.innovation.one.core (module)
//       -src                                     |     -src
//          -digital.innovation.one.util (package)|         -digital.innovation.one.core (package)
//             -internal (package)                |             Runner(class)
//                 DivHelper(class)               |         module-info.java (package info)
//                 MultiHelper(class)             |
//                 Operacao(class)                |
//                 SubHelper(class)               |
//                 SuHelper(class)                |
//             Calculadora(class)                 |
//             Looping(class)                     |
//          module-info.java (package info)       |


package digital.innovation.one.core;

import digital.innovation.one.util.Looping;

public class Runner {

    public static void main(String[] args) {

        //banner dahora
        System.out.println(" ██████╗ █████╗ ██╗      ██████╗██╗   ██╗██╗      █████╗ ██████╗  ██████╗ ██████╗  █████╗ \n" +
                "██╔════╝██╔══██╗██║     ██╔════╝██║   ██║██║     ██╔══██╗██╔══██╗██╔═══██╗██╔══██╗██╔══██╗\n" +
                "██║     ███████║██║     ██║     ██║   ██║██║     ███████║██║  ██║██║   ██║██████╔╝███████║\n" +
                "██║     ██╔══██║██║     ██║     ██║   ██║██║     ██╔══██║██║  ██║██║   ██║██╔══██╗██╔══██║\n" +
                "╚██████╗██║  ██║███████╗╚██████╗╚██████╔╝███████╗██║  ██║██████╔╝╚██████╔╝██║  ██║██║  ██║\n" +
                "███╗═══███╗ ██████╗═██████╗═██╗╝ ╚██╗██╗ ╚════█████╗ ██████╗═══╝  ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═╝\n" +
                "████╗ ████║██╔═══██╗██╔══██╗██║   ██║██║     ██╔══██╗██╔══██╗                             \n" +
                "██╔████╔██║██║   ██║██║  ██║██║   ██║██║     ███████║██████╔╝                             \n" +
                "██║╚██╔╝██║██║   ██║██║  ██║██║   ██║██║     ██╔══██║██╔══██╗                             \n" +
                "██║ ╚═╝ ██║╚██████╔╝██████╔╝╚██████╔╝███████╗██║  ██║██║  ██║                             \n" +
                "╚═╝     ╚═╝ ╚═════╝ ╚═════╝  ╚═════╝ ╚══════╝╚═╝  ╚═╝╚═╝  ╚═╝                             \n" +
                "                                                                                          ");

            Looping.menu(); //chama modulo looping em util.
    }

}
