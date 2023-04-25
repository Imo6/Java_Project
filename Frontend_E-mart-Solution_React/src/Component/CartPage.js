import React, { useState, useEffect } from 'react';
import { Button } from 'react';
import axios from 'axios';
import { Navigate } from 'react-router-dom';
import Payment from './Payment';

const CartPage = ({ navigateToOrders }) => {
    const [cartItems, setCartItems] = useState([]);
    const [totalPrice, setTotalPrice] = useState(0);

    useEffect(() => {
        const fetchCartItems = async () => {
            const response = await axios.get('http://localhost:8080/api/cartitems');
            setCartItems(response.data);
        };
        fetchCartItems();
    }, []);

    useEffect(() => {
        const totalPrice = cartItems.reduce((acc, item) => {
            return acc + item.prime_CustomerPrice * item.quantity;
        }, 0);
        setTotalPrice(totalPrice);
    }, [cartItems]);

    const handleCheckoutClick = async () => {
        const response = await axios.post('http://localhost:8080/api/addorders', {
            order_total: totalPrice,
            cart_id_fk: cartItems[0].cart_Id // assuming all items have the same cart Id
        });
        if (response.status === 200) {
            navigateToOrders();
        }
        Navigate(Payment);
    };

    return (
        <div>
            <h1>Your Cart</h1>
            <table>
                <thead>
                    <tr>
                        <th>Product</th>
                        <th>Quantity</th>
                        <th>Price</th>
                        <th>Total</th>
                        <th>Action</th>
                    </tr>
                </thead>
                <tbody>
                    {cartItems.map((item) => (
                        <CartItem key={item.cart_Item_Id} item={item} />
                    ))}
                </tbody>
            </table>
            <p>Total Price: ${totalPrice.toFixed(2)}</p>
            <button onClick={handleCheckoutClick}>Checkout</button>
            {/* <Button variant="primary" href={'/payment'}>Checkout</Button> */}
        </div>
    );
};

const CartItem = ({ item }) => {
    const [product, setProduct] = useState({});

    useEffect(() => {
        const fetchProduct = async () => {
            const response = await axios.get(
                `http://localhost:8080/api/productsById/${item.p_Id}`
            );
            setProduct(response.data);
        };
        fetchProduct();
    }, [item.p_Id]);

    const handleQuantityChange = async (event) => {
        const newQuantity = event.target.value;
        await axios.put(
            `http://localhost:8080/api/productsById/${item.p_Id}`,
            { quantity: newQuantity }
        );
    };

    const handleRemoveClick = async () => {
        await axios.delete(
            `http://localhost:8080/api/cartitems/${item.cart_Item_Id}`
        );
    };

    return (
        <tr>
            <td>{product.p_Name}</td>
            <td>
                <input
                    type="number"
                    value={item.quantity}
                    onChange={handleQuantityChange}
                />
            </td>
            <td>{item.prime_CustomerPrice}</td>
            <td>{item.prime_CustomerPrice * item.quantity}</td>
            <td>
                <button onClick={handleRemoveClick}>Remove</button>
            </td>
        </tr>
    );
};

export default CartPage;
