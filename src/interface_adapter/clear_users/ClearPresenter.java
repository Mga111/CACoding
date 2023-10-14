package interface_adapter.clear_users;

// TODO Complete me

import interface_adapter.ViewManagerModel;
import interface_adapter.login.LoginViewModel;
import interface_adapter.signup.SignupViewModel;
import use_case.clear_users.ClearOutputBoundary;
import use_case.clear_users.ClearOutputData;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ClearPresenter implements ClearOutputBoundary {
    private final SignupViewModel signupViewModel;
    private final LoginViewModel loginViewModel;
    private ViewManagerModel viewManagerModel;

    public ClearPresenter(ViewManagerModel viewManagerModel,
                           SignupViewModel signupViewModel,
                           LoginViewModel loginViewModel) {
        this.viewManagerModel = viewManagerModel;
        this.signupViewModel = signupViewModel;
        this.loginViewModel = loginViewModel;
    }
    @Override
    public void prepareSuccessView(ClearOutputData user) {


        //ClearState clearState = signupViewModel.getState();
       // clearState.setUsername(response.getUsername());
       // this.loginViewModel.setState(loginState);
        //loginViewModel.firePropertyChanged();

        //viewManagerModel.setActiveView(loginViewModel.getViewName());
        //viewManagerModel.firePropertyChanged();
    }
}
