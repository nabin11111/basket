package com.nabin.basket.presentation.user.dashboard.home;

import com.nabin.basket.domain.repository.DBRepository;
import com.nabin.basket.domain.repository.OneSignalRepository;
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
public final class UserHomeViewModel_Factory implements Factory<UserHomeViewModel> {
  private final Provider<FirestoreUseCases> firestoreUseCasesProvider;

  private final Provider<RealtimeUseCases> realtimeUseCasesProvider;

  private final Provider<DBRepository> dbRepositoryProvider;

  private final Provider<OneSignalRepository> oneSiganlRepositoryProvider;

  public UserHomeViewModel_Factory(Provider<FirestoreUseCases> firestoreUseCasesProvider,
      Provider<RealtimeUseCases> realtimeUseCasesProvider,
      Provider<DBRepository> dbRepositoryProvider,
      Provider<OneSignalRepository> oneSiganlRepositoryProvider) {
    this.firestoreUseCasesProvider = firestoreUseCasesProvider;
    this.realtimeUseCasesProvider = realtimeUseCasesProvider;
    this.dbRepositoryProvider = dbRepositoryProvider;
    this.oneSiganlRepositoryProvider = oneSiganlRepositoryProvider;
  }

  @Override
  public UserHomeViewModel get() {
    return newInstance(firestoreUseCasesProvider.get(), realtimeUseCasesProvider.get(), dbRepositoryProvider.get(), oneSiganlRepositoryProvider.get());
  }

  public static UserHomeViewModel_Factory create(
      Provider<FirestoreUseCases> firestoreUseCasesProvider,
      Provider<RealtimeUseCases> realtimeUseCasesProvider,
      Provider<DBRepository> dbRepositoryProvider,
      Provider<OneSignalRepository> oneSiganlRepositoryProvider) {
    return new UserHomeViewModel_Factory(firestoreUseCasesProvider, realtimeUseCasesProvider, dbRepositoryProvider, oneSiganlRepositoryProvider);
  }

  public static UserHomeViewModel newInstance(FirestoreUseCases firestoreUseCases,
      RealtimeUseCases realtimeUseCases, DBRepository dbRepository,
      OneSignalRepository oneSiganlRepository) {
    return new UserHomeViewModel(firestoreUseCases, realtimeUseCases, dbRepository, oneSiganlRepository);
  }
}
