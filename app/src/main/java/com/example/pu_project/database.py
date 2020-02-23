const numberOfUsers = 15;
const randomIndex = Math.floor(Math.random() * numberOfUsers);

var ref = firebase.database().ref('students');

ref.limitToFirst(randomIndex).limitToLast(1).once('value').then(snapshot =>
{
    var user = snapshot.val();
    // do something with the user data
});