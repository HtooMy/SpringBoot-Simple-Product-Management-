$('document').ready(function(){
	$('table #editButton').on('click', function(event){
		event.preventDefault();
		
		var href = $(this).attr('href');
		$.get(href, function(refrigerator, status){
			$('#idEdit').val(refrigerator.id);
			$('#nameEdit').val(refrigerator.productName);
			$('#modelEdit').val(refrigerator.productModel);
			$('#quantityEdit').val(refrigerator.productQuantity)
			$('#priceEdit').val(refrigerator.productPrice)
			$('#totalAmountEdit').val(refrigerator.totalAmount)
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



