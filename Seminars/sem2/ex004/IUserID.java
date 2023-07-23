package sem2.ex004;

public interface IUserID {
    int getUserId();

    /**
     *
     * @return Метод по умолчанию
     */
    default int getAdminID() {
        return 1;
    }



}
