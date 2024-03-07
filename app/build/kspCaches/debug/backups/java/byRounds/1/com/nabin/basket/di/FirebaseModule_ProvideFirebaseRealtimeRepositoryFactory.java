package com.nabin.basket.di;

import com.google.firebase.database.FirebaseDatabase;
import com.nabin.basket.domain.repository.RealtimeRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
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
public final class FirebaseModule_ProvideFirebaseRealtimeRepositoryFactory implements Factory<RealtimeRepository> {
  private final Provider<FirebaseDatabase> realtimeProvider;

  public FirebaseModule_ProvideFirebaseRealtimeRepositoryFactory(
      Provider<FirebaseDatabase> realtimeProvider) {
    this.realtimeProvider = realtimeProvider;
  }

  @Override
  public RealtimeRepository get() {
    return provideFirebaseRealtimeRepository(realtimeProvider.get());
  }

  public static FirebaseModule_ProvideFirebaseRealtimeRepositoryFactory create(
      Provider<FirebaseDatabase> realtimeProvider) {
    return new FirebaseModule_ProvideFirebaseRealtimeRepositoryFactory(realtimeProvider);
  }

  public static RealtimeRepository provideFirebaseRealtimeRepository(FirebaseDatabase realtime) {
    return Preconditions.checkNotNullFromProvides(FirebaseModule.INSTANCE.provideFirebaseRealtimeRepository(realtime));
  }
}
