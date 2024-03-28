// Required Firebase Cloud Functions modules
const functions = require('firebase-functions');
const admin = require('firebase-admin');
const cors = require('cors')(); // Cross-Origin Resource Sharing middleware

// Initialize the Firebase Admin SDK
admin.initializeApp();

// HTTP Cloud Function to handle fetching comments from Firestore
exports.getcomments = functions.https.onRequest((request, response) => {
    // Enable CORS for the HTTP request
    cors(request, response, () => {
        let myData = []; // Initialize an empty array to store retrieved data

        // Retrieve comments from Firestore, order by timestamp, and handle the response
        return admin.firestore().collection('comments').orderBy('timestamp').get().then((snapshot) => {
            if (snapshot.empty) {
                // If no documents found in the collection
                console.log('No matching documents.');
                console.log('No data in database');
                return response.status(404).send('No data in database'); // Send 404 if no data found
            }

            // Iterate through retrieved documents and store data in 'myData' array
            snapshot.forEach((doc) => {
                myData.push(doc.data());
            });

            // Send the retrieved data as a response with HTTP status 200 (OK)
            return response.status(200).send(myData);
        }).catch((error) => {
            // Handle errors occurring during the process
            console.error('Error getting documents:', error);
            return response.status(500).send('Error getting documents'); // Send 500 for internal server error
        });
    });
});

// HTTP Cloud Function to handle posting comments to Firestore
exports.postcomments = functions.https.onRequest((request, response) => {
    console.log("Request body", request.body); // Log the request body

    // Enable CORS for the HTTP request
    cors(request, response, () => {
        const commentData = request.body; // Extract comment data from the request body

        // Add the received comment data to the 'comments' collection in Firestore
        admin.firestore().collection('comments').add(commentData).then(() => {
            response.status(201).send("Comment successfully added"); // Send 201 for resource created
        }).catch((error) => {
            // Handle errors occurring while adding the comment to Firestore
            console.error('Error adding comment:', error);
            return response.status(500).send('Error adding comment'); // Send 500 for internal server error
        });
    })
});
