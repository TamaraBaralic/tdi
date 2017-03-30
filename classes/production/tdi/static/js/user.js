/**
 * Created by tamara on 27.3.17..
 */

var user = {
    init : function () {
        this.cacheDom();
        this.bindEvents();
    },
    cacheDom : function () {
        this.$btn = $('#createUser');
    },
    bindEvents : function () {
      this.$btn.on('click', this.submit);
    },
    submit : function () {

        var data = new FormData();

        data.append('username', $('#username').val());
        data.append('password', $('#password').val());

        $.ajax({
           type : 'POST',
            url : '/users/save',
            data : data,
            contentType : false,
            processData : false,
            success : function (data) {
                location.href = "http://localhost:8080/offers/allOffers";
            },
            error : function ()
                { console.log("error"); }
        });
    }
};

$(function () {
   user.init();
});