package com.foodora.di;


import com.foodora.ui.component.Home.HomeActivity;
import com.foodora.ui.component.productDetails.ProductDetailsActivity;
import com.foodora.ui.component.splash.SplashActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by AhmedEltaher on 25/11/2016
 */
@Singleton
@Component(modules = MainModule.class)
public interface MainComponent {
    void inject(SplashActivity activity);

    void inject(HomeActivity activity);

    void inject(ProductDetailsActivity activity);
}
