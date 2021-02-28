package seedu.address.logic.commands;

import static seedu.address.testutil.TypicalFlashcards.getTypicalAddressBook;

import org.junit.jupiter.api.BeforeEach;

import seedu.address.model.Model;
import seedu.address.model.ModelManager;
import seedu.address.model.UserPrefs;

/**
 * Contains integration tests (interaction with the Model) for {@code AddCommand}.
 */
public class AddCommandIntegrationTest {

    private Model model;

    @BeforeEach
    public void setUp() {
        model = new ModelManager(getTypicalAddressBook(), new UserPrefs());
    }

//    @Test
//    public void execute_newFlashcard_success() {
//        Flashcard validFlashcard = new FlashcardBuilder().build();
//
//        Model expectedModel = new ModelManager(model.getAddressBook(), new UserPrefs());
//        expectedModel.addFlashcard(validFlashcard);
//
//        assertCommandSuccess(new AddCommand(validFlashcard), model,
//                String.format(AddCommand.MESSAGE_SUCCESS, validFlashcard), expectedModel);
//    }

//    @Test
//    public void execute_duplicateFlashcard_throwsCommandException() {
//        Flashcard flashcardInList = model.getAddressBook().getFlashcardList().get(0);
//        assertCommandFailure(new AddCommand(flashcardInList), model, AddCommand.MESSAGE_DUPLICATE_FLASHCARD);
//    }

}
