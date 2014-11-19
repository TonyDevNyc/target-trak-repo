Ext.define('TGT.store.Alerts', {
	extend: 'Ext.data.Store',
	model: 'TGT.model.Alert',
	//storeId: 'alertsStore',
	proxy: {
        type: 'ajax',
        url: '/target-trak-web/homepage/getHomepageAlerts.json',
        reader: {
            type: 'json',
            root: 'data',
            idProperty: 'alertId',
            successProperty: 'success'
        },
        listeners: {
            exception: function(proxy, response, operation){
                Ext.MessageBox.show({
                    title: 'Target Trak Error',
                    msg: 'Error getting alerts data',
                    icon: Ext.MessageBox.ERROR,
                    buttons: Ext.Msg.OK
                });
            }
        }
    }
});
