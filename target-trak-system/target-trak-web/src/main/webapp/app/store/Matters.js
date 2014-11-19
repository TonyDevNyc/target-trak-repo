Ext.define('TGT.store.Matters', {
	extend: 'Ext.data.Store',
	model: 'TGT.model.Matter',
	//storeId: 'mattersStore',
	proxy: {
        type: 'ajax',
        url: '/target-trak-web/app/homepage/getMattersDue.json',
        reader: {
            type: 'json',
            root: 'data',
            idProperty: 'matterId',
            successProperty: 'success'
        },
        listeners: {
            exception: function(proxy, response, operation){
                Ext.MessageBox.show({
                    title: 'Target Trak Error',
                    msg: 'Error getting matters data',
                    icon: Ext.MessageBox.ERROR,
                    buttons: Ext.Msg.OK
                });
            }
        }
    }
});
