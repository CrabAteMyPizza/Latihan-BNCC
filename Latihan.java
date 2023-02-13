import java.io.PrintStream;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class MeksikoProgram {

    class Employee {
        String Id;
        String Name;
        String Gender;
        String Position;
        int Salary;
    }

    public static void main(String[] args) {
        System.out.printf("Pick Option Insert, View, Delete, Update, Exit (Not-Case Sensitive)\n");
        ArrayList<Employee> EmpolyeeList = new ArrayList<Employee>();

        do
        {
            Scanner Tracer = new Scanner(System.in); //Buat Scanner Input
            System.out.printf("\nPick Your Option: ");

            String Option;
            Option = Tracer.nextLine();
            
            if(Option.equalsIgnoreCase("Insert"))
            {
                int Quantity;
                System.out.printf("Quantity of Insertion: ");
                Quantity = Tracer.nextInt();

                for(int i = 0; i < Quantity; i++)
                {
                    String TempId;
                    String TempName;
                    String TempGender;
                    String TempPosition;
                    int TempSalary;

                    Tracer.nextLine();
                    System.out.printf("Input nama karyawan [>= 3]: ");
                    TempName = Tracer.nextLine();
                    System.out.printf("Input jenis kelamin [Laki-laki | Perempuan] (Case Sensitive): ");
                    TempGender = Tracer.nextLine();
                    System.out.printf("Input jabatan [Manager | Supervisor | Admin] (Case Sensitive): ");
                    TempPosition = Tracer.nextLine();

                    if(TempPosition.equals("Manager"))
                    {
                        TempSalary = 8000000;
                    }
                    else if(TempPosition.equals("Supervisor"))
                    {
                        TempSalary = 6000000;
                    }
                    else if(TempPosition.equals("Admin"))
                    {
                        TempSalary = 4000000;
                    }

                    TempId = "";
                    String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
                    Random random = new Random();
                    char Letter = abc.charAt(random.nextInt(abc.length()));
                    TempId = TempId.concat(String.valueOf(Letter));
                    Letter = abc.charAt(random.nextInt(abc.length()));
                    TempId = TempId.concat(String.valueOf(Letter));
                    TempId = TempId.concat("-");
                    TempId = TempId.concat(String.format("%04d", random.nextInt(10000)));
                    EmpolyeeList.add(new Employee(TempId, TempName, TempGender, TempPosition, TempSalary));
                    System.out.printf("Berhasil menambahkan Anggota Id %s\n", TempId);
                }
            }
            else if(Option.equalsIgnoreCase("View"))
            {

            }
            else if(Option.equalsIgnoreCase("Delete"))
            {

            }
            else if(Option.equalsIgnoreCase("Update"))
            {

            }
            else if(Option.equalsIgnoreCase("Exit"))
            {
                break;
            }
            else
            {
                System.out.printf("No Valid Option Selected, please select a valid Option\n");
                continue;
            }
        }while(true);
    }
}