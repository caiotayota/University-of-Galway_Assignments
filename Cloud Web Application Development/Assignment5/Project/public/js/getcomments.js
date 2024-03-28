// Function to retrieve comments from the server and display them on the webpage
function getComments() {
    let xhr = new XMLHttpRequest(); // Creating a new XMLHttpRequest object
    xhr.open('GET', 'https://us-central1-assignment5-6fbc7.cloudfunctions.net/getcomments'); // Setting up a GET request to fetch comments from the server

    const comment = document.getElementById('comments'); // Reference to the HTML element where comments will be displayed

    xhr.onreadystatechange = function () {
        const DONE = 4; // State indicating that the operation is complete
        const OK = 200; // HTTP status code for a successful request

        // Checking if the operation is completed (readyState === DONE)
        if (xhr.readyState === DONE) {
            // Checking if the request was successful (status code === OK)
            if (xhr.status === OK) {
                let data = JSON.parse(xhr.responseText); // Parsing the JSON response data

                comment.innerHTML = ''; // Clearing the content of the 'comments' element

                // Loop through the retrieved data and display comments
                for (let i = 0; i < data.length; i++) {
                    const wrapper = document.createElement('div'); // Creating a container for each comment
                    wrapper.innerHTML = [
                        '<div class="container-sm">',
                        `<h4 class="card-title" id="name">${data[i].handle}</h4>`,
                        `<p class="card-subtitle mb-2 text-body-secondary" id="date">${data[i].timestamp}</p>`,
                        `<p class="card-text" id="comments">${data[i].comment}</p>`,
                        '</div>'
                    ].join(''); // Creating HTML elements to display comment details

                    comment.append(wrapper); // Appending each comment to the 'comments' element
                }
            } else {
                console.log('Error: ' + xhr.status); // Log error if the request was not successful
            }
        }
    };

    xhr.send(null); // Sending the GET request to fetch comments
}

getComments();
