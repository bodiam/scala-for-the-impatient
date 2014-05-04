import scala.beans.BeanProperty

/**
 * @author Erik Pragt
 */

class Student(@BeanProperty var name: String, @BeanProperty var id: Long)

val student = new Student("Erik", 123)
student.name = "Pietje"

println(student.getName)


/**
  public class Student {
  private java.lang.String name;
  private long id;
  public java.lang.String name();
  public void name_$eq(java.lang.String);
  public void setName(java.lang.String);
  public long id();
  public void id_$eq(long);
  public void setId(long);
  public java.lang.String getName();
  public long getId();
  public Student(java.lang.String, long);
}
 */

