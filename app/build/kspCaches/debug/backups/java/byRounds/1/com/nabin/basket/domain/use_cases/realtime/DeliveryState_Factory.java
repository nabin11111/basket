package com.nabin.basket.domain.use_cases.realtime;

import com.nabin.basket.domain.repository.RealtimeRepository;
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
public final class DeliveryState_Factory implements Factory<DeliveryState> {
  private final Provider<RealtimeRepository> realtimeRepositoryProvider;

  public DeliveryState_Factory(Provider<RealtimeRepository> realtimeRepositoryProvider) {
    this.realtimeRepositoryProvider = realtimeRepositoryProvider;
  }

  @Override
  public DeliveryState get() {
    return newInstance(realtimeRepositoryProvider.get());
  }

  public static DeliveryState_Factory create(
      Provider<RealtimeRepository> realtimeRepositoryProvider) {
    return new DeliveryState_Factory(realtimeRepositoryProvider);
  }

  public static DeliveryState newInstance(RealtimeRepository realtimeRepository) {
    return new DeliveryState(realtimeRepository);
  }
}
