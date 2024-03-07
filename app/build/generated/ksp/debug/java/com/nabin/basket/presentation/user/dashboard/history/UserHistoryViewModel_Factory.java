package com.nabin.basket.presentation.user.dashboard.history;

import com.nabin.basket.data.local.Preference;
import com.nabin.basket.domain.use_cases.firestore.FirestoreUseCases;
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
public final class UserHistoryViewModel_Factory implements Factory<UserHistoryViewModel> {
  private final Provider<FirestoreUseCases> firestoreUseCasesProvider;

  private final Provider<Preference> preferenceProvider;

  public UserHistoryViewModel_Factory(Provider<FirestoreUseCases> firestoreUseCasesProvider,
      Provider<Preference> preferenceProvider) {
    this.firestoreUseCasesProvider = firestoreUseCasesProvider;
    this.preferenceProvider = preferenceProvider;
  }

  @Override
  public UserHistoryViewModel get() {
    return newInstance(firestoreUseCasesProvider.get(), preferenceProvider.get());
  }

  public static UserHistoryViewModel_Factory create(
      Provider<FirestoreUseCases> firestoreUseCasesProvider,
      Provider<Preference> preferenceProvider) {
    return new UserHistoryViewModel_Factory(firestoreUseCasesProvider, preferenceProvider);
  }

  public static UserHistoryViewModel newInstance(FirestoreUseCases firestoreUseCases,
      Preference preference) {
    return new UserHistoryViewModel(firestoreUseCases, preference);
  }
}
