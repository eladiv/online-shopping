$(function() {
	// solving the active menu
	switch (menu) {
	case 'Contact':
		$('#contact').addClass('active');
		break;
	case 'About Us':
		$('#about').addClass('active');
		break;
	case 'Show All Products':
		$('#listProducts').addClass('active');
		break;
	
	default:
		$('#listProducts').addClass('active');
		$('#a_'+menu).addClass('active');
		break;
	}

});