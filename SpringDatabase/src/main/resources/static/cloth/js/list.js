const modi_btns = document.querySelectorAll(".modi_btn");
const del_btns = document.querySelectorAll(".del_btn");

modi_btns.forEach(modi_btn => {
	modi_btn.addEventListener('click', modifyEvent)
});

del_btns.forEach(del_btn => {
	del_btn.addEventListener('click', deleteEvent)
});

function modifyEvent(e) {
	console.log("수정 버트 클릭함! - ", e.target);
	
	location.href=`./modify?cloth_id=${e.target.dataset.id}`;
}

function deleteEvent(e) {
	console.log("삭제버튼 클릭함! - ", e.target);
	
	// 해당 태그의 data-* 어트리뷰트에 원하는 값을 보과해놓으면 dataset으로 접근하여 꺼낼 수 있다
	console.log("삭제해야 하는 상품의 ID: ", e.target.dataset.id);
	
	// 1. Query String (GET 방식 요청)
	// location.href=`./delete?cloth_id=${e.target.dataset.id}`;
	
	// 2. form 사용하기 (GET/POST 방식 요청)
	e.target.nextElementSibling.submit(); // 이 버튼의 바로 다음 요소를 선택해서 submit() 해버리기
}