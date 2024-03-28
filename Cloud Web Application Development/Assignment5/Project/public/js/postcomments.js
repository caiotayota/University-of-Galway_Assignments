// Function to handle posting comments to a server
function postComments() {
    // Creating a new instance of XMLHttpRequest
    let xhr = new XMLHttpRequest();

    // Configuring the request: specifying the method as POST and the server endpoint URL
    xhr.open('POST', 'https://us-central1-assignment5-6fbc7.cloudfunctions.net/postcomments');

    // Setting the request header to specify the content type as JSON
    xhr.setRequestHeader("Content-type", "application/json");

    // Function to handle changes in the request state
    xhr.onreadystatechange = function () {
        const DONE = 4; // State indicating that the operation is complete
        const HTTP_OK = 200; // HTTP status code for successful request completion

        // Checking if the operation is completed (readyState === DONE)
        if (xhr.readyState === DONE) {
            // Checking if the request was successful (status code === HTTP_OK)
            if (xhr.status === HTTP_OK) {
                // If the request was successful, fetch and display comments
                getComments();
            } else {
                // If the request was not successful, log the error status
                console.log('Error ' + xhr.status);
            }
        }
    };

    // Extracting input values and creating a data object to send as JSON to the server
    const handleValue = document.getElementById('handle').value; // Getting the handle value
    const commentValue = document.getElementById('input-box').value; // Getting the comment value
    const timestamp = new Date().toLocaleString("en-IE"); // Generating a timestamp in a specific format

    // Creating a data object containing handle, comment, and timestamp
    const dataToSend = {
        "handle": handleValue,
        "comment": commentValue,
        "timestamp": timestamp
    };

    // Sending the data as a JSON string to the server
    xhr.send(JSON.stringify(dataToSend));
}
