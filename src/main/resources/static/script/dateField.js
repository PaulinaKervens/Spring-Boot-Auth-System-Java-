const dateInput = document.getElementById('dateOfBirth');

    if (dateInput) { // Safety check
        dateInput.addEventListener('input', function (e) {
            let value = e.target.value.replace(/\D/g, '');
            if (value.length > 2 && value.length <= 4) {
                value = value.slice(0, 2) + '/' + value.slice(2);
            } else if (value.length > 4) {
                value = value.slice(0, 2) + '/' + value.slice(2, 4) + '/' + value.slice(4, 8);
            }
            e.target.value = value;
        });

        dateInput.addEventListener('keydown', function (e) {
            const allowedKeys = ['Backspace', 'Tab', 'ArrowLeft', 'ArrowRight', 'Delete'];
            if (!allowedKeys.includes(e.key) && isNaN(Number(e.key))) {
                e.preventDefault();
            }
        });
    }