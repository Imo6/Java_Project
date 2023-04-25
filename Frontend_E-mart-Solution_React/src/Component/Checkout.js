// //code for Checkout.js
// import './pd.css';
// import { useState } from 'react';
// import { Card } from 'react-bootstrap';



// function Checkout() {
//     const [customerDetails, setCustomerDetails] = useState({});
//     const [cartDetails, setCartDetails] = useState({});

//     //fetch data from customer
//     fetch(`http://localhost:8080/api/customerById/{customer_Id}`, {
//         method: 'GET',
//         headers: {
//             'Content-Type': 'application/json',
//         },
//     })
//         .then(res => res.json())
//         .then(data => setCustomerDetails(data))
//         .catch(err => console.log(err));

//     //fetch data from cart
//     fetch(`http://localhost:8080/api/{cart_Id}`, {
//         method: 'GET',
//         headers: {
//             'Content-Type': 'application/json',
//         },
//     })
//         .then(res => res.json())
//         .then(data => setCartDetails(data))
//         .catch(err => console.log(err));

//     //render data from customer

//     return (
//         <Card>
//             <Card.Body>
//                 <Card.Title>Customer Details</Card.Title>
//                 <Card.Text>
//                     <p>Customer Name: {customerDetails.first_Name}</p>
//                     <p>Customer Name: {customerDetails.last_Name}</p>
//                     <p>Customer Email: {customerDetails.email_Id}</p>
//                     <p>Customer Address: {customerDetails.address}</p>
//                 </Card.Text>
//             </Card.Body>
//         </Card>

//     );
// }

// export default Checkout;