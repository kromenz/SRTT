public class UsersREP {
    public static void createUsers(Users users){
        Repository.getRepository().getUsers().put(Integer.toString(users.getNIF()), users);
        System.out.println("Utilizador criado com sucesso!! Bem vindo!");
        Repository.getRepository().serialize("src\\data\\users.repo");
    }
}
