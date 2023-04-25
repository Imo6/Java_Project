import React from 'react';
import Button from 'react-bootstrap/Button';

const ContactUs = () => {
    return (
        <div className="contact3 py-5">
            <div className="row no-gutters">
                <div className="container">
                    <div className="row">
                        <div className="col-lg-4">
                            <div className="card-shadow">
                                <img src="../images/contactus3.png" className="img-fluid" alt="contact" />
                            </div>
                        </div>
                        <div className="col-lg-6">
                            <div className="contact-box ml-3">
                                <h1 className="font-weight-light mt-2">Quick Contact</h1>
                                <form className="mt-4">
                                    <div className="row">
                                        <div className="col-lg-12">
                                            <div className="form-group mt-2">
                                                <input className="form-control" type="text" placeholder="name" />
                                            </div>
                                        </div>
                                        <div className="col-lg-12">
                                            <div className="form-group mt-2">
                                                <input className="form-control" type="email" placeholder="email address" />
                                            </div>
                                        </div>
                                        <div className="col-lg-12">
                                            <div className="form-group mt-2">
                                                <input className="form-control" type="text" placeholder="phone" />
                                            </div>
                                        </div>
                                        <div className="col-lg-12">
                                            <div className="form-group mt-2">
                                                <textarea className="form-control" rows="3" placeholder="message"></textarea>
                                            </div>
                                        </div>
                                        <div className="col-lg-12">
                                            <Button  className="Button mt-3 px-3 py-2"> SUBMIT</Button>
                                        </div>
                                    </div>
                                </form>
                            </div>
                        </div>
                        <div className="col-lg-12">
                            <div className="card mt-4 border-0 mb-4">
                                <div className="row">
                                    <div className="col-lg-4 col-md-4">
                                        <div className="card-body d-flex align-items-center c-detail pl-0">
                                            <div className="mr-3 align-self-center">
                                                <img src="https://www.wrappixel.com/demos/ui-kit/wrapkit/assets/images/contact/icon1.png" alt="address" />
                                            </div>
                                            <div className="">
                                                <h6 className="font-weight-medium">Address</h6>
                                                <p className="">VITA DAC 
                                                    <br />Juhu Mumbai</p>
                                            </div>
                                        </div>
                                    </div>
                                    <div className="col-lg-4 col-md-4">
                                        <div className="card-body d-flex align-items-center c-detail">
                                            <div className="mr-3 align-self-center">
                                                <img src="https://www.wrappixel.com/demos/ui-kit/wrapkit/assets/images/contact/icon2.png" alt="phone" />
                                            </div>
                                            <div className="">
                                                <h6 className="font-weight-medium">Phone</h6>
                                                <p className="">+111-222-333
                                                    <br /> +111-222-333</p>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-4 col-md-4">
                                        <div class="card-body d-flex align-items-center c-detail">
                                            <div class="mr-3 align-self-center">
                                                <img src="https://www.wrappixel.com/demos/ui-kit/wrapkit/assets/images/contact/icon3.png"/>
                                            </div>
                                            <div class="">
                                                <h6 class="font-weight-medium">Email</h6>
                                                <p class="">
                                                    shopaholic@gmail.com
                                                    
                                                </p>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

    )

};

export default ContactUs;