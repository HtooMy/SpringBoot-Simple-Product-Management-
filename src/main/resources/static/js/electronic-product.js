$('document').ready(function(){
	$('table #editButton').on('click', function(event){
		event.preventDefault();
		
		var href = $(this).attr('href');
		$.get(href, function(electronicProduct, status){
			$('#idEdit').val(electronicProduct.id);
			$('#nameEdit').val(electronicProduct.productName);
			$('#modelEdit').val(electronicProduct.productModel);
			$('#quantityEdit').val(electronicProduct.productQuantity)
			$('#priceEdit').val(electronicProduct.productPrice)
			$('#totalAmountEdit').val(electronicProduct.totalAmount)
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



