Ext.define('TGT.view.landing.MatterStatusBreakdownChart', {
    extend: 'Ext.chart.Chart',
    alias: 'widget.landing.matterstatuschart',
    requires: [
	    'Ext.chart.Chart'
    ],
    width: 350,
    height: 250,
    store: 'MatterStatusBreakdowns',
    series: [
        {
        	type: 'pie',
        	angleField: 'count',
        	showInLegend: false,
        	tips: {
        		trackMouse: true,
                width: 140,
                height: 28,
                renderer: function(storeItem, item) {
                	this.setTitle(storeItem.get('label') +': '+ storeItem.get('percentage'));
                }
        	},
        	highlight: {
                segment: {
                    margin: 20
                }
            },
        	label: {
        		field: 'label',
                display: 'rotate',
                contrast: true,
                font: '10px Arial',
                hideLessThan: 5
        	}
        }
    ]
});