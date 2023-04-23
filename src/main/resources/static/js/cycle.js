$('document').ready(function(){
	$('table #editButton').on('click', function(event){
		event.preventDefault();
		
		var href = $(this).attr('href');
		$.get(href, function(cycle, status){
			$('#idEdit').val(cycle.id);
			$('#nameEdit').val(cycle.productName);
			$('#modelEdit').val(cycle.productModel);
			$('#quantityEdit').val(cycle.productQuantity)
			$('#priceEdit').val(cycle.productPrice)
			$('#totalAmountEdit').val(cycle.totalAmount)
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



