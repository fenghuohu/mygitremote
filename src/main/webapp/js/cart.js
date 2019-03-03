$(function(){
	
	/*按加号数量增*/
	function add(){
		
		var n=parseInt($(this).prev().val());
		
		$(this).prev().val(n+1);
		calcTotal();
	}
	/*按减号数量减*/
	function reduce(){
		var n=parseInt($(this).next().val());
		if(n==0)
			return;
		$(this).next().val(n-1);
		
		calcTotal();
	}
	/*全选全不选*/
	function checkAll(){
		
		$(".ckitem").prop("checked",$(this).prop("checked"));
		
		calcTotal();
	}
	
	//单选一个也得算价格
	function check(){
		
		calcTotal();
		
	}
	
})


//计算价格的方法
function calcTotal(){
	//选中商品的数量
	var vselectCount=0;
	//选中商品的总价
	var vselectTotal=0;
	
	//循环遍历所有tr
	for(var i=0;i<$(".cart-body tr").length;i++){
		//计算每个商品的价格小计开始
		//取出1行
		var $tr=$($(".cart-body tr")[i]);
		//取单价
		var vprice=parseFloat($tr.children(":eq(3)").children("span").html());
		//取数量
		var vnum=parseFloat($tr.children(":eq(4)").children(".num-text").val());
		//小计金额
		var vtotal=vprice*vnum;
		//赋值
		$tr.children(":eq(5)").children("span").html("¥"+vtotal);
		//计算每个商品的价格小计结束
		
		//检查是否选中
		if($tr.children(":eq(0)").children(".ckitem").prop("checked")){
			//计数
			vselectCount++;
			//计总价
			vselectTotal+=vtotal;
			
			
		}
		
		//将选中的数量和价格赋值
		$("#selectTotal").html(vselectTotal);
		$("#selectCount").html(vselectCount);		
	}
	
	$(".link-account").click(function(){
		
		location.href="orderConfirm.html";
	})
	
}















