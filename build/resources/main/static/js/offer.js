var user = {
    init : function () {
        this.fillTable();
    },
    fillTable : function () {

        $.ajax({
            url : '/offers/allOffers',
            contentType: false,
            processData: false,
            success : function (dat) {
                var offers = $("#allOffers").html("");

                offers.append("<tr><th>Title</th><th>Description</th><tr>");

                for(var i = 0; i < dat.length; i++) {
                    var id = i + 1;
                    offers.append("<tr><td><a href='/offers/" + id + "'>" + dat[i].title + "</a></td><td>" + dat[i].description +
                        "</td></tr>");
                }
            },
            error : function ()
            { console.log("error"); }
        });
    }
};

$(function () {
    user.init();
});