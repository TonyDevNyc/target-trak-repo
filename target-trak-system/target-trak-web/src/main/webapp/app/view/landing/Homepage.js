Ext.define('TGT.view.landing.Homepage', {
    extend: 'Ext.panel.Panel',
    alias: 'widget.landing.homepage',
    requires: [
        'Ext.layout.container.Table',
        'TGT.view.landing.MatterStatusBreakdownChart',
        'TGT.view.landing.AlertsGrid'
    ],
    items: [
        {
        	 xtype: 'container',
        	 layout: 'hbox',
        	 items: [
    	         {
    	        	 xtype: 'landing.matterstatuschart',
    	        	 flex: 1
    	        	 
    	         },
    	         {
    	        	 xtype: 'container',
    	        	 layout: 'fit',
    	        	 items: [
	        	         {
	        	        	 xtype: 'landing.alertsgrid'
	        	         }
        	         ],
    	        	 flex: 1
    	         }
	         ]
        },
        {
        	xtype: 'container',
        	layout: 'fit',
        	items: [
    	        {
    	        	xtype: 'landing.mattersgrid'
    	        }
	        ]
        
        }
    ]
});