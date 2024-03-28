// Getting references to HTML elements
const inputBox = document.getElementById('input-box'); // Textarea for comment input
const charCountDisplay = document.getElementById('char-count'); // Element to display remaining characters

const maxChars = 280; // Maximum number of characters allowed

// Event listener for input in the input box
inputBox.addEventListener('input', function() {
    // Getting the length of the input value
    const inputLength = inputBox.value.length;
    // Calculating the remaining characters
    const remainingChars = maxChars - inputLength;

    // Displaying the remaining characters count
    charCountDisplay.textContent = remainingChars;

    // Checking if the input exceeds the maximum character limit
    if (remainingChars < 0) {
        // Truncating the input text to the maximum allowed characters
        inputBox.value = inputBox.value.substring(0, maxChars);
        // Setting the character count display to 0 if the limit is exceeded
        charCountDisplay.textContent = 0;
    }
});
