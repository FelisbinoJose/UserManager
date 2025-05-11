// script.js
fetch('/users')
    .then(response => response.json())
    .then(data => {
        const list = document.getElementById('user-list');
        data.forEach(user => {
            const item = document.createElement('li');
            item.textContent = `ID: ${user.id}, Nome: ${user.name}, Email: ${user.email}`;
            list.appendChild(item);
        });
    })
    .catch(error => console.error('Erro ao buscar usuários:', error));