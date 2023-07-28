public class InnermemoryPersisthiringmanager implements Persisthiringmanager{
    String[] hirings = new String[25];
    int numhiries;
    @Override
    public boolean persisthiringmanagerData(hiringmanager hiringmanager, candidate candidate, position position, boolean hiringmangerResult) {
        String hiring = hiringmanager.getName() + " :" + candidate.getName() + " :" + position.getName() +": " + hiringmangerResult;
        hirings[numhiries++] = hiring;
        return true;
    }
}
