/**
 * Created by dusica on 27.3.17..
 */

var company = {
    init : function () {
        this.load();
        this.cacheDom();
        this.bindEvents();
    },
    cacheDom : function () {
        this.$btn = $('#submitButton');
    },
    load: function () {
        $.ajax({
            url : "/companies/getAllCompanies",
            contentType: false,
            processData: false,
            success : function (dat) {
                var companies = $("#activeCompanies").html("");

                companies.append("<tr><th>Name</th><th>Address</th><th>Telephone</th><th>Email</th></tr><tr>");

                for(var i = 0; i < dat.length; i++) {
                    companies.append("<tr><td><a href='/company/id=" + dat[i].id + "'>" + dat[i].name + "</a></td><td>" + dat[i].address +
                        "</td><td>" + dat[i].telephone + "</td><td>" + dat[i].email +"</td></tr>");
                }

            },
            error : function (dat) {
                console.log(dat);
            }
        });
    },
    bindEvents : function () {
        this.$btn.on("click", this.submit);
    },
    submit : function () {

        var data = new FormData();

        data.append('name', $('#companyName').val());
        data.append('address', $('#companyAddress').val());
        data.append('telephone', $('#companyTel').val());
        data.append('email', $('#companyMail').val());

        $.ajax({
            type : 'POST',
            url : "/companies/save",
            data : data,
            contentType: false,
            processData: false,
            success : function (dat) {
                console.log(dat);
            },
            error : function (dat) {
                console.log(dat);
            }
        });
    }
};

$(function() {
    company.init();
});
