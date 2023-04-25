import 'bootstrap/dist/css/bootstrap.min.css';
import { useSelector } from 'react-redux';
// import Button from 'react-bootstrap/Button';
// import Container from 'react-bootstrap/Container';
// import Form from 'react-bootstrap/Form';
import Nav from 'react-bootstrap/Nav';
import Navbar from 'react-bootstrap/Navbar';
// import NavDropdown from 'react-bootstrap/NavDropdown';

import React from "react";
import { Container } from 'react-bootstrap';

function Footer() {
    return (
        <Container className="footer">
            <div className="box-container">
                <div className="box">
                    <h3>Quick links</h3>
                    <a className="link" href="/">
                        <i className="fa fa-arrow-right"></i> Home
                    </a>
                    <a className="link" href="/about">
                        <i className="fa fa-arrow-right"></i> About
                    </a>
                    <a className="link" href="/category">
                        <i className="fa fa-arrow-right"></i> Category
                    </a>
                    <a className="link" href="/contactus">
                        <i className="fa fa-arrow-right"></i> ContactUs
                    </a>
                    <a className="link" href="/contactus">
                        <i className="fa fa-arrow-right"></i> Message
                    </a>
                </div>

                <div className="box">
                    <h3>My Favorite</h3>
                    <a className="link" href="#">
                        <i className="fa fa-arrow-right"></i>My Favorites
                    </a>
                    <a className="link" href="#">
                        <i className="fa fa-arrow-right"></i>My Ordrs
                    </a>
                    <a className="link" href="#">
                        <i className="fa fa-arrow-right"></i>My Wishlists
                    </a>
                    <a className="link" href="#">
                        <i className="fa fa-arrow-right"></i>Privacy Policy
                    </a>
                    <a className="link" href="#">
                        <i className="fa fa-arrow-right"></i>Terms of use
                    </a>
                </div>
                
                <div className="box">
                    <h3>Newslatter</h3>
                    <p>Subscribe for latest updates</p>
                    <form action="">
                        <input type="email" name="" placeholder="Email address" id="" className="email" />
                        <input type="submit" value="subscribe" id="suscribe" className="Button" />
                    </form>
                    <div className="share">
                        <a href="#" className="fa fa-facebook-f"></a>
                        <a href="#" className="fa fa-twitter"></a>
                        <a href="#" className="fa fa-instagram"></a>
                        <a href="#" className="fa fa-linkedin"></a>
                    </div>
                </div>
            </div>
            <div className="credit">
                Designed by <span>DAC-Group TWO </span> || All Rights Reserved.
            </div>
        </Container>
    )
};

export default Footer;