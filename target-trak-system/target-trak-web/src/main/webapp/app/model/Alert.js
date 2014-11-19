Ext.define('TGT.model.Alert', {
    extend: 'Ext.data.Model',
    fields:[
        {name: 'alertId', type: Ext.data.Types.INT},
        {name: 'alertType', type: 'string'},
        {name: 'alertDescription', type: 'string'}
    ]
});