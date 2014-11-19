Ext.define('TGT.view.landing.MattersGrid', {
    extend: 'Ext.grid.Panel',
    alias: 'widget.landing.mattersgrid',
    store: 'Matters',
    viewConfig: {
        enableTextSelection: true
    },
    columns: [
		{
		    xtype: 'gridcolumn',
		    dataIndex: 'matterId',
		    text: 'ID',
		    width: 75
		},
        {
            xtype: 'gridcolumn',
            dataIndex: 'matterType',
            text: 'Type',
            width: 100
        }, 
        {
            xtype: 'gridcolumn',
            dataIndex: 'primaryContact',
            text: 'Primary Contact',
            width: 250
        }, 
        {
            xtype: 'gridcolumn',
            dataIndex: 'primaryContactCompany',
            text: 'Company',
            width: 250
        }, 
        {
            xtype: 'gridcolumn',
            dataIndex: 'matterStatus',
            text: 'Status',
            width: 150
        }, 
        {
            xtype: 'gridcolumn',
            dataIndex: 'serviceLevelAgreementDate',
            text: 'SLA Date',
            width: 150
        }, 
        {
            xtype: 'gridcolumn',
            dataIndex: 'lastUpdatedDate',
            text: 'Last Updated Date',
            width: 200
        }
    ]
});