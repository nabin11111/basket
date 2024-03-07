package com.nabin.basket.presentation.user.dashboard.cart;

import com.nabin.basket.data.local.Preference;
import com.nabin.basket.domain.use_cases.db.DBUseCases;
import com.nabin.basket.domain.use_cases.firestore.FirestoreUseCases;
import com.nabin.basket.domain.use_cases.realtime.RealtimeUseCases;
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
public final class UserCartViewModel_Factory implements Factory<UserCartViewModel> {
  private final Provider<FirestoreUseCases> firestoreUseCasesProvider;

  private final Provider<DBUseCases> dbUseCasesProvider;

  private final Provider<Preference> preferenceProvider;

  private final Provider<RealtimeUseCases> realtimeUseCasesProvider;

  public UserCartViewModel_Factory(Provider<FirestoreUseCases> firestoreUseCasesProvider,
      Provider<DBUseCases> dbUseCasesProvider, Provider<Preference> preferenceProvider,
      Provider<RealtimeUseCases> realtimeUseCasesProvider) {
    this.firestoreUseCasesProvider = firestoreUseCasesProvider;
    this.dbUseCasesProvider = dbUseCasesProvider;
    this.preferenceProvider = preferenceProvider;
    this.realtimeUseCasesProvider = realtimeUseCasesProvider;
  }

  @Override
  public UserCartViewModel get() {
    return newInstance(firestoreUseCasesProvider.get(), dbUseCasesProvider.get(), preferenceProvider.get(), realtimeUseCasesProvider.get());
  }

  public static UserCartViewModel_Factory create(
      Provider<FirestoreUseCases> firestoreUseCasesProvider,
      Provider<DBUseCases> dbUseCasesProvider, Provider<Preference> preferenceProvider,
      Provider<RealtimeUseCases> realtimeUseCasesProvider) {
    return new UserCartViewModel_Factory(firestoreUseCasesProvider, dbUseCasesProvider, preferenceProvider, realtimeUseCasesProvider);
  }

  public static UserCartViewModel newInstance(FirestoreUseCases firestoreUseCases,
      DBUseCases dbUseCases, Preference preference, RealtimeUseCases realtimeUseCases) {
    return new UserCartViewModel(firestoreUseCases, dbUseCases, preference, realtimeUseCases);
  }
}
