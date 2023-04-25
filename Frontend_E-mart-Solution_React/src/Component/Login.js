import React, { useState, useEffect } from 'react';

function Login() {
    const [username, setUsername] = useState('');
    const [password, setPassword] = useState('');
    const [loggedIn, setLoggedIn] = useState(false);

  const file =  useEffect(() => {
        // Check if customer is prime
        fetch('https://localhost:7125/api/customers/' + username)
            .then(response => response.json())
            .then(data => sessionStorage.setItem('customer', data));
    }, []);

    const handleLogin = async () => {
        const response = await fetch('https://localhost:7125/api/Logins', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify({
                username,
                password
            })
        });

        if (response.ok) {
            sessionStorage.setItem('username', username);
            setLoggedIn(true);
            file();
        } else {
            // handle error
        }
    };

    const handleLogout = () => {
        sessionStorage.removeItem('username');

        setLoggedIn(false);
    };

    const isLoggedIn = () => {
        return loggedIn || (sessionStorage.getItem('username') && sessionStorage.getItem('password'));
    };

    return (
        <div>
            {isLoggedIn() ?
                <div>
                    <p>Welcome, {sessionStorage.getItem('username')}!</p>
                    <button onClick={handleLogout}>Logout</button>
                </div>
                :
                <div>
                    <input type="text" value={username} onChange={(e) => setUsername(e.target.value)} />
                    <input type="password" value={password} onChange={(e) => setPassword(e.target.value)} />
                    <button onClick={handleLogin}>Login</button>
                </div>
            }
        </div>
    );
}

export default Login;
