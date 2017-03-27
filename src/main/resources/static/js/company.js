/**
 * Created by dusica on 27.3.17..
 */

var company = {
    init : function () {
        this.cacheDom();
        this.bindEvents();
    },
    cacheDom : function () {
        this.$btn = $('#submitButton');
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
