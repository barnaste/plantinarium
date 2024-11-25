package use_case.upload;

/**
 * Output Boundary for actions which are related to loading information about, and
 * storing, a new image. This involves switching between the Upload use case views.
 */
public interface UploadOutputBoundary {

    /**
     * Change the display to the confirm view, showing the image selected by the user.
     * @param outputData
     */
    void switchToConfirmView(UploadConfirmOutputData outputData);

    /**
     * Change the display to the select view, where the user may choose an image.
     * @param outputData
     */
    void switchToSelectView(UploadSelectOutputData outputData);

    /**
     * Change the display to the results view, where the user sees details about the
     * plant uploaded in this use case.
     * @param outputData
     */
    void switchToResultView(UploadResultOutputData outputData);

    /**
     * Notify the display that the Upload use case terminated and processes have finished.
     */
    void prepareSuccessView();
}
