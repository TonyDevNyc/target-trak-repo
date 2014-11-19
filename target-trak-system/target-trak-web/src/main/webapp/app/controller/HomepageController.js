Ext.define('TGT.controller.HomepageController', {
	extend : 'TGT.controller.TargetTrakBaseController',
	
	stores : [ 'MatterStatusBreakdowns', 'Alerts', 'Matters'],

	models : [ 'MatterStatusBreakdown', 'Matter', 'Alert'],

	views : [ 'landing.Homepage', 'landing.MattersGrid', 'landing.AlertsGrid', 'landing.MatterStatusBreakdownChart' ],
	
	onLaunch : function() {
		var chartStore = this.getMatterStatusBreakdownsStore();
		chartStore.load();
		this.getAlertsStore().load();
		//this.getMattersStore().load();
	},
	
	init: function() {
    	var me = this;
        
    }

});