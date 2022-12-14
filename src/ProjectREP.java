public class ProjectREP {

    public static void createProject(Project project, Users users){
        project.setState(ProjectState.FINALIZADO);
        Repository.getRepository().getProjects().put(Integer.toString(project.getIdProjeto()), project);
        Repository.getRepository().getUsers().get(users.getNIF()).getProjects().add(project);
        System.out.println("Projeto criado com sucesso!!!");
        Repository.getRepository().serialize("src\\data\\users.repo");
    }
}
