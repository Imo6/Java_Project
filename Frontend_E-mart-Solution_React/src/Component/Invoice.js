import React, { useState } from "react";

const Invoice = () => {
    const [invoice, setInvoice] = useState({
        number: "INV-123456",
        date: "2023-03-15",
        dueDate: "2023-03-30",
        items: [
            { description: "Product 1", quantity: 1, price: 10 },
        ],
        subtotal: 10,
        tax: 1.8,
        total: 11.8,
    });

    return (
        <div className="invoice-page">
            <div className="invoice-header">
                <h1>Invoice</h1>
                <div className="invoice-number">Number: {invoice.number}</div>
                <div className="invoice-date">Date: {invoice.date}</div>
                <div className="invoice-due-date">Due Date: {invoice.dueDate}</div>
            </div>
            <table className="invoice-items">
                <thead>
                    <tr>
                        <th>Description</th>
                        <th>Quantity</th>
                        <th>Price</th>
                        <th>Total</th>
                    </tr>
                </thead>
                <tbody>
                    {invoice.items.map((item, index) => (
                        <tr key={index}>
                            <td>{item.description}</td>
                            <td>{item.quantity}</td>
                            <td>{item.price}</td>
                            <td>{item.quantity * item.price}</td>
                        </tr>
                    ))}
                </tbody>
            </table>
            <div className="invoice-summary">
                <div className="invoice-subtotal">Subtotal: {invoice.subtotal}</div>
                <div className="invoice-tax">Tax: {invoice.tax}</div>
                <div className="invoice-total">Total: {invoice.total}</div>
            </div>
        </div>
    );
};

export default Invoice;