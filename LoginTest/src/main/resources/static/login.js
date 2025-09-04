const id = $('#login_id');
const password = $('#login_password');

const btn = $('#login_btn');

btn.click((e) => {
	let r = {};
	
	$.ajax({
		url : '/login/test',
		data : JSON.stringify({login_id:id.val(), login_password:password.val()}),
		type : 'post',
		contentType : 'application/json',
		async : false
	}).done(function(result) {
		r = result;
	}).fail(function(xhr, status, errorThrown) {
		console.log("에러");
		console.log(xhr);
		console.log(status);
		console.log(errorThrown);
	});
	console.log(r);
	if(r.r == 's') {
		location.href="/login/success";
	}
});