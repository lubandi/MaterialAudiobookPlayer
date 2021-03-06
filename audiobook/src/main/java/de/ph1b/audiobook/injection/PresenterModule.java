package de.ph1b.audiobook.injection;

import dagger.Module;
import dagger.Provides;
import de.ph1b.audiobook.features.BookAdder;
import de.ph1b.audiobook.features.book_overview.BookShelfPresenter;
import de.ph1b.audiobook.persistence.BookRepository;
import de.ph1b.audiobook.persistence.PrefsManager;
import de.ph1b.audiobook.playback.PlayStateManager;
import de.ph1b.audiobook.playback.PlayerController;

/**
 * Module for providing presenters.
 *
 * @author Paul Woitaschek
 */
@Module public class PresenterModule {

   @Provides static BookShelfPresenter provideBookShelfPresenter(
         BookRepository bookRepository, BookAdder bookAdder, PrefsManager prefsManager,
         PlayStateManager playStateManager, PlayerController mediaPlayer) {
      return new BookShelfPresenter(bookRepository, bookAdder, prefsManager, playStateManager, mediaPlayer);
   }
}