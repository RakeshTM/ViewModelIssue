package aia.com.viewmodelissue;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.support.annotation.NonNull;
import android.util.Log;

/**
 * Created by rakesh.tm on 3/14/2018.
 */

public class MainViewModelFactory implements ViewModelProvider.Factory {
    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        Log.d(MainViewModelFactory.class.getSimpleName(), "MainViewModelFactory create : called");
        return (T) new MainViewModel();
    }
}
