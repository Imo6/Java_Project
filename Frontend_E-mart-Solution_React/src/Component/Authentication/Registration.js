import React, { useState } from 'react';

function Registration() {
    const [first_Name, setFirstname] = useState('');
    const [last_Name, setLastname] = useState('');
    const [email_Id, setEmailid] = useState('');

    const [username, setUsername] = useState('');
    const [password, setPassword] = useState('');
    const [address, setAddress] = useState('');

    const [errorMessage, setErrorMessage] = useState('');

    const [prime_Customer, setPrimeCustomer] = useState(false);

    // Add state variable for password validation error message
    const [passwordError, setPasswordError] = useState('');

    async function signUp(event) {
        event.preventDefault();

        if (!first_Name || !last_Name || !email_Id || !username || !password || !address) {
            setErrorMessage('Please fill out all required fields');
            return;
        }

        // Check that the email address is valid
        const emailRegex = /\S+@\S+\.\S+/;
        if (!emailRegex.test(email_Id)) {
            setErrorMessage('Please enter a valid email address');
            return;
        }

        // Check that the password meets the length requirement
        if (password.length < 8 || password.length > 15) {
            setPasswordError('Password must be between 8 and 15 characters');
            return;
        } else {
            setPasswordError('');
        }

        // Make API call to register user
        try {
            const response = await fetch('http://localhost:8080/api/customer', {
                method: 'POST',
                body: JSON.stringify({
                    first_Name,
                    last_Name,
                    username,
                    email_Id,
                    password,
                    address,
                    prime_Customer
                }),
                headers: {
                    'Content-Type': 'application/json',
                    'Accept': 'application/json'
                }
            });

            // Handle successful registration
            if (response.ok) {
                alert('Registration successful!');
                setFirstname('');
                setLastname('');
                
                setEmailid('');
                setUsername('');
                setPassword('');
                setAddress('');
                setPrimeCustomer(false);
                setErrorMessage('');
            }
            // Handle errors
            else {
                const errorData = await response.json();
                setErrorMessage(errorData.message);
            }
        } catch (error) {
            setErrorMessage('An error occurred while registering. Please try again later.');
            console.error(error);
        }
    }

    return (
        <div className="login-container">
            <div className="row justify-content-center mt-5">
                <div className="col-md-6 login-cnt">
                    <div className="login-card">
                        <div className="login-card-header text-center">
                            <h1>Registration Page</h1>
                        </div>
                        {errorMessage && <div className="error">{errorMessage}</div>}
                        <div className="card-body">
                            <form onSubmit={signUp}>
                                <div className="form-group">
                                    <label htmlFor="first_Name">Firstname:</label>
                                    <input className="form-control"
                                        type="text"
                                        id="first_Name"
                                        value={first_Name}
                                        onChange={(e) => setFirstname(e.target.value)}
                                        required
                                    />
                                </div>
                                <div className="form-group">
                                    <label htmlFor="lastName">Lastname:</label>
                                    <input className="form-control"
                                        type="text"
                                        id="lastName"
                                        value={last_Name}
                                        onChange={(e) => setLastname(e.target.value)}
                                        required
                                    />
                                </div>
                                <div className="form-group">
                                    <label htmlFor="username">Username:</label>
                                    <input className="form-control"
                                        type="text"
                                        id="username"
                                        value={username}
                                        onChange={(e) => setUsername(e.target.value)}
                                        required
                                    />
                                </div>

                                <div className="form-group">
                                    <label htmlFor="email_Id">Email-Id:</label>
                                    <input className="form-control"
                                        type="email"
                                        id="email_Id"
                                        value={email_Id}
                                        onChange={(e) => setEmailid(e.target.value)}
                                        required
                                    />
                                </div>
                                <div className="form-group">
                                    <label htmlFor="password">Password:</label>
                                    <input className="form-control"
                                        type="password"
                                        id="password"
                                        value={password}
                                        onChange={(e) => setPassword(e.target.value)}
                                        required
                                    />
                                </div>
                                <div className="form-group">
                                    <label htmlFor="address">Address:</label>
                                    <input className="form-control"
                                        type="text"
                                        id="address"
                                        value={address}
                                        onChange={(e) => setAddress(e.target.value)}
                                        required
                                    />
                                </div>
                                <div className="form-group">
                                    <label htmlFor="prime_Customer">Prime Membership:</label>
                                    <input className="checkbox"
                                        type="checkbox"
                                        id="prime_Customer"
                                        checked={prime_Customer}
                                        onChange={(e) => setPrimeCustomer(e.target.checked)}
                                    />
                                </div>
                                <div className="text-center">
                                    <button className="Button" onClick={signUp}>Register Here</button>
                                </div>    
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    );
}

export default Registration;