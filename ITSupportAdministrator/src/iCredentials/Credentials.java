package iCredentials;
import model1.Employee;
public interface Credentials {
public String generateEmailAddress(String firstName,String lastName,String dept);
public String generatePassword();
public void showCredentials(Employee emp);
}
