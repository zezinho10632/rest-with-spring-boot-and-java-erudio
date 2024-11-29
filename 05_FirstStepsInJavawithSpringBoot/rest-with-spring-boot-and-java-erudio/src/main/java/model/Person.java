package model;

import java.io.Serializable;

public class Person implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String firstName;
    private String lasttName;
    private String Adress;
    private String gender;

    public Person() {
    }

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLasttName() {
        return lasttName;
    }

    public void setLasttName(String lasttName) {
        this.lasttName = lasttName;
    }

    public String getAdress() {
        return Adress;
    }

    public void setAdress(String adress) {
        Adress = adress;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    // Método equals implementado no estilo da imagem
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true; // Verifica se os dois objetos são o mesmo na memória
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false; // Verifica se o objeto é nulo ou de classe diferente
        }
        Person other = (Person) obj; // Faz o cast para Person
        if (id == null) {
            if (other.id != null) {
                return false;
            }
        } else if (!id.equals(other.id)) {
            return false;
        }
        if (firstName == null) {
            if (other.firstName != null) {
                return false;
            }
        } else if (!firstName.equals(other.firstName)) {
            return false;
        }
        if (lasttName == null) {
            if (other.lasttName != null) {
                return false;
            }
        } else if (!lasttName.equals(other.lasttName)) {
            return false;
        }
        if (Adress == null) {
            if (other.Adress != null) {
                return false;
            }
        } else if (!Adress.equals(other.Adress)) {
            return false;
        }
        if (gender == null) {
            if (other.gender != null) {
                return false;
            }
        } else if (!gender.equals(other.gender)) {
            return false;
        }
        return true; // Retorna true se todos os campos forem iguais
    }
}
