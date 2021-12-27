$(document).ready(
    function() {

        // SUBMIT FORM
        $("#login100-form").submit(function(event) { //$(get ID from submit form)
            // Prevent the form from submitting via the browser.
            event.preventDefault();
            ajaxPost();
        });

        function ajaxPost() {

            // PREPARE FORM DATA
            var formData = {
                accountName : $("#bookId").val(),
                accountPassword: $("#bookName").val(),
            }

            // DO POST
            $.ajax({
                type : "POST",
                contentType : "application/json",
                url : "register",
                data : JSON.stringify(formData),
                dataType : 'json',
                success : function(result) {
                    if (result.status == "success") {
                        $("#postResultDiv").html(
                            "" + result.data.bookName
                            + "Post Successfully! <br>"
                            + "---> Congrats !!" + "</p>");
                    } else {
                        $("#postResultDiv").html("<strong>Error</strong>");
                    }
                    console.log(result);
                },
                error : function(e) {
                    alert("Error!")
                    console.log("ERROR: ", e);
                }
            });

        }

    })