public class ExBreakUnlabel{

    public static void.main(string[] args){
        string names [] = {"Beah", "Bianca", "Lance", "Belle", "Nico", "Yza", "Gem","Ethan"};
        string searchname = "Yza";
        boolean foundname = false;
        for (int i=0; i<names.lenght; i++){
            if (names [i].equals ( searchname)){
                foundname = true;
                break;

            }
        }
        if (foundname) {
            system.out.println(searchname+ "found!");
        }else{
            system.out.println( searchname + " not found.");
        }
    }
}