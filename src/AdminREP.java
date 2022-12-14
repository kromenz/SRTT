public class AdminREP {
    public static void createAdmin(Admin admin){
        Repository.getRepository().getAdmins().put(admin.getNIF(), admin);
        System.out.println("Admnistrador registado com sucesso!!");
        Repository.getRepository().serialize("src\\data\\users.repo");

    }
}