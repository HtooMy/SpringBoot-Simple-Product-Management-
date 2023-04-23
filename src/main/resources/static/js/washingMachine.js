$('document').ready(function(){
	$('table #editButton').on('click', function(event){
		event.preventDefault();
		
		var href = $(this).attr('href');
		$.get(href, function(washingMachine, status){
			$('#idEdit').val(washingMachine.id);
			$('#nameEdit').val(washingMachine.productName);
			$('#modelEdit').val(washingMachine.productModel);
			$('#quantityEdit').val(washingMachine.productQuantity)
			$('#priceEdit').val(washingMachine.productPrice)
			$('#totalAmountEdit').val(washingMachine.totalAmount)
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



