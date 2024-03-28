const commentInput = document.getElementById('comment-input');
const commentBtn = document.getElementById('send-btn');
const nameInput = document.getElementById('name-input');
const comment = document.getElementById('comment-placeholder');
const alert = document.querySelector('.alert');


const appendComment = () => {

    let date = new Date().toLocaleString();

    if (nameInput.value.toLowerCase() === "hacker") {
        // window.alert("Hackers are not allowed to post here!")
        alert.style.display = 'block';
        return;
    } else if (nameInput.value.toLowerCase() === ""){
        alert.style.display = 'none';
        return;
    }

    alert.style.display = 'none';

    const wrapper = document.createElement('div');
    wrapper.innerHTML = [
        '<div class="container-sm">',
        `<h4 class="card-title" id="name">@${nameInput.value}</h4>`,
        `<p class="card-subtitle mb-2 text-body-secondary" id="date">${date}</p>`,
        `<p class="card-text" id="comments">${commentInput.value}</p>`,
        '</div>'
    ].join('');

    comment.append(wrapper);

    nameInput.value = "";
    commentInput.value = "";
}

commentBtn.addEventListener('click', appendComment);