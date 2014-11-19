Ext.define('TGT.store.MatterStatusBreakdowns', {
	extend: 'Ext.data.Store',
	model: 'TGT.model.MatterStatusBreakdown',
	//storeId: 'mattersStatusBreakdownStore',
	proxy: {
        type: 'ajax',
        url: '/target-trak-web/homepage/getMatterStatusBreakdown.json',
        reader: {
            type: 'json',
            root: 'data'
        },
        listeners: {
            exception: function(proxy, response, operation){
                Ext.MessageBox.show({
                    title: 'Target Trak Error',
                    msg: 'Error getting chart data',
                    icon: Ext.MessageBox.ERROR,
                    buttons: Ext.Msg.OK
                });
            }
        }
    }
});
