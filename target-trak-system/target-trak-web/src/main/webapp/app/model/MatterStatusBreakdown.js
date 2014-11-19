Ext.define('TGT.model.MatterStatusBreakdown', {
    extend: 'Ext.data.Model',
    fields:[
        {name: 'status', type: 'string'},
        {name: 'count', type: Ext.data.Types.INT},
        {name: 'percentage', type: 'string'},
        {name: 'label', type: 'string'}
    ]
});