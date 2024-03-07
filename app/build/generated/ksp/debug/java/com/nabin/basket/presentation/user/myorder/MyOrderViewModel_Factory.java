package com.nabin.basket.presentation.user.myorder;

import com.nabin.basket.data.local.Preference;
import com.nabin.basket.domain.repository.OneSignalRepository;
import com.nabin.basket.domain.use_cases.db.DBUseCases;
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
public final class MyOrderViewModel_Factory implements Factory<MyOrderViewModel> {
  private final Provider<FirestoreUseCases> firestoreUseCasesProvider;

  private final Provider<Preference> preferenceProvider;

  private final Provider<OneSignalRepository> oneSignalRepositoryProvider;

  private final Provider<DBUseCases> dbUseCasesProvider;

  public MyOrderViewModel_Factory(Provider<FirestoreUseCases> firestoreUseCasesProvider,
      Provider<Preference> preferenceProvider,
      Provider<OneSignalRepository> oneSignalRepositoryProvider,
      Provider<DBUseCases> dbUseCasesProvider) {
    this.firestoreUseCasesProvider = firestoreUseCasesProvider;
    this.preferenceProvider = preferenceProvider;
    this.oneSignalRepositoryProvider = oneSignalRepositoryProvider;
    this.dbUseCasesProvider = dbUseCasesProvider;
  }

  @Override
  public MyOrderViewModel get() {
    return newInstance(firestoreUseCasesProvider.get(), preferenceProvider.get(), oneSignalRepositoryProvider.get(), dbUseCasesProvider.get());
  }

  public static MyOrderViewModel_Factory create(
      Provider<FirestoreUseCases> firestoreUseCasesProvider,
      Provider<Preference> preferenceProvider,
      Provider<OneSignalRepository> oneSignalRepositoryProvider,
      Provider<DBUseCases> dbUseCasesProvider) {
    return new MyOrderViewModel_Factory(firestoreUseCasesProvider, preferenceProvider, oneSignalRepositoryProvider, dbUseCasesProvider);
  }

  public static MyOrderViewModel newInstance(FirestoreUseCases firestoreUseCases,
      Preference preference, OneSignalRepository oneSignalRepository, DBUseCases dbUseCases) {
    return new MyOrderViewModel(firestoreUseCases, preference, oneSignalRepository, dbUseCases);
  }
}
