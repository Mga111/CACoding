package use_case.clear_users;

// TODO Complete me


public class ClearInteractor implements ClearInputBoundary {
    final ClearUserDataAccessInterface userDataAccessObject;
    final ClearOutputBoundary clearPresenter;
    public ClearInteractor(ClearUserDataAccessInterface userDataAccessInterface,
                           ClearOutputBoundary clearOutputBoundary) {
        this.userDataAccessObject = userDataAccessInterface;
        this.clearPresenter = clearOutputBoundary;
    }
    @Override
    public void execute(ClearInputData clearInputData) {
        userDataAccessObject.deleteall();
        ClearOutputData clearOutputData = new ClearOutputData();
        clearPresenter.prepareSuccessView(clearOutputData);
}
}

