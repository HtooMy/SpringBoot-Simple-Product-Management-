$('document').ready(function(){
	$('table #editButton').on('click', function(event){
		event.preventDefault();
		
		var href = $(this).attr('href');
		$.get(href, function(phone, status){
			$('#idEdit').val(phone.id);
			$('#nameEdit').val(phone.productName);
			$('#modelEdit').val(phone.productModel);
			$('#quantityEdit').val(phone.productQuantity)
			$('#priceEdit').val(phone.productPrice)
			$('#totalAmountEdit').val(phone.totalAmount)
		});
		
		$('#editModel').modal();
	});
	
	$('table #deleteButton').on('click', function(event){
		event.preventDefault();
		var href = $(this).attr('href');
		$('#confirmDeleteButton').attr('href', href);
		$('#deleteModel').modal();
	});
}); 



