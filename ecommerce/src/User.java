
/*
Classe abstrata: nunca será diretamente instanciada
e servirá como base pra seus filhos
 */
public abstract class  User {
    private String name;
    private String email;
    private String password;

    public void register (String name, String email, String password){
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public boolean login (String email, String password){
        return (this.email.equals(email) && this.password.equals(password));
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
