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
public final class DeleteOrders_Factory implements Factory<DeleteOrders> {
  private final Provider<RealtimeRepository> realtimeRepositoryProvider;

  public DeleteOrders_Factory(Provider<RealtimeRepository> realtimeRepositoryProvider) {
    this.realtimeRepositoryProvider = realtimeRepositoryProvider;
  }

  @Override
  public DeleteOrders get() {
    return newInstance(realtimeRepositoryProvider.get());
  }

  public static DeleteOrders_Factory create(
      Provider<RealtimeRepository> realtimeRepositoryProvider) {
    return new DeleteOrders_Factory(realtimeRepositoryProvider);
  }

  public static DeleteOrders newInstance(RealtimeRepository realtimeRepository) {
    return new DeleteOrders(realtimeRepository);
  }
}
