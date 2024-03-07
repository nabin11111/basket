package com.nabin.basket.data.repositoryImpl;

import com.google.firebase.database.FirebaseDatabase;
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
public final class RealtimeRepositoryImpl_Factory implements Factory<RealtimeRepositoryImpl> {
  private final Provider<FirebaseDatabase> realtimeProvider;

  public RealtimeRepositoryImpl_Factory(Provider<FirebaseDatabase> realtimeProvider) {
    this.realtimeProvider = realtimeProvider;
  }

  @Override
  public RealtimeRepositoryImpl get() {
    return newInstance(realtimeProvider.get());
  }

  public static RealtimeRepositoryImpl_Factory create(Provider<FirebaseDatabase> realtimeProvider) {
    return new RealtimeRepositoryImpl_Factory(realtimeProvider);
  }

  public static RealtimeRepositoryImpl newInstance(FirebaseDatabase realtime) {
    return new RealtimeRepositoryImpl(realtime);
  }
}
