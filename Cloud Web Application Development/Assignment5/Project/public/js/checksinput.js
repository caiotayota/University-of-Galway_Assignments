// Event listener for when the DOM content is loaded
document.addEventListener('DOMContentLoaded', function () {
    // Getting references to HTML elements
    const handleInput = document.getElementById('handle'); // Input field for handle
    const inputBox = document.getElementById('input-box'); // Textarea for comment input
    const sendBtn = document.getElementById('send-btn'); // Button for sending comments

    // Event listeners for input fields to toggle the send button
    handleInput.addEventListener('input', toggleSendButton);
    inputBox.addEventListener('input', toggleSendButton);

    // Function to toggle the send button based on input fields' content
    function toggleSendButton() {
        // Getting the length of trimmed values in input fields
        const handleLength = handleInput.value.trim().length;
        const inputLength = inputBox.value.trim().length;

        // Enabling or disabling the send button based on input content
        if (handleLength > 0 && inputLength > 0) {
            sendBtn.disabled = false; // Enable send button if both fields have content
        } else {
            sendBtn.disabled = true; // Disable send button if any field is empty
        }
    }
});
