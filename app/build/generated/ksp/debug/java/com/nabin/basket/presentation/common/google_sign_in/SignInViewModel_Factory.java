package com.nabin.basket.presentation.common.google_sign_in;

import com.nabin.basket.data.local.Preference;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class SignInViewModel_Factory implements Factory<SignInViewModel> {
  private final Provider<Preference> preferenceProvider;

  public SignInViewModel_Factory(Provider<Preference> preferenceProvider) {
    this.preferenceProvider = preferenceProvider;
  }

  @Override
  public SignInViewModel get() {
    return newInstance(preferenceProvider.get());
  }

  public static SignInViewModel_Factory create(Provider<Preference> preferenceProvider) {
    return new SignInViewModel_Factory(preferenceProvider);
  }

  public static SignInViewModel newInstance(Preference preference) {
    return new SignInViewModel(preference);
  }
}
