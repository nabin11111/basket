package com.nabin.basket.di;

import android.app.Application;
import com.nabin.basket.data.data_source.OrderDeliveryDatabase;
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
public final class AppModule_ProvideOrderDeliveryDatabaseFactory implements Factory<OrderDeliveryDatabase> {
  private final Provider<Application> appProvider;

  public AppModule_ProvideOrderDeliveryDatabaseFactory(Provider<Application> appProvider) {
    this.appProvider = appProvider;
  }

  @Override
  public OrderDeliveryDatabase get() {
    return provideOrderDeliveryDatabase(appProvider.get());
  }

  public static AppModule_ProvideOrderDeliveryDatabaseFactory create(
      Provider<Application> appProvider) {
    return new AppModule_ProvideOrderDeliveryDatabaseFactory(appProvider);
  }

  public static OrderDeliveryDatabase provideOrderDeliveryDatabase(Application app) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideOrderDeliveryDatabase(app));
  }
}
