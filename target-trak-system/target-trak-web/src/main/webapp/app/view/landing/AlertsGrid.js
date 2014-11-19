Ext.define('TGT.view.landing.AlertsGrid', {
    extend: 'Ext.grid.Panel',
    alias: 'widget.landing.alertsgrid',
    store: 'Alerts',
    loadMask: true,
    viewConfig: {
        enableTextSelection: true
    },
    columns: [
        {
            xtype:'actioncolumn',
            width: 65,
            align: 'center',
            items: [
                {
                	icon: '/target-trak-web/resources/icons/add.gif',  
                    tooltip: 'Warning',
                    align: 'center',
                    getClass: 'x-action-col-icon'
                }
            ]
        },
        {
            xtype: 'gridcolumn',
            dataIndex: 'alertType',
            text: 'Type',
            width: 100
        }, 
        {
            xtype: 'gridcolumn',
            dataIndex: 'alertDescription',
            text: 'Description',
            width: 350
        }
    ],
    dockedItems: [{
        xtype: 'pagingtoolbar',
        store: 'Alerts',   // same store GridPanel is using
        dock: 'bottom',
        displayInfo: true
    }],
});